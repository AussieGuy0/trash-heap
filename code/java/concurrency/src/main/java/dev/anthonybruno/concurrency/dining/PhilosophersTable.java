package dev.anthonybruno.concurrency.dining;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.Lock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhilosophersTable {

    public static CountDownLatch COUNT_DOWN_LATCH;

    private final int philsCount;
    private final ExecutorService threadPool;


    public PhilosophersTable(int philsCount) {
        this.philsCount = philsCount;
        this.threadPool = Executors.newFixedThreadPool(philsCount);
        COUNT_DOWN_LATCH = new CountDownLatch(philsCount);
    }

    public void run() {
        List<Fork> forks = IntStream.range(0, philsCount)
                .mapToObj((n) -> new LockFork())
                .collect(Collectors.toList());

        IntStream.range(0, philsCount)
                .mapToObj((n) -> new Philosopher(n, forks.get(n), forks.get((n + 1) % philsCount)))
                .forEach(threadPool::submit);
    }

    public static void main(String[] args) {
        new PhilosophersTable(5).run();
    }
}
