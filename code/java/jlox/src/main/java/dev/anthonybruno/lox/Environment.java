package dev.anthonybruno.lox;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class Environment {
  // Sentinel value to represent an initialized value.
  private static final Object UNINITIALIZED = new Object();

  @Nullable
  private final Environment enclosing;
  private final Map<String, Object> values = new HashMap<>();

  public Environment() {
    this.enclosing = null;
  }

  public Environment(Environment enclosing) {
    this.enclosing = enclosing;
  }

  void define(String name) {
    values.put(name, UNINITIALIZED);
  }

  void define(String name, Object value) {
    values.put(name, value);
  }

  Object get(Token name) {
     if (values.containsKey(name.lexeme())) {
      var value = values.get(name.lexeme());
      if (value == UNINITIALIZED) {
        throw new RuntimeError(name, STR."Uninitialized variable \{name.lexeme()}");
      }
      return value;
    }

    if (enclosing != null) {
      return enclosing.get(name);
    }

    throw new RuntimeError(name, STR."Undefined variable '\{name.lexeme()}'.");
  }

  public void assign(Token name, Object value) {
    if (values.containsKey(name.lexeme())) {
      values.put(name.lexeme(), value);
      return;
    }

    if (enclosing != null) {
      enclosing.assign(name, value);
      return;
    }

    throw new RuntimeError(name, STR."undefined variable '\{name.lexeme()}'.");
  }
}
