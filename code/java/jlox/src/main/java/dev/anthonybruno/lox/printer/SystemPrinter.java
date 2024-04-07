package dev.anthonybruno.lox.printer;

public class SystemPrinter implements Printer {

  @Override
  public void println(String text) {
    System.out.println(text);
  }

}
