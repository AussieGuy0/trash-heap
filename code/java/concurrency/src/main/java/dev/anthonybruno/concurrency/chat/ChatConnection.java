package dev.anthonybruno.concurrency.chat;

import dev.anthonybruno.concurrency.chat.server.event.ClientDisconnectedEvent;
import dev.anthonybruno.concurrency.chat.server.event.MessageReceivedEvent;
import dev.anthonybruno.concurrency.chat.server.queue.EventQueue;
import dev.anthonybruno.concurrency.chat.util.IoUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.nio.channels.Channels;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import static dev.anthonybruno.concurrency.chat.util.IoUtils.doUnchecked;

public class ChatConnection implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(ChatConnection.class);

    private final Socket socket;
    private final EventQueue eventQueue;
    private final Thread readThread;
    private final AtomicReference<String> clientName = new AtomicReference<>();

    public ChatConnection(Socket socket, EventQueue eventQueue) {
        this.socket = socket;
        this.eventQueue = eventQueue;
        this.readThread = setUpReadThread();
        this.readThread.start();
    }

    public Optional<String> clientName() {
        return Optional.ofNullable(clientName.get());
    }

    private Thread setUpReadThread() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(doUnchecked(socket::getInputStream)));
        Thread thread = new Thread(() -> {
            while (true) {
                String line;
                try {
                    line = reader.readLine();
                } catch (IOException e) {
                    if (e instanceof SocketException) {
                        // Probably socket closing, can we check without resorting to reading exception message?
                        LOG.info("Error received from socket. This probably indicates that the socket has been closed", e);
                        return;
                    }
                    LOG.error("Unexpected fatal exception while reading from socket, closing client.", e);
                    return;
                }
                if (line == null) {
                    LOG.info("Client terminated connection");
                    eventQueue.addEvent(new ClientDisconnectedEvent(this));
                    return;
                }
                LOG.info("Received line: {}", line);
                Message message;
                try {
                    message = Message.fromString(line);
                } catch (IllegalArgumentException e) {
                    LOG.error("Error parsing line from client", e);
                    continue;
                }
                clientName.compareAndSet(null, message.clientName());
                eventQueue.addEvent(new MessageReceivedEvent(this, message));

                if (socket.isClosed() || Thread.interrupted()) {
                    IoUtils.closeUnchecked(reader);
                    return;
                }
            }
        });
        thread.setName("chat-connection-" + thread.getId());
        return thread;
    }

    public void sendMessage(Message message) {
        PrintWriter writer = new PrintWriter(doUnchecked(socket::getOutputStream));
        writer.println(message.toString());
        writer.flush();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatConnection that = (ChatConnection) o;
        return Objects.equals(socket, that.socket) &&
                Objects.equals(eventQueue, that.eventQueue) &&
                Objects.equals(readThread, that.readThread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socket, eventQueue, readThread);
    }

    @Override
    public void close() {
        IoUtils.closeUnchecked(socket);
        readThread.interrupt();
    }
}
