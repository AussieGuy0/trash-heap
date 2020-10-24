package dev.anthonybruno.concurrency.chat;

import java.time.Instant;

public class Message {

    private final String clientName;
    private final Instant time;
    private final String message;

    public Message(String clientName, Instant time, String message) {
        this.clientName = clientName;
        this.time = time;
        this.message = message;
    }

    public static Message fromString(String line) {
        String[] splitLine = line.split("\\|\\|"); // || as delimiter
        if (splitLine.length != 3) {
            throw new IllegalArgumentException("Provided line did not have correct form: " + line);
        }
        return new Message(splitLine[0], Instant.parse(splitLine[1]), splitLine[2]);
    }

    public Message withClientName(String clientName) {
        return new Message(clientName, time, message);
    }

    public String clientName() {
        return clientName;
    }

    public Instant time() {
        return time;
    }

    public String message() {
        return message;
    }

    @Override
    public String toString() {
        return clientName + "||" + time + "||" + message;
    }
}
