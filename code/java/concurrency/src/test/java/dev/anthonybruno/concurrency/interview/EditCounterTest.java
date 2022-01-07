package dev.anthonybruno.concurrency.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EditCounterTest {

    private final EditCounter editCounter = new EditCounter();

    @Test
    void basic() {
        assertTrue(editCounter.oneOrLessEditsAway("pale", "bale"));
        assertTrue(editCounter.oneOrLessEditsAway("pale", "ple"));
        assertTrue(editCounter.oneOrLessEditsAway("pales", "pale"));
        assertFalse(editCounter.oneOrLessEditsAway("pale", "bake"));
    }

    @Test
    void moreThanOneDeleted() {
        assertFalse(editCounter.oneOrLessEditsAway("pale", "pa"));
    }

    @Test
    void moreThanOneAdded() {
        assertFalse(editCounter.oneOrLessEditsAway("pale", "paled!"));
    }
}
