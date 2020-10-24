package dev.anthonybruno.concurrency.chat.server.queue;

import dev.anthonybruno.concurrency.chat.server.event.Event;

public interface EventQueue {

    void addEvent(Event event);

    Event waitAndTake() throws InterruptedException;

}
