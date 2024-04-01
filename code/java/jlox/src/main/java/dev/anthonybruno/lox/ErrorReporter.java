package dev.anthonybruno.lox;

public class ErrorReporter {

  static void error(int line, String message) {
    report(line, "", message);
  }

  static void error(Token token, String message) {
    if (token.type() == TokenType.EOF) {
      report(token.line(), " at end", message);
    } else {
      report(token.line(), STR." at '\{token.lexeme()}'", message);
    }
  }

  private static void report(int line, String where, String message) {
    System.err.println(STR."[line \{line}] Error \{where}: \{message}");
  }

}
