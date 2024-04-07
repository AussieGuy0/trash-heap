package dev.anthonybruno.lox.printer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPrinter implements Printer {

  private final List<String> printedLines = new ArrayList<>();

  @Override
  public void println(String text) {
    printedLines.add(text);
  }

  public List<String> getPrintedLines() {
    return List.copyOf(printedLines);
  }
}
