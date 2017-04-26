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
                    log.debug("Received: " + received);
                    out.print(received);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
