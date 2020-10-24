package dev.anthonybruno.concurrency.counter;

import dev.anthonybruno.concurrency.annotation.NotThreadSafe;

@NotThreadSafe
public class SimpleCounter implements Counter {

    private int value = 0;

    @Override
    public int getNext() {
        return value++;
    }
}
