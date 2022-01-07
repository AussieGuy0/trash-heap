package dev.anthonybruno.concurrency.structure;

import dev.anthonybruno.concurrency.interview.structure.CoolQueue;
import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class CoolQueueTest {

    @Test
    void basic() {
        CoolQueue<Integer> queue = new CoolQueue<>();
        assertTrue(queue.isEmpty());
        queue.push(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertTrue(queue.isEmpty());
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());

    }
}
