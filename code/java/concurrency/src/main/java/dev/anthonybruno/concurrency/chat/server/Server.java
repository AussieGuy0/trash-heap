package dev.anthonybruno.concurrency.chat.server;

import dev.anthonybruno.concurrency.chat.util.ArrayUtils;
import dev.anthonybruno.concurrency.chat.util.IoUtils;
import dev.anthonybruno.concurrency.chat.Message;
import dev.anthonybruno.concurrency.chat.ChatConnection;
import dev.anthonybruno.concurrency.chat.display.ConsoleDisplay;
import dev.anthonybruno.concurrency.chat.display.Display;
import dev.anthonybruno.concurrency.chat.server.event.ClientConnectedEvent;
import dev.anthonybruno.concurrency.chat.server.event.ClientDisconnectedEvent;
import dev.anthonybruno.concurrency.chat.server.event.EventListener;
import dev.anthonybruno.concurrency.chat.server.event.MessageReceivedEvent;
import dev.anthonybruno.concurrency.chat.server.queue.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.ServerSocket;
import java.net.Socket;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Server {

    private final static Logger LOG = LoggerFactory.getLogger(Server.class);

    private final Display display;
    private final EventQueue eventQueue = new EventQueueImpl();
    private final List<ChatConnection> chatConnections = Collections.synchronizedList(new ArrayList<>());

    public Server(Display display) {
        this.display = display;
    }

    public void start(int port) {
        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
        startEventThread();
        LOG.info("Starting up server on port {}", port);
        ServerSocket serverSocket = IoUtils.doUnchecked(() -> new ServerSocket(port));
        while (true) {
            Socket socket = IoUtils.doUnchecked(serverSocket::accept);
            LOG.info("New client connected. {}", socket.getInetAddress());
            ChatConnection chatConnection = new ChatConnection(socket, eventQueue);
            chatConnections.add(chatConnection);
            eventQueue.addEvent(new ClientConnectedEvent(chatConnection));
        }
    }

    public void shutdown() {
        synchronized (chatConnections) {
            Iterator<ChatConnection> chatConnectionIterator = chatConnections.iterator();
            while (chatConnectionIterator.hasNext()) {
                ChatConnection chatConnection = chatConnectionIterator.next();
                chatConnection.sendMessage(createServerMessage("Server is shutting down. Bye!"));
                chatConnection.close();
                chatConnectionIterator.remove();
            }
        }
    }

    private Thread startEventThread() {
        ServerEventRunnable serverEventThread = new ServerEventRunnable(new ServerEventListener(), eventQueue);
        Thread thread = new Thread(serverEventThread);
        thread.setName("server-event-thread");
        thread.start();
        return thread;
    }

    private void clearConnection(ChatConnection toRemove) {
        synchronized (chatConnections) {
            chatConnections.remove(toRemove);
        }
    }

    private Message createServerMessage(String message) {
        return new Message("server", Instant.now(), message);
    }

    private class ServerEventListener implements EventListener {

        @Override
        public void accept(MessageReceivedEvent messageReceivedEvent) {
            Message message = messageReceivedEvent.message();
            display.showMessage(message);
            sendMessageToAllClientsExcept(message, messageReceivedEvent.messageSender());
        }

        @Override
        public void accept(ClientConnectedEvent clientConnectedEvent) {
            ChatConnection client = clientConnectedEvent.client();
            Message message = createServerMessage("A new client has connected");
            sendMessageToAllClientsExcept(message, client);
            client.sendMessage(createServerMessage("You have connected to the server. Client count: " + chatConnections.size()));
        }

        @Override
        public void accept(ClientDisconnectedEvent clientDisconnectedEvent) {
            clearConnection(clientDisconnectedEvent.client());
            String messageText = clientDisconnectedEvent.client().clientName()
                    .map(name -> name + " has disconnected")
                    .orElse("A client has disconnected");
            Message message = createServerMessage(messageText);
            sendMessageToAllClientsExcept(message);
        }


        private void sendMessageToAllClientsExcept(Message message, ChatConnection... exceptions) {
            for (ChatConnection chatConnection : chatConnections) {
                if (ArrayUtils.contains(exceptions, chatConnection)) {
                    continue;
                }
                chatConnection.sendMessage(message);
            }
        }
    }

    public static void main(String[] args) {
        Display display = new ConsoleDisplay();
        new Server(display).start(8081);
    }
}
