package dev.anthonybruno.concurrency.chat.server.event;

public interface EventListener {

    default void accept(MessageReceivedEvent messageReceivedEvent) {

    }

    default void accept(ClientConnectedEvent clientConnectedEvent) {

    }

    default void accept(ClientDisconnectedEvent clientDisconnectedEvent) {

    }
}
