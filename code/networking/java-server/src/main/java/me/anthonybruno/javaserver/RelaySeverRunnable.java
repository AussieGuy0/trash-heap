package me.anthonybruno.javaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RelaySeverRunnable implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(RelayServer.class);

    private final Socket clientSocket;
    private final Socket otherClientSocket;

    public RelaySeverRunnable(Socket clientSocket, Socket otherClientSocket) {
        this.clientSocket = clientSocket;
        this.otherClientSocket = otherClientSocket;
    }


    public void run() {
        try {
            PrintWriter out = new PrintWriter(otherClientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()));
            while (true) {
                if (in.ready()) {
                    String received = in.readLine();
                    System.out.println("Received message from [" + this.clientSocket.getPort() + "]: " + received);
                    System.out.println("Sending message to [" + this.otherClientSocket.getPort() + "]: " + received);
                    out.println(received);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
