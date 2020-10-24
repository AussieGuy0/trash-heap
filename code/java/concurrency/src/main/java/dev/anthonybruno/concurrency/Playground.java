package dev.anthonybruno.concurrency;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Playground {

    private static class SynchronizedLife {

        private final AtomicInteger count = new AtomicInteger(0);

        public synchronized int increment() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
            int value = count.incrementAndGet();
            System.out.println(value);
            return value;
        }

        public synchronized int decrement() {
            int value = count.decrementAndGet();
            System.out.println(value);
            return value;
        }

    }

    public static void main(String[] args) {
        System.out.println(010);
        System.out.println(07);
        SynchronizedLife synchronizedLife = new SynchronizedLife();
        new Thread(() -> synchronizedLife.increment()).start();
        new Thread(() -> synchronizedLife.decrement()).start();
    }

}
