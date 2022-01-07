package dev.anthonybruno.concurrency.interview;

public class EditCounter {

    public boolean oneOrLessEditsAway(String original, String edit) {
        if (original.length() == edit.length()) {
            return editReplace(original, edit);
        } else if ((original.length() - edit.length()) == 1) {
            return editInsert(edit, original);
        } else if ((edit.length() - original.length()) == 1) {
            return editInsert(original, edit);
        }
        return false;
    }

    private boolean editReplace(String original, String edit) {
        boolean foundEdit = false;
        for (int i = 0; i < original.length(); i++) {
            char originalChar = original.charAt(i);
            char editChar = edit.charAt(i);
            if (originalChar != editChar) {
                if (!foundEdit) {
                    foundEdit = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean editInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
            } else {
                index1++;
            }
            index2++;

        }
        return true;

    }
}
