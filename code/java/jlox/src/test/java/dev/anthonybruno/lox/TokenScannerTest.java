package dev.anthonybruno.lox;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TokenScannerTest {

  @Test
  void scansString() {
    var scanner = new TokenScanner("\"Hello\"");

    assertThat(scanner.scanTokens()).containsExactly(
      new Token(TokenType.STRING, "\"Hello\"", "Hello", 1),
      new Token(TokenType.EOF, "", null , 1)
    );
  }

  @Test
  void scansWithMultilineComment() {
    var scanner = new TokenScanner("""
      /* 
       * Multiline comment 
       */
       1
      """);

    assertThat(scanner.scanTokens()).containsExactly(
      new Token(TokenType.NUMBER, "1", 1.0, 4),
      new Token(TokenType.EOF, "", null , 5)
    );
  }

  @Test
  void scansPlusExpression() {
    var scanner = new TokenScanner("1 + 1");

    assertThat(scanner.scanTokens()).containsExactly(
      new Token(TokenType.NUMBER, "1", 1.0, 1),
      new Token(TokenType.PLUS, "+", null, 1),
      new Token(TokenType.NUMBER, "1", 1.0, 1),
      new Token(TokenType.EOF, "", null , 1)
    );
    assertThat(scanner.hadError()).isFalse();
  }
}
