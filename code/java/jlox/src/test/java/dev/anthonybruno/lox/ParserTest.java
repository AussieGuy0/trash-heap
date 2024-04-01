package dev.anthonybruno.lox;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTest {

  @Test
  void parsesNumber() {
    var expr = parse(
      new Token(TokenType.NUMBER, "1", 1.0, 1),
      eofToken(1)
    );
    assertThat(expr).isEqualTo(new Expr.Literal(1.0));
  }

  @Test
  void parsesGroup() {
    var expr = parse(
      new Token(TokenType.LEFT_PAREN, "(", null, 1),
      new Token(TokenType.NUMBER, "1", 1.0, 1),
      new Token(TokenType.RIGHT_PAREN, ")", null, 1),
      eofToken(1)
    );
    assertThat(expr).isEqualTo(new Expr.Grouping(new Expr.Literal(1.0)));
  }

  @Test
  void parseBinary() {
    var operator = new Token(TokenType.PLUS, "+", null, 1);
    var expr = parse(
      new Token(TokenType.NUMBER, "1", 1.0, 1),
      operator,
      new Token(TokenType.NUMBER, "2", 2.0, 1),
      eofToken(1)
    );
    assertThat(expr).isEqualTo(new Expr.Binary(
      new Expr.Literal(1.0), operator, new Expr.Literal(2.0)));
  }

  @Test
  void parsesNegation() {
    var operator = new Token(TokenType.MINUS, "-", null, 1);
    var expr = parse(
      operator,
      new Token(TokenType.NUMBER, "1", 1.0, 1),
      eofToken(1)
    );
    assertThat(expr).isEqualTo(new Expr.Unary(operator, new Expr.Literal(1.0)));
  }

  private Expr parse(Token... tokens) {
    return new Parser(List.of(tokens)).parse();
  }

  private Token eofToken(int line) {
    return new Token(TokenType.EOF, null, null, line);
  }
}
