package dev.anthonybruno.lox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lox {

  boolean hadError = false;

  public void run(String[] args) throws IOException {
    if (args.length > 1) {
      System.out.println("Usage: jlox [script]");
      System.exit(64);
    } else if (args.length == 1) {
      runFile(args[0]);
    } else {
      runPrompt();
    }
  }

  public void runFile(String filePath) throws IOException {
    var path = Path.of(filePath);
    run(Files.readString(path, StandardCharsets.UTF_8));
    if (hadError) {
      System.exit(65);
    }
  }

  public void runPrompt() throws IOException {
    var input = new InputStreamReader(System.in);
    var reader = new BufferedReader(input);
    while (true) {
      System.out.println("> ");
      var line = reader.readLine();
      if (line == null) {
        break;
      }
      run(line);
      hadError = false;
    }
  }

  public void run(String source) {
    var scanner = new TokenScanner(source);
    var tokens = scanner.scanTokens();
    var parser = new Parser(tokens);
    var expression = parser.parse();
    hadError = scanner.hadError() || parser.hadError();
    if (hadError) {
      return;
    }
    System.out.println(new AstPrinter().print(expression));
  }


}
