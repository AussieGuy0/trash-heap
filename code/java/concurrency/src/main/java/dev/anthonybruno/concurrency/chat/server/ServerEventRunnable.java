package dev.anthonybruno.concurrency.chat.server;

import dev.anthonybruno.concurrency.chat.server.event.Event;
import dev.anthonybruno.concurrency.chat.server.event.EventListener;
import dev.anthonybruno.concurrency.chat.server.queue.EventQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerEventRunnable implements Runnable {

    private final static Logger LOG = LoggerFactory.getLogger(ServerEventRunnable.class);

    private final EventListener eventListener;
    private final EventQueue eventQueue;

    public ServerEventRunnable(EventListener eventListener, EventQueue eventQueue) {
        this.eventListener = eventListener;
        this.eventQueue = eventQueue;
    }

    @Override
    public void run() {
        while (true) {
            Event event;
            try {
                event = eventQueue.waitAndTake();
            } catch (InterruptedException e) {
                LOG.info("Server event thread interrupted", e);
                return;
            }
            event.accept(eventListener);
        }
    }
}
