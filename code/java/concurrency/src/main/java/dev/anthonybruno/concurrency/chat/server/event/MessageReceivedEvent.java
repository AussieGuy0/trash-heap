package dev.anthonybruno.concurrency.chat.server.event;

import dev.anthonybruno.concurrency.chat.Message;
import dev.anthonybruno.concurrency.chat.ChatConnection;

public class MessageReceivedEvent implements Event {

    private final ChatConnection messageSender;
    private final Message message;

    public MessageReceivedEvent(ChatConnection messageSender, Message message) {
        this.messageSender = messageSender;
        this.message = message;
    }

    public ChatConnection messageSender() {
        return messageSender;
    }

    public Message message() {
        return message;
    }

    @Override
    public void accept(EventListener eventListener) {
        eventListener.accept(this);
    }
}
