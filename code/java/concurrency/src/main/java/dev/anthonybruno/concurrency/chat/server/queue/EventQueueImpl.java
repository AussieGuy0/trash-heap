package dev.anthonybruno.concurrency.chat.server.queue;

import dev.anthonybruno.concurrency.chat.server.event.Event;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class EventQueueImpl implements EventQueue {

    private final BlockingQueue<Event> queue = new ArrayBlockingQueue<>(1000);

    @Override
    public void addEvent(Event event) {
        queue.add(event);
    }

    @Override
    public Event waitAndTake() throws InterruptedException {
        return queue.take();
    }


}
