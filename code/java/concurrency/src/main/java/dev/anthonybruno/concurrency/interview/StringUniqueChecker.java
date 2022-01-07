package dev.anthonybruno.concurrency.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringUniqueChecker {

    public boolean hasUniqueChars(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }

        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            Character curr = str.charAt(i);
            if (characterSet.contains(curr)) {
                return false;
            } else {
                characterSet.add(curr);
            }
        }
        return true;
    }

}
