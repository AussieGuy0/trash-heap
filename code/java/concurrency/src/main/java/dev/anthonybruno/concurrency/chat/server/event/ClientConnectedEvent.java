package dev.anthonybruno.concurrency.chat.server.event;

import dev.anthonybruno.concurrency.chat.ChatConnection;

public class ClientConnectedEvent implements Event {

    private final ChatConnection client;

    public ClientConnectedEvent(ChatConnection client) {
        this.client = client;
    }

    public ChatConnection client() {
        return client;
    }

    @Override
    public void accept(EventListener eventListener) {
        eventListener.accept(this);
    }
}
