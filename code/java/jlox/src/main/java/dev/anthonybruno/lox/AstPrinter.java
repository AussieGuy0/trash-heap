package dev.anthonybruno.lox;

public class AstPrinter {

  String print(Expr expr) {
    return switch (expr) {
      case Expr.Binary binary -> parenthesize(binary.operator().lexeme(), binary.left(), binary.right());
      case Expr.Grouping grouping -> parenthesize("group", grouping.expression());
      case Expr.Literal literal -> literal.value() == null ? "nil" : literal.value().toString();
      case Expr.Unary unary -> parenthesize(unary.operator().lexeme(),  unary.right());
    };
  }

  private String parenthesize(String name, Expr... exprs) {
    StringBuilder builder = new StringBuilder();

    builder.append("(").append(name);
    for (Expr expr : exprs) {
      builder.append(" ");
      builder.append(print(expr));
    }
    builder.append(")");

    return builder.toString();
  }
}
