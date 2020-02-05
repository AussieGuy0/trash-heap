package dev.anthonybruno.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string, find the length of the longest substring without repeating characters.
 */
class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int currentSubset = 0;
        int longestSubset = 1;
        Map<Character, Integer> charsAtIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charsAtIndex.containsKey(c)) {
                if (currentSubset > longestSubset) {
                    longestSubset = currentSubset;
                }
                i = charsAtIndex.get(c);
                charsAtIndex.clear();
                currentSubset = 0;
            } else {
                charsAtIndex.put(c, i);
                currentSubset++;
            }
        }

        if (currentSubset > longestSubset) {
            longestSubset = currentSubset;
        }

        return longestSubset;
    }

}