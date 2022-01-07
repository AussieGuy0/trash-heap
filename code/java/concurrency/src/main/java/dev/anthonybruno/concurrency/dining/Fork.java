package dev.anthonybruno.concurrency.dining;

public interface Fork {

    void grab();

    boolean tryGrab(int msToWait) throws InterruptedException;

    void release();

}
