package dev.anthonybruno.lox;

import dev.anthonybruno.lox.printer.InMemoryPrinter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class LoxTest {

  private InMemoryPrinter printer;
  private Lox lox;

  @BeforeEach
  public void setUp() {
    printer = new InMemoryPrinter();
    lox = new Lox(printer);
  }

  @Test
  public void runAddition() {
    assertThatCode(() -> lox.run("5 + 5;"))
      .doesNotThrowAnyException();
  }

  @Test
  public void runVariableScoping() {
    lox.run("""
      var a = "global a";
      var b = "global b";
      var c = "global c";
      {
        var a = "outer a";
        var b = "outer b";
        {
          var a = "inner a";
          print a;
          print b;
          print c;
        }
        print a;
        print b;
        print c;
      }
      print a;
      print b;
      print c;
       """);

    assertThat(printer.getPrintedLines()).containsExactly(
      "inner a",
      "outer b",
      "global c",
      "outer a",
      "outer b",
      "global c",
      "global a",
      "global b",
      "global c"
    );
  }

  @Test
  public void ifStatementIsTrue() {
    lox.run("""
      if (3 > 2) {
         print("hello");
      }
      """);

    assertThat(printer.getPrintedLines()).containsExactly(
      "hello"
    );
  }

  @Test
  public void ifStatementWithElseExecutesIf() {
    lox.run("""
      if (3 > 2) {
         print("hello");
      } else {
         print("world");
      }
      """);

    assertThat(printer.getPrintedLines()).containsExactly(
      "hello"
    );
  }

  @Test
  public void ifStatementWithElseExecutesElse() {
    lox.run("""
      if (3 > 4) {
         print("hello");
      } else {
         print("world");
      }
      """);

    assertThat(printer.getPrintedLines()).containsExactly(
      "world"
    );
  }


  @Test
  public void ifStatementIsFalse() {
    lox.run("""
      if (3 > 4) {
         print("hello");
      }
      """);

    assertThat(printer.getPrintedLines()).isEmpty();
  }

  @Test
  public void logicalOr() {
    lox.run("""
      print "hi" or 2;
      """);

    assertThat(printer.getPrintedLines()).containsExactly("hi");
  }

  @Test
  public void logicalOrIsFalseOnNil() {
    lox.run("""
      print nil or "hi";
      """);

    assertThat(printer.getPrintedLines()).containsExactly("hi");
  }

  @Test
  public void whileLoop() {
    lox.run("""
      var x = 1;
      while (x <= 3) {
         print(x);
         x = x + 1;
      }
      """);

    assertThat(printer.getPrintedLines()).containsExactly(
      "1",
      "2",
      "3"
    );
  }

  @Test
  public void forLoop() {
    lox.run("""
      var a = 0;
      var temp;
           
      for (var b = 1; a < 20; b = temp + b) {
        print a;
        temp = a;
        a = b;
      }
      """);
    assertThat(printer.getPrintedLines()).containsExactly(
      "0", "1", "1", "2", "3", "5", "8", "13"
    );
  }
}
