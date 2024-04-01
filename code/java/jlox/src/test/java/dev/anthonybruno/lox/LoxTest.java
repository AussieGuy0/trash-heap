package dev.anthonybruno.lox;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class LoxTest {

  private Lox lox;

  @BeforeEach
  public void setUp() {
    lox = new Lox();
  }

  @Test
  public void runAddition() {
    assertThatCode(() -> lox.run("5 + 5"))
      .doesNotThrowAnyException();
  }
}
