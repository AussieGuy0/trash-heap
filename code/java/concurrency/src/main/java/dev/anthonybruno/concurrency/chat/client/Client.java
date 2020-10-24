package dev.anthonybruno.concurrency.chat.client;

import dev.anthonybruno.concurrency.chat.util.IoUtils;
import dev.anthonybruno.concurrency.chat.Message;
import dev.anthonybruno.concurrency.chat.display.ConsoleDisplay;
import dev.anthonybruno.concurrency.chat.display.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static dev.anthonybruno.concurrency.chat.util.IoUtils.doUnchecked;

public class Client {

    private final static Logger LOG = LoggerFactory.getLogger(Client.class);

    private final String clientName;
    private final Display display;

    public Client(String clientName, Display display) {
        this.clientName = clientName;
        this.display = display;
    }

    public void connect(String host, int port) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(host, port));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

        new Thread(new SocketReader(socket)).start();
        new Thread(new SocketWriter(socket, System.in)).start();

    }

    private String formatMessage(String message) {
        return createMessage(message).toString();
    }

    private Message createMessage(String message) {
        return new Message(clientName, Instant.now(), message);
    }


    private class SocketReader implements Runnable {

        private final Socket socket;

        private SocketReader(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            InputStream inputStream = IoUtils.doUnchecked(socket::getInputStream);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                if (shouldTerminate()) {
                    LOG.info("Terminating read thread");
                    return;
                }
                if (doUnchecked(reader::ready))  {
                    String line = doUnchecked(reader::readLine);
                    Message message = Message.fromString(line);
                    display.showMessage(message);
                }
            }
        }

        private boolean shouldTerminate() {
            return socket.isClosed() || Thread.interrupted();
        }
    }

    private class SocketWriter implements Runnable {

        private final Socket socket;
        private final InputStream source;

        private SocketWriter(Socket socket, InputStream source) {
            this.socket = socket;
            this.source = source;
        }

        @Override
        public void run() {
            Scanner scanner = new Scanner(source);
            OutputStream outputStream = IoUtils.doUnchecked(socket::getOutputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);

            while (true) {
                if (shouldTerminate()) {
                    LOG.info("Terminating write thread");
                    return;
                }
                String line = scanner.nextLine();
                Message toSend = createMessage(line);
                printWriter.println(toSend.toString());
                printWriter.flush();
                display.showMessage(toSend.withClientName("you"));
            }
        }

        private boolean shouldTerminate() {
            return socket.isClosed() || Thread.interrupted();
        }
    }

    public static void main(String[] args) {
        String clientName = "cool-client" + ThreadLocalRandom.current().nextInt(0, 100);
        Display display = new ConsoleDisplay();
        new Client(clientName, display).connect("localhost", 8081);
    }
}
