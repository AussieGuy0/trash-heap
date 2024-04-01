package dev.anthonybruno.lox;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterpreterTest {

  private final Interpreter interpreter = new Interpreter();

  @Test
  void evaluatesAddition() {
    var evaluated = interpreter.evaluate(
      new Expr.Binary(
        new Expr.Literal(1.0),
        new Token(TokenType.PLUS, "+", null, 1),
        new Expr.Literal(1.0)
      )
    );
    assertThat(evaluated).isEqualTo(2.0);
  }

}
