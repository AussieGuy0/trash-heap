package dev.anthonybruno.lox;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class Interpreter {
  private final Environment globalEnvironment = new Environment();

  enum Result {
    SUCCESS,
    ERROR
  }

  Result interpret(List<Stmt> statements) {
    try {
      statements.forEach((stmt -> execute(stmt, globalEnvironment)));
      return Result.SUCCESS;
    } catch (RuntimeError e) {
      ErrorReporter.runtimeError(e);
      return Result.ERROR;
    }
  }

  // Using Void return to allow for switch expression.
  @Nullable
  private Void execute(Stmt stmt, Environment environment) {
    return switch (stmt) {
      case Stmt.Expression expression -> {
        evaluate(expression.expression(), environment);
        yield null;
      }
      case Stmt.Print print -> {
        var value = evaluate(print.expression(), environment);
        System.out.println(stringify(value));
        yield null;
      }
      case Stmt.Var var -> {
         Object value = null;
        if (var.initializer() != null) {
          value = evaluate(var.initializer(), environment);
        }
        environment.define(var.name().lexeme(), value);
        yield null;
      }
      case Stmt.Block block -> {
        var newEnvironment = new Environment(environment);
        block.statements().forEach(blockStmt -> execute(blockStmt, newEnvironment));
        yield null;
      }
    };
  }

  private void executeBlock(List<Stmt> statements, Environment environment) {
  }

  private Object evaluate(Expr expr, Environment environment) {
    return switch (expr) {
      case Expr.Binary binary -> binary(binary, environment);
      case Expr.Grouping grouping -> evaluate(grouping.expression(), environment);
      case Expr.Literal literal -> literal.value();
      case Expr.Unary unary -> {
        var right = evaluate(unary.right(), environment);
        yield switch (unary.operator().type()) {
          case BANG -> !isTruthy(right);
          case MINUS -> {
            checkNumberOperand(unary.operator(), right);
            yield -(double) right;
          }
          default -> throw new IllegalStateException("unreachable");
        };
      }
      case Expr.Variable variable -> environment.get(variable.name());
      case Expr.Assign assign -> {
        var value = evaluate(assign.value(), environment);
        environment.assign(assign.name(), value);
        yield value;
      }
    };
  }

  private Object binary(Expr.Binary binary, Environment environment) {
    var left = evaluate(binary.left(), environment);
    var right = evaluate(binary.right(), environment);

    return switch (binary.operator().type()) {
      case GREATER -> {
        checkNumberOperands(binary.operator(), left, right);
        yield (double) left > (double) right;
      }
      case GREATER_EQUAL -> {
        checkNumberOperands(binary.operator(), left, right);
        yield (double) left >= (double) right;
      }
      case LESS -> {
        checkNumberOperands(binary.operator(), left, right);
        yield (double) left < (double) right;
      }
      case LESS_EQUAL -> {
        checkNumberOperands(binary.operator(), left, right);
        yield (double) left <= (double) right;
      }
      case BANG_EQUAL -> !isEqual(left, right);
      case EQUAL -> isEqual(left, right);
      case MINUS -> {
        checkNumberOperands(binary.operator(), left, right);
        yield (double) left - (double) right;
      }
      case PLUS -> {
        if (left instanceof Double leftDouble && right instanceof Double rightDouble) {
          yield leftDouble + rightDouble;
        }
        if (left instanceof String leftString && right instanceof String rightString) {
          yield leftString + rightString;
        }
        if (left instanceof String || right instanceof String) {
          yield stringify(left) + stringify(right);
        }
        throw new RuntimeError(binary.operator(), "Operands must be of the same type");
      }
      case SLASH -> {
        checkNumberOperands(binary.operator(), left, right);
        if ((double) right == 0) {
          throw new RuntimeError(binary.operator(), "Divide by 0");
        }
        yield (double) left / (double) right;
      }
      case STAR -> {
        checkNumberOperands(binary.operator(), left, right);
        yield (double) left * (double) right;
      }
      case COMMA -> right;
      default -> throw new IllegalStateException("unreachable");
    };
  }

  private void checkNumberOperand(Token operator, Object operand) {
    if (operand instanceof Double) {
      return;
    }
    throw new RuntimeError(operator, "Operand must be a number.");
  }

  private void checkNumberOperands(Token operator,
                                   Object left, Object right) {
    if (left instanceof Double && right instanceof Double) {
      return;
    }
    throw new RuntimeError(operator, "Operands must be numbers.");
  }

  private boolean isEqual(Object a, Object b) {
    return Objects.equals(a, b);
  }

  private boolean isTruthy(Object value) {
    return switch (value) {
      case null -> false;
      case Boolean bool -> bool;
      default -> true;
    };
  }

  private String stringify(Object object) {
    if (object == null) return "nil";

    if (object instanceof Double) {
      String text = object.toString();
      if (text.endsWith(".0")) {
        text = text.substring(0, text.length() - 2);
      }
      return text;
    }

    return object.toString();
  }


}
