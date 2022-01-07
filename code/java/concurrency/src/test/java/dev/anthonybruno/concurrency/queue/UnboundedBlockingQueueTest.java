package dev.anthonybruno.concurrency.queue;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowComparingPrivateFields;

public class UnboundedBlockingQueueTest {

    @Test
    void basic() {
        UnboundedBlockingQueue<Integer> queue = new UnboundedBlockingQueue<>();
        queue.offer(1);

        assertThat(queue.poll()).isEqualTo(1);

        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        assertThat(queue.poll()).isEqualTo(2);
        assertThat(queue.poll()).isEqualTo(3);
        assertThat(queue.poll()).isEqualTo(4);
        assertThat(queue.poll()).isNull();
    }

    @Test
    void multiThreaded() throws InterruptedException {
        UnboundedBlockingQueue<Integer> queue = new UnboundedBlockingQueue<>();
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        executorService.submit(createProducer(queue));
        executorService.submit(createProducer(queue));

        executorService.submit(createConsumer(queue));
        executorService.submit(createConsumer(queue));
        executorService.submit(createConsumer(queue));

        Thread.sleep(20000);
//        executorService.shutdown();
//        executorService.awaitTermination(20, TimeUnit.SECONDS);

    }

    private Runnable createProducer(UnboundedBlockingQueue<Integer> queue) {
       return () -> {
           while (!Thread.interrupted()) {
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               int toOffer =  ThreadLocalRandom.current().nextInt(0, 100);
               System.out.println("Offered " + toOffer);
               try {
                   queue.put(toOffer);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           System.err.println("LOL");
       };
    }

    private Runnable createConsumer(UnboundedBlockingQueue<Integer> queue) {
        return () -> {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    return;
                }
                try {
                    Integer returned = queue.poll(1000, TimeUnit.MILLISECONDS);
                    if (returned == null) {

                    }
                } catch (InterruptedException e) {
                    System.err.println("Gave up!");
                    return;
                }
            }
        };
    }
}
