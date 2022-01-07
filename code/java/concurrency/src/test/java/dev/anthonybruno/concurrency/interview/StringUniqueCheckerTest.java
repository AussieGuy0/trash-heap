package dev.anthonybruno.concurrency.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUniqueCheckerTest {

    @Test
    void basic() {
        StringUniqueChecker stringUniqueChecker = new StringUniqueChecker();
        assertTrue(stringUniqueChecker.hasUniqueChars(""));
        assertTrue(stringUniqueChecker.hasUniqueChars("a"));
        assertTrue(stringUniqueChecker.hasUniqueChars("b"));
        assertTrue(stringUniqueChecker.hasUniqueChars("ab"));
        assertFalse(stringUniqueChecker.hasUniqueChars("aba"));
    }
}
