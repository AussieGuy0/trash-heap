package dev.anthonybruno.lox;

public record Token(TokenType type, String lexeme, Object literal, int line) {
}
