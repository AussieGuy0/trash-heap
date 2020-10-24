package dev.anthonybruno.concurrency.chat.display;

import dev.anthonybruno.concurrency.chat.Message;

public class ConsoleDisplay implements Display {

    @Override
    public void showMessage(Message message) {
        System.out.println(message.clientName() + ": " + message.message());
    }
}
