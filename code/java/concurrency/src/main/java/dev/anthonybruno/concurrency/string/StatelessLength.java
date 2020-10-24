package dev.anthonybruno.concurrency.string;

public class StatelessLength implements StringFunction<Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }

}
