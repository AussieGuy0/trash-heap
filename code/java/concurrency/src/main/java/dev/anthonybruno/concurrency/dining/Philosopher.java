package dev.anthonybruno.concurrency.dining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Philosopher implements Runnable {

    private static Logger LOG = LoggerFactory.getLogger(Philosopher.class);

    private final int num;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int num, Fork leftFork, Fork rightFork) {
        this.num = num;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public int num() {
        return num;
    }

    public void eat() {
        log("I am eating");
        pause(1000);
    }

    public void think() {
        log("I am thinking");
        pause(1000);
    }

    @Override
    public void run() {
        while (true) {
            think();

            leftFork.grab();
            log("Grabbed left fork");
            pause(500);
            rightFork.grab();
            log("Grabbed right fork");
            pause(500);

            eat();

            rightFork.release();
            log("Released right fork");
            pause(500);
            leftFork.release();
            log("Released left fork");
            pause(500);
        }
    }

    private void pause(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void log(String log) {
        LOG.info("Philosopher " + num + ": " + log);
    }

}
