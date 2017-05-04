package me.anthonybruno.javaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RelayServer {

    private static final Logger log = LoggerFactory.getLogger(RelayServer.class);

    private final ServerSocket serverSocket;

    private final RelaySeverRunnable client1;
    private final RelaySeverRunnable client2;

    public RelayServer(int portNumber) {
        try {
            serverSocket =  new ServerSocket(portNumber);

            System.out.println("Waiting for connections...");
            Socket clientSocket1 = serverSocket.accept();
            System.out.println("Client 1 connected");
            Socket clientSocket2 = serverSocket.accept();
            System.out.println("Client 2 connected");

            client1 = new RelaySeverRunnable(clientSocket1, clientSocket2);
            client2 = new RelaySeverRunnable(clientSocket2, clientSocket1);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.submit(client1);
        threadPool.submit(client2);
    }

    public static void main(String[] args) {
       new RelayServer(6666);
    }
}
