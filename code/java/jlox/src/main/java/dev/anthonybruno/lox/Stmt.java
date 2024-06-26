package dev.anthonybruno.lox;

import javax.annotation.Nullable;
import java.util.List;

public sealed interface Stmt permits Stmt.Block, Stmt.Expression, Stmt.If, Stmt.Print, Stmt.Var, Stmt.While {
  record Block(List<Stmt> statements) implements Stmt {}
  record Expression(Expr expression) implements Stmt {}
  record If(Expr condition, Stmt thenBranch, @Nullable Stmt elseBranch) implements Stmt {}
  record Print(Expr expression) implements Stmt {}
  record Var(Token name, Expr initializer) implements Stmt {}
  record While(Expr condition, Stmt body) implements Stmt {}
}
