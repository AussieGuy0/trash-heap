package dev.anthonybruno.concurrency.queue;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class UnboundedBlockingQueue<T> extends AbstractQueue<T> implements BlockingQueue<T> {

    private static final Logger LOG = LoggerFactory.getLogger(UnboundedBlockingQueue.class);

    private final Object lock = new Object();
    private final T[] data = (T[]) new Object[256];

    private int back = 0;
    private int front = 0;


    @Override
    public int size() {
        synchronized (lock) {
            return back - front;
        }
    }

    @Override
    public void put(@NotNull T t) throws InterruptedException {
        synchronized (lock) {
            LOG.info("I PUT");
            data[back++] = t;
            lock.notifyAll();
        }
    }

    @Override
    public boolean offer(T t, long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        // Unbounded, always successful!
        put(t);
        return true;
    }

    @Override
    public boolean offer(@NotNull T t) {
        try {
            put(t);
        } catch (InterruptedException e) {
            return false;
        }
        return true;
    }

    @NotNull
    @Override
    public T take() throws InterruptedException {
        synchronized (lock) {
            while (isEmpty()) {
                LOG.info("I sleep");
                lock.wait();
                LOG.info("I WAKE");
            }
            return data[front++];
        }
    }

    @Override
    public T poll(long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        synchronized (lock) {
            while (isEmpty()) {
                LOG.info("I sleep");
                lock.wait(unit.toMillis(timeout));
                LOG.info("I WAKE");
                if (isEmpty()) {
                    LOG.info("I give up...");
                    return null;
                }
            }
            return data[front++];
        }
    }

    @Override
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int drainTo(@NotNull Collection<? super T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int drainTo(@NotNull Collection<? super T> c, int maxElements) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T poll() {
        synchronized (lock) {
            if (isEmpty()) {
                return null;
            }
            return data[front++];
        }
    }

    @Override
    public T peek() {
        synchronized (lock) {
            if (isEmpty()) {
                return null;
            }
            return data[front];
        }
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

}
