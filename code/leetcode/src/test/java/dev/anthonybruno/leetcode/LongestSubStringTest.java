package dev.anthonybruno.leetcode;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubStringTest {

    @Test
    void basic() {
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void allRepeating() {
        assertEquals(1, lengthOfLongestSubstring("b"));
    }

    @Test
    void notSubsequence() {
        assertEquals(3, lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void dvdf() {
        assertEquals(3, lengthOfLongestSubstring("dvdf"));
    }

    private int lengthOfLongestSubstring(String s) {
        return new LongestSubString().lengthOfLongestSubstring(s);
    }
}
