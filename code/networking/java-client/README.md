# java-client
Send and receive messages through a relay server. The program applys reliablity at the application level. It uses a stop-and-wait based protocol, as in after a message  is send, the code will wait until it recieves an acknowledgement message (ACK). After a certain amount of time of not recieveing an ACK, the message is sent again. 

## Why
This program was created for an assignment during a computer science degree. 

## Usage
In the command line, navigate to the directory and type 
```
make
```
to build the program. Then type:
```
javac client [serverIP] [port] 
```
Where serverIp and port is the ip address and port number of where the server is operating respectively. 
## Problems
1. If there is significant latency (anything over 1000 ms), the program starts sending a lot of messages. 
