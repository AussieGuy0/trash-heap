package dev.anthonybruno.lox;

public sealed interface Stmt permits Stmt.Expression, Stmt.Print {
  record Expression(Expr expression) implements Stmt {}
  record Print(Expr expression) implements Stmt {}
}
