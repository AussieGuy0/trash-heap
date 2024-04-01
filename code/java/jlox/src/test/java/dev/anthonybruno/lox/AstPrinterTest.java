package dev.anthonybruno.lox;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AstPrinterTest {

  private AstPrinter printer;

  @BeforeEach
  public void setUp() {
    printer = new AstPrinter();
  }


  @Test
  public void printsBinary() {
    var expression = new Expr.Binary(
      new Expr.Unary(
        new Token(TokenType.MINUS, "-", null, 1),
        new Expr.Literal(123)),
      new Token(TokenType.STAR, "*", null, 1),
      new Expr.Grouping(
        new Expr.Literal(45.67)));

    assertThat(printer.print(expression)).isEqualTo("(* (- 123) (group 45.67))");
  }
}
