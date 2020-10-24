package dev.anthonybruno.concurrency.counter;

import dev.anthonybruno.concurrency.counter.ConcurrentCounter;
import dev.anthonybruno.concurrency.counter.Counter;
import dev.anthonybruno.concurrency.counter.SimpleCounter;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class CounterTest {

    @Test
    void canUseSimpleCounterSingleThread() {
        Counter counter = new SimpleCounter();
        assertThat(counter.getNext()).isEqualTo(0);
        assertThat(counter.getNext()).isEqualTo(1);
        assertThat(counter.getNext()).isEqualTo(2);
    }

    @Test
    void cantUseSimpleCounterSingleThread() throws InterruptedException {
        Counter counter = new SimpleCounter();
        runCounterTest(counter, false);
    }

    @Test
    void canUseConcurrentCounterSingleThread() throws InterruptedException {
        Counter counter = new ConcurrentCounter();
        runCounterTest(counter, true);
    }

    private void runCounterTest(Counter counter, boolean shouldFail) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        List<Integer> output = Collections.synchronizedList(new ArrayList<>());
        executorService.submit(createRunnable(counter, output));
        executorService.submit(createRunnable(counter, output));
        executorService.submit(createRunnable(counter, output));
        executorService.submit(createRunnable(counter, output));
        executorService.submit(createRunnable(counter, output));
        executorService.submit(createRunnable(counter, output));
        executorService.submit(createRunnable(counter, output));
        executorService.submit(createRunnable(counter, output));

        Thread.sleep(5000);
        executorService.shutdownNow();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        Set<Integer> uniqueNums = new HashSet<>();
        for (int value : output) {
            if (uniqueNums.contains(value)) {
                String errorMessage =  "Expected incrementing list but got 2 items of same value: " + value;
                if (shouldFail) {
                    fail(errorMessage);
                } else {
                    System.err.println(errorMessage);
                }
            }
            uniqueNums.add(value);
        }

    }

    private Runnable createRunnable(Counter counter, List<Integer> output) {
        return () -> {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    return;
                }
                output.add(counter.getNext());
                if (Thread.interrupted()) {
                    return;
                }
            }
        };
    }

}
