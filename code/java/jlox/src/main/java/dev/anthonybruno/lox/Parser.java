package dev.anthonybruno.lox;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

import static dev.anthonybruno.lox.TokenType.*;

/**
 * <pre>
 * program        -> declaration* EOF;
 * declaration    -> varDecl | statement;
 * varDecl        -> "var" IDENTIFIER ( "=" expression )? ";";
 * statement      -> exprStmt | ifStmt | printStmt;
 * exprStmt       -> expression ";";
 * ifStmt         -> "if" "(" expression ")" statement ( "else" statement )? ;
 * printStmt       -> "print" expression ";";
 *
 * expression     -> assignment;
 * assignment     -> IDENTIFIER "=" assignment | equality;
 * equality       -> comparison ( ( "!=" | "==" ) comparison )* ;
 * comparison     -> term ( ( ">" | ">=" | "<" | "<=" ) term )* ;
 * term           -> factor ( ( "-" | "+" ) factor )* ;
 * factor         -> unary ( ( "/" | "*" ) unary )* ;
 * unary          -> ( "!" | "-" ) unary
 *                | primary ;
 * primary        -> NUMBER | STRING | "true" | "false" | "nil"
 *                | "(" expression ")" | IDENTIFIER ;
 * </pre>
 */
public class Parser {

  private static class ParseError extends RuntimeException {
  }

  private final List<Token> tokens;
  private int current = 0;
  private boolean hadError = false;

  public Parser(List<Token> tokens) {
    this.tokens = tokens;
  }

  List<Stmt> parse() {
    var statements = new ArrayList<Stmt>();
    while (!isAtEnd()) {
      statements.add(declaration());
    }
    return statements;
  }

  @Nullable
  private Stmt declaration() {
    try {
      if (match(VAR)) {
        return varDeclaration();
      }
      return statement();
    } catch (ParseError e) {
      synchronize();
      return null;
    }
  }

  private Stmt statement() {
    if (match(IF)) return ifStatement();
    if (match(PRINT)) return printStatement();
    if (match(LEFT_BRACE)) return new Stmt.Block(block());

    return expressionStatement();
  }

  private Stmt ifStatement() {
    consume(LEFT_PAREN, "Expect '(' after if.");
    var condition = expression();
    consume(RIGHT_PAREN, "Expect ')' after if condition.");

    var leftBranch = statement();
    var elseBranch = match(ELSE) ? statement() : null;

    return new Stmt.If(condition, leftBranch, elseBranch);
  }

  private Stmt printStatement() {
    var value = expression();
    consume(SEMICOLON, "Expect ';' after value");
    return new Stmt.Print(value);
  }

  private Stmt varDeclaration() {
    var name = consume(IDENTIFIER, "Expect variable name");

    Expr initializer = null;
    if (match(EQUAL)) {
      initializer = expression();
    }

    consume(SEMICOLON, "Expect ';' after variable declaration");
    return new Stmt.Var(name, initializer);
  }

  private Stmt expressionStatement() {
    var expr = expression();
    consume(SEMICOLON, "Expect ';' after expression.");
    return new Stmt.Expression(expr);
  }

  private List<Stmt> block() {
    var statements = new ArrayList<Stmt>();

    while (!check(RIGHT_BRACE) && !isAtEnd()) {
      statements.add(declaration());
    }
    consume(RIGHT_BRACE, "Expect '}' after block");
    return statements;
  }

  private Expr expression() {
    return assignment();
  }

  private Expr assignment() {
    var expr = equality();

    if (match(EQUAL)) {
      var equals = previous();
      var value = assignment();

      if (expr instanceof Expr.Variable var) {
        var name = var.name();
        return new Expr.Assign(name, value);
      }

      error(equals, "Invalid assignment target");
    }
    return expr;
  }

  private Expr equality() {
    var expr = comparison();

    while (match(BANG_EQUAL, EQUAL_EQUAL)) {
      var operator = previous();
      var right = comparison();
      expr = new Expr.Binary(expr, operator, right);
    }
    return expr;
  }


  private Expr comparison() {
    var expr = term();

    while (match(GREATER, GREATER_EQUAL, LESS_EQUAL)) {
      var operator = previous();
      var right = term();
      expr = new Expr.Binary(expr, operator, right);
    }
    return expr;
  }

  private Expr term() {
    var expr = factor();

    while (match(MINUS, PLUS)) {
      var operator = previous();
      var right = factor();
      expr = new Expr.Binary(expr, operator, right);
    }

    return expr;
  }

  private Expr factor() {
    var expr = unary();

    while (match(SLASH, STAR)) {
      var operator = previous();
      var right = unary();
      expr = new Expr.Binary(expr, operator, right);
    }

    return expr;
  }

  private Expr unary() {
    if (match(BANG, MINUS)) {
      var operator = previous();
      var right = unary();
      return new Expr.Unary(operator, right);
    }
    return primary();
  }

  private Expr primary() {
    if (match(FALSE)) return new Expr.Literal(false);
    if (match(TRUE)) return new Expr.Literal(true);
    if (match(NIL)) return new Expr.Literal(null);

    if (match(NUMBER, STRING)) {
      return new Expr.Literal(previous().literal());
    }

    if (match(IDENTIFIER)) {
      return new Expr.Variable(previous());
    }

    if (match(LEFT_PAREN)) {
      Expr expr = expression();
      consume(RIGHT_PAREN, "Expect ')' after expression.");
      return new Expr.Grouping(expr);
    }
    throw error(peek(), "Expect expression.");
  }


  private boolean match(TokenType... types) {
    for (var type : types) {
      if (check(type)) {
        advance();
        return true;
      }
    }
    return false;
  }

  private Token consume(TokenType type, String message) {
    if (check(type)) {
      return advance();
    }

    throw error(peek(), message);
  }

  private ParseError error(Token token, String message) {
    hadError = true;
    ErrorReporter.error(token, message);
    return new ParseError();
  }

  private void synchronize() {
    advance();

    while (!isAtEnd()) {
      if (previous().type() == SEMICOLON) return;

      switch (peek().type()) {
        case CLASS:
        case FUN:
        case VAR:
        case FOR:
        case IF:
        case WHILE:
        case PRINT:
        case RETURN:
          return;
      }

      advance();
    }
  }


  private boolean check(TokenType type) {
    if (isAtEnd()) {
      return false;
    }
    return peek().type() == type;
  }

  private Token advance() {
    if (!isAtEnd()) {
      current++;
    }
    return previous();
  }

  private boolean isAtEnd() {
    return peek().type() == TokenType.EOF;
  }

  private Token peek() {
    return tokens.get(current);
  }

  private Token previous() {
    return tokens.get(current - 1);
  }

  public boolean hadError() {
    return hadError;
  }
}
