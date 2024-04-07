package dev.anthonybruno.lox.tool;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

// TODO: Move to different maven sub-project.
public class GenerateAst {

  public static void main(String[] args) throws IOException {
    if (args.length != 1) {
      System.err.println("Usage: generate_ast <output directory>");
      System.exit(64);
    }
    var outputDir = args[0];
    defineAst(outputDir, "Expr",
      """
        Assign   : Token name, Expr value
        Binary   : Expr left, Token operator, Expr right
        Grouping : Expr expression
        Literal  : Object value
        Logical  : Expr left, Token operator, Expr right
        Unary    : Token operator, Expr right
        Variable : Token name
        """
    );
    defineAst(outputDir, "Stmt",
      """
        Block      : List<Stmt> statements
        Expression : Expr expression
        If         : Expr condition, Stmt thenBranch, @Nullable Stmt elseBranch
        Print      : Expr expression
        Var        : Token name, Expr initializer
        While      : Expr condition, Stmt body
        """
    );
  }

  private static void defineAst(
    String outputDir, String baseName, String grammar)
    throws IOException {
    var path = STR."\{outputDir}/\{baseName}.java";
    var writer = new PrintWriter(path, StandardCharsets.UTF_8);
    record GrammarLine(String name, String expression) {}
    var grammarLines = grammar.lines()
      .map((line) -> {
        var split = line.split(":");
        var name = split[0].strip();
        var expression = split[1].strip();
        return new GrammarLine(name, expression);
      })
      .toList();

    writer.print("""
    package dev.anthonybruno.lox;
    
    import java.util.List;
    import javax.annotation.Nullable;
    """);
    writer.println();
    writer.print(STR."public sealed interface \{baseName} permits ");
    var counter = 0;
    for (var line: grammarLines) {
      writer.print(STR."\{baseName}.\{line.name}");
      if (++counter < grammarLines.size()) {
        writer.print(", ");
      } else {
        writer.print(" ");
      }
    }
    writer.print("{");
    writer.println();

    for (var line : grammarLines) {
      var name = line.name;
      var expression = line.expression;
      writer.println(STR."  record \{name}(\{expression}) implements \{baseName} {}");
    }

    writer.println("}");
    writer.close();
  }
}
