package dev.anthonybruno.lox;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static dev.anthonybruno.lox.TokenType.*;

public class TokenScanner {
  private static final Map<String, TokenType> keywords = Map.ofEntries(
    Map.entry("and", AND),
    Map.entry("class", CLASS),
    Map.entry("else", ELSE),
    Map.entry("false", FALSE),
    Map.entry("for", FOR),
    Map.entry("fun", FUN),
    Map.entry("if", IF),
    Map.entry("nil", NIL),
    Map.entry("or", OR),
    Map.entry("print", PRINT),
    Map.entry("return", RETURN),
    Map.entry("super", SUPER),
    Map.entry("this", THIS),
    Map.entry("true", TRUE),
    Map.entry("var", VAR),
    Map.entry("while", WHILE)
  );
  private final String source;
  private final List<Token> tokens = new ArrayList<>();

  private int start = 0;
  private int current = 0;
  private int line = 1;
  private boolean hadError = false;

  public TokenScanner(String source) {
    this.source = source;
  }

  List<Token> scanTokens() {
    while (!isAtEnd()) {
      start = current;
      scanToken();
    }

    tokens.add(new Token(EOF, "", null, line));
    return tokens;
  }

  boolean hadError() {
    return hadError;
  }

  private void scanToken() {
    var c = advance();
    var token = readToken(c);
    if (token != null) {
      addToken(token);
    }
  }

  @Nullable
  private Token readToken(Character c) {
    return switch (c) {
      case '(' -> createToken(LEFT_PAREN);
      case ')' -> createToken(RIGHT_PAREN);
      case '{' -> createToken(LEFT_BRACE);
      case '}' -> createToken(RIGHT_BRACE);
      case ',' -> createToken(COMMA);
      case '.' -> createToken(DOT);
      case '-' -> createToken(MINUS);
      case '+' -> createToken(PLUS);
      case ';' -> createToken(SEMICOLON);
      case '*' -> createToken(STAR);
      case '!' -> createToken(match('=') ? BANG_EQUAL : BANG);
      case '=' -> createToken(match('=') ? EQUAL_EQUAL : EQUAL);
      case '<' -> createToken(match('=') ? LESS_EQUAL : LESS);
      case '>' -> createToken(match('=') ? GREATER_EQUAL : GREATER);
      case '/' -> {
        if (match('/')) {
          // Is comment.
          while (peek() != '\n' && !isAtEnd()) {
            advance();
          }
          yield null;
        } else if (match('*')) {
          // Multiline comment
          multiLineComment();
          yield null;
        } else {
          yield createToken(SLASH);
        }
      }
      // Ignore whitespace.
      case ' ', '\r', '\t' -> null;
      case '\n' -> {
        line++;
        yield null;
      }
      case '"' -> string();
      case Character digit when isDigit(digit) -> number();
      case Character alpha when isAlpha(alpha) -> identifier();
      default -> {
        ErrorReporter.error(line, STR."Unexpected character '\{c}'");
        hadError = true;
        yield null;
      }
    };
  }

  private void multiLineComment() {
    while (true) {
      if (isAtEnd()) {
        return;
      }
      if (peek() == '*' && peekNext() == '/') {
        advance();
        advance();
        return;
      }
      if (peek() == '\n') {
        line++;
      }
      advance();
    }

  }

  private Token identifier() {
    while (isAlphaNumeric(peek())) {
      advance();
    }
    var text = source.substring(start, current);
    var type = keywords.getOrDefault(text, IDENTIFIER);
    return createToken(type);
  }

  private Token number() {
    while (isDigit(peek())) {
      advance();
    }

    // Look for a fractional part.
    if (peek() == '.' && isDigit(peekNext())) {
      // Consume the "."
      advance();

      while (isDigit(peek())) {
        advance();
      }
    }

    return createToken(NUMBER,
      Double.parseDouble(source.substring(start, current)));
  }

  @Nullable
  private Token string() {
    while (peek() != '"' && !isAtEnd()) {
      if (peek() == '\n') line++;
      advance();
    }

    if (isAtEnd()) {
      ErrorReporter.error(line, "Unterminated string.");
      return null;
    }

    // The closing ".
    advance();

    // Trim the surrounding quotes.
    String value = source.substring(start + 1, current - 1);
    return createToken(STRING, value);
  }

  private boolean match(char expected) {
    if (isAtEnd()) return false;
    if (source.charAt(current) != expected) return false;

    current++;
    return true;
  }

  private char peek() {
    if (isAtEnd()) return '\0';
    return source.charAt(current);
  }

  private char peekNext() {
    if (current + 1 >= source.length()) return '\0';
    return source.charAt(current + 1);
  }

  private boolean isDigit(char c) {
    return c >= '0' && c <= '9';
  }

  private boolean isAlpha(char c) {
    return (c >= 'a' && c <= 'z') ||
      (c >= 'A' && c <= 'Z') ||
      c == '_';
  }

  private boolean isAlphaNumeric(char c) {
    return isAlpha(c) || isDigit(c);
  }

  private char advance() {
    return source.charAt(current++);
  }

  private Token createToken(TokenType tokenType) {
    return createToken(tokenType, null);
  }

  private Token createToken(TokenType tokenType, Object literal) {
    var text = source.substring(start, current);
    return new Token(tokenType, text, literal, line);
  }

  private void addToken(Token token) {
    tokens.add(token);
  }

  private boolean isAtEnd() {
    return current >= source.length();
  }
}
