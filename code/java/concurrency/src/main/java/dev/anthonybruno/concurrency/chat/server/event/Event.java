package dev.anthonybruno.concurrency.chat.server.event;

public interface Event {

    void accept(EventListener eventListener);

}
