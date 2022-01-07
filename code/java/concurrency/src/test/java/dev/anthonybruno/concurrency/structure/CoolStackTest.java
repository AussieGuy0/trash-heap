package dev.anthonybruno.concurrency.structure;

import dev.anthonybruno.concurrency.interview.structure.CoolQueue;
import dev.anthonybruno.concurrency.interview.structure.CoolStack;
import dev.anthonybruno.concurrency.interview.structure.SetOfStacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoolStackTest {

    @Test
    void basic() {
        CoolStack<Integer> stack = new CoolStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.peek());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.size());
        assertEquals(1, stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    void setOfStacks() {
        SetOfStacks<Integer> setOfStacks = new SetOfStacks<>();

        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);

        assertEquals(4, setOfStacks.pop());
        setOfStacks.push(5);
        assertEquals(5, setOfStacks.pop());

        assertEquals(3, setOfStacks.pop());
        assertEquals(2, setOfStacks.pop());
        assertEquals(1, setOfStacks.pop());
    }
}
