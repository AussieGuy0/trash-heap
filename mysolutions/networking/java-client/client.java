/*Client Code by Anthony Bruno
(brun0074)
Based off code provided by: https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/networking/sockets/examples/EchoClient.java*/
import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.nio.ByteBuffer;
import java.nio.*;
import java.nio.charset.*;
import java.security.*;
import java.math.BigInteger;
import java.util.*;

//debug
import java.util.Arrays;

class client {
    /* ---- global variables ---- */
    public static boolean debug = false;
    public static int seq = 0;
    public static int ack = 0;
    public static int sendBack = 0;
    public static String recievedChecksum;
    public static int recievedSeq;
    public static int recievedAck;
    public static int recievedSB;
    /* --------------------------- */
    public static void main(String[] args) throws IOException {
            if (args.length == 3) {
                debug = true; //for debug messages
            } else if (args.length != 2) //check if arguments inputted correctly
            {
                System.err.println("Usage: java client <hostname> <port number>");
                System.exit(1);
            }
            String hostName = args[0]; //gets hostname from first commandline argument
            int portNumber = Integer.parseInt(args[1]); //gets portnumber from second commandline argument

            //Creates new socket, sets it to non-blocking mode and connects to port
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.connect(new InetSocketAddress(hostName, portNumber));
            //Linkedlist for storing messages
            LinkedList < String > list = new LinkedList < String > ();
            LinkedList < String > incomingList = new LinkedList < String > ();

            while (!socketChannel.finishConnect()) {
                //Waits untill the socket has finished connecting
            }
            //encoder
            CharsetEncoder enc = Charset.forName("UTF-8").newEncoder();
            //ByteBuffers to send/recieve messages from.
            ByteBuffer readBuffer = ByteBuffer.allocate(1000);
            ByteBuffer writeBuffer = ByteBuffer.allocate(1000);

            // buffered reader used to read from stdin
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            if (debug) System.out.println("Ready to send and recieve!");
            String userInput;
            String fullInput;
            String incoming;
            String message;
            String headRecieved;
            String headData = "MD5|SEQ|ACK";
            int bytesRead = 0;
            int bytesWrote = 0;
            boolean recieved = false;
            while (true) {
                /* Stops program from devouring all system resources */
                wait(1);
                /* read from socket if bytes are detected */
                if ((bytesRead = socketChannel.read(readBuffer)) > 0) {
                    readBuffer.flip();
                    incoming = new String(readBuffer.array(), "ASCII");
                    if (incoming.indexOf(":") != -1) { //checks if delimeter was corrupted
                        message = incoming.substring(incoming.indexOf(":") + 1);
                        headRecieved = incoming.substring(0, incoming.indexOf(":"));
                    } else {
                        message = incoming.substring(32);
                        headRecieved = incoming.substring(0, 31);
                    }
                    processRecievedHead(headRecieved);
                    if (recievedSB == 1) { //this should never run
                        fullInput = generateHead("", true) + ":" + "This is the previously sent message\n";
                        writeBuffer.put(enc.encode(CharBuffer.wrap(fullInput)));
                        writeToSocket(socketChannel, writeBuffer);

                    } else if (checkMsg(message) == true) {
                        if (!incoming.equals(incomingList.peek())) System.out.println(trimTrailing(message));
                        //send ACK
                        wait(20);
                        ack = recievedSeq;
                        fullInput = generateHead("", true) + ":" + "\n";
                        writeBuffer.put(enc.encode(CharBuffer.wrap(fullInput)));
                        writeToSocket(socketChannel, writeBuffer);
                        if (debug) System.out.println("DEBUG ACK SENT ");
                        ack = 0;

                    } else {
                        //set sendback to 1, send message, wait for a response
                        sendBack = 1;
                        fullInput = generateHead("", true) + ":\n";
                        writeBuffer.put(enc.encode(CharBuffer.wrap(fullInput)));
                        writeToSocket(socketChannel, writeBuffer);
                        if (debug) System.out.println("DEBUG SENDBACK SENT ");
                        sendBack = 0; //temporary
                    }
                    if (debug) System.out.println("DEBUG: Full message recieved: " + incoming);
                    incomingList.addFirst(incoming);
                    //readBuffer.clear();
                    flushBuffer(readBuffer);
                    ack = 0;
                }

                /* write to socket if user inputs data */
                if (stdIn.ready()) {
                    userInput = stdIn.readLine();
                    headData = generateHead(userInput, false);
                    if (debug) System.out.println("DEBUG: Head generated: " + headData);
                    fullInput = headData + ":" + userInput + "\n";
                    writeBuffer.put(enc.encode(CharBuffer.wrap(fullInput)));
                    list.addFirst(fullInput);
                    writeToSocket(socketChannel, writeBuffer);
                    String test = new String(writeBuffer.array(), "UTF-8");
                    if (debug) System.out.println("DEBUG: writeBuffer: " + test);
                    int sentSeq = seq;
                    int waitTime = 0;
                    recieved = false;
                    //wait for ACK from other client.
                    while (!recieved) {
                        waitTime++;
                        if ((bytesRead = socketChannel.read(readBuffer)) > 0) {
                            if (debug) System.out.println("Possible ACK recieved");
                            readBuffer.flip();
                            incoming = new String(readBuffer.array(), "ASCII");
                            if (incoming.indexOf(":") != -1) {
                                message = incoming.substring(incoming.indexOf(":") + 1);
                                headRecieved = incoming.substring(0, incoming.indexOf(":"));
                                processRecievedHead(headRecieved);
                                flushBuffer(readBuffer);
                            } else {
                                recievedSB = 1;
                                flushBuffer(readBuffer);
                            }

                            if (recievedAck == sentSeq && recievedSB != 1) {
                                recieved = true;
                                if (debug) System.out.println("DEBUG: ACK RECIEVED");
                                readBuffer.clear();
                            }
                            if (recievedSB == 1) {
                                if (debug) System.out.println("DEBUG: Sent message was coruppted, sending again!");
                                fullInput = list.peek();
                                writeBuffer.put(enc.encode(CharBuffer.wrap(fullInput)));
                                writeToSocket(socketChannel, writeBuffer);
                                waitTime = 0;
                            }
                        }
                        if (waitTime == 10) {
                            //send message again
                            if (debug) System.out.println("DEBUG: ACK NEVER RECIEVED, SENDING MESSAGE AGAIN");
                            fullInput = list.peek();
                            writeBuffer.put(enc.encode(CharBuffer.wrap(fullInput)));
                            writeToSocket(socketChannel, writeBuffer);
                            waitTime = 0;
                        }
                        wait(50);
                    }


                    System.out.println(" Sent:" + userInput);
                    flushBuffer(writeBuffer);
                }



            }
        }
        //Generates head of message. Boolean argument is set to true if message is ACK.
        // Structure of head: MD5 as Checksum, sequence number, ack value, sendbackflag
    public static String generateHead(String input, boolean acknowledgment) {
            if (acknowledgment == true) {
                ack = recievedSeq;
            } else {
                ack = 0;
            }
            String checksum = generateChecksum(input);
            seq++;
            return checksum + "|" + seq + "|" + ack + "|" + sendBack;


        }
        //Generate checksum based on message
    public static String generateChecksum(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            input = input.trim();
            if (debug) System.out.println("DEBUG: Generated Checksum with /" + input + "/");
            byte[] messageBytes = input.getBytes("UTF-8");
            byte[] digest = md.digest(messageBytes);
            BigInteger bigInt = new BigInteger(1, digest);
            String checksum = bigInt.toString(16);
            return checksum;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Could not generate checksum! Created generic checksum");
            String checksum = "error";
            return checksum;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Could not generate checksum! Created generic checksum");
            String checksum = "error";
            return checksum;
        }
    }

    //Check if the message is corrupted by examining the checksum
    public static boolean checkMsg(String msg) {
        //if (processRecievedHead(head) == false)
        //{
        //  return false;
        //}
        msg = msg.trim(); //gets rid of trailing white space and/or newline
        String generatedChecksum = generateChecksum(msg);
        //if (debug) System.out.println("DEBUG: checksum generated: /"+generatedChecksum+"/");
        //if (debug) System.out.println("DEBUG: checksum recieved : /"+recievedChecksum+"/");
        if (recievedChecksum.equals(generatedChecksum)) {
            return true;
        } else {
            if (debug) System.out.println("DEBUG: ERROR detected in recieved checksum!");
            return false;
        }
    }

    //splits the head of the message and gives it to variables. Some basic
    //error checking to make sure head is not coruppted
    public static boolean processRecievedHead(String head) {
        String[] splitHead = head.split("\\|");
        if (debug) System.out.println("DEBUG: splithead: " + Arrays.toString(splitHead));
        if (splitHead.length != 4) {
            if (debug) System.out.println("DEBUG: not 4 values found in head. Assumed coruppted packet.");
            return false;
        }
        try {
            recievedChecksum = splitHead[0];
            recievedSeq = Integer.parseInt(splitHead[1]);
            recievedAck = Integer.parseInt(splitHead[2]);
            recievedSB = Integer.parseInt(splitHead[3]);
        } catch (NumberFormatException e) {
            if (debug) System.out.println("DEBUG: Value in head is not an int, assumed coruptted packet");
            return false;
        }
        return true;
    }

    //stops proccessing for a specified length of time (in milliseconds)
    public static void wait(int num) {
            try {
                Thread.sleep(num);
            } catch (Exception e) {}
        }
        //Writes whatever is in ther writebuffer to the socket. Clears it when finished.
    public static void writeToSocket(SocketChannel socketChannel, ByteBuffer writeBuffer) throws IOException {
            int bytesWrote = 0;
            writeBuffer.flip();
            while (writeBuffer.hasRemaining()) {
                bytesWrote += socketChannel.write(writeBuffer);
            }
            writeBuffer.clear();
        }
        // Completly cleans buffer, as clear() dosent remove all data
    public static void flushBuffer(ByteBuffer buffer) {
            buffer.clear();
            buffer.put(new byte[buffer.capacity()]);
            buffer.clear();
        }
        // Modified Trim() function. Only gets rid of non-charchters after
        // a message. Used to get rid of \n when displaying message.
    public static String trimTrailing(String str) {
        int len = str.length();
        int st = 0;

        char[] val = str.toCharArray();

        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return str.substring(st, len);
    }

}
