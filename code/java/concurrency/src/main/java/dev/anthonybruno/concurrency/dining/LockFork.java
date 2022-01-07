package dev.anthonybruno.concurrency.dining;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFork implements Fork {

    private final Lock lock = new ReentrantLock();

    @Override
    public void grab() {
        lock.lock();
    }

    @Override
    public boolean tryGrab(int msToWait) throws InterruptedException {
        return lock.tryLock(msToWait, TimeUnit.MILLISECONDS);
    }

    @Override
    public void release() {
        lock.unlock();
    }



}
