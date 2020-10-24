package dev.anthonybruno.concurrency.counter;

public class ConcurrentCounter implements Counter {

    private int value = 0;

    @Override
    public synchronized int getNext() {
        return value++;
    }
}
