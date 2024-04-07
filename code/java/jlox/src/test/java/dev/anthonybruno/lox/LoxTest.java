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
  public void ifStatementIsFalse() {
    lox.run("""
      if (3 > 4) {
         print("hello");
      }
      """);

    assertThat(printer.getPrintedLines()).isEmpty();
  }
}
