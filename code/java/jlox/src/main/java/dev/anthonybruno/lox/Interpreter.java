package dev.anthonybruno.lox;

import java.util.Objects;

public class Interpreter {

  enum Result {
    SUCCESS,
    ERROR
  }

  Result interpret(Expr expr) {
    try {
      var value = evaluate(expr);
      System.out.println(stringify(value));
      return Result.SUCCESS;
    } catch (RuntimeError e) {
      ErrorReporter.runtimeError(e);
      return Result.ERROR;
    }
  }

  Object evaluate(Expr expr) {
    return switch (expr) {
      case Expr.Binary binary -> binary(binary);
      case Expr.Grouping grouping -> evaluate(grouping.expression());
      case Expr.Literal literal -> literal.value();
      case Expr.Unary unary -> {
        var right = evaluate(unary.right());
        yield switch (unary.operator().type()) {
          case BANG -> !isTruthy(right);
          case MINUS -> {
            checkNumberOperand(unary.operator(), right);
            yield -(double) right;
          }
          default -> throw new IllegalStateException("unreachable");
        };
      }
    };
  }

  private Object binary(Expr.Binary binary) {
    var left = evaluate(binary.left());
    var right = evaluate(binary.right());

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
