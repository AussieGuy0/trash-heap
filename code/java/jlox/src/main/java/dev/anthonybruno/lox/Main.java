package dev.anthonybruno.lox;

import dev.anthonybruno.lox.printer.SystemPrinter;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    new Lox(new SystemPrinter()).run(args);
  }
}
