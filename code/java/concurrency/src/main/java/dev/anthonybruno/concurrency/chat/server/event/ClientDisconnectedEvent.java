package dev.anthonybruno.concurrency.chat.server.event;

import dev.anthonybruno.concurrency.chat.ChatConnection;

public class ClientDisconnectedEvent implements Event {

    private final ChatConnection client;

    public ClientDisconnectedEvent(ChatConnection connectedClient) {
        this.client = connectedClient;
    }

    public ChatConnection client() {
        return client;
    }

    @Override
    public void accept(EventListener eventListener) {
        eventListener.accept(this);
    }
}
