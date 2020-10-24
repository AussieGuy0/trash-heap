package dev.anthonybruno.concurrency.string;

import dev.anthonybruno.concurrency.annotation.NotThreadSafe;

@NotThreadSafe
public class LengthCounter implements StringFunction<Integer> {

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public Integer apply(String s) {
        count++;
        return s.length();
    }

}
