package dev.anthonybruno.concurrency.string;

import dev.anthonybruno.concurrency.annotation.NotThreadSafe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@NotThreadSafe
public class ThreadSafeLengthCounter implements StringFunction<Integer> {

    private final AtomicInteger count = new AtomicInteger(0);

    public int getCount() {
        return count.get();
    }

    @Override
    public Integer apply(String s) {
        count.incrementAndGet();
        return s.length();
    }

}
