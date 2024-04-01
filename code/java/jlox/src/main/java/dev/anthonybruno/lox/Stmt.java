package dev.anthonybruno.lox;

import java.util.List;

public sealed interface Stmt permits Stmt.Block, Stmt.Expression, Stmt.Print, Stmt.Var {
  record Block(List<Stmt> statements) implements Stmt {}
  record Expression(Expr expression) implements Stmt {}
  record Print(Expr expression) implements Stmt {}
  record Var(Token name, Expr initializer) implements Stmt {}
}
