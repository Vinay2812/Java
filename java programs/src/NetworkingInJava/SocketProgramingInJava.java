package NetworkingInJava;
import java.io.*;
import java.net.*;

//Java Socket -1.TCP  2.UDP
//classes- Socket & ServerSocket
/*
 Connection Oriented Concept
 Socket:use to communicate client and server
 Read and Write the messages
 
 ServerSocket:
 This is used at server side
 this accept() method in server socket class accepts the connection from clients
 
 Socket class:
     -to create socket at client
     Socket s=new Socket("localhost",port number)  ->for local host
     Socket s=new Socket(ip address ,port number)  ->for different host
     
     Methods:
     public InputStream getInputStream();
     public OutputStream getOutputStream();
     public Synchronized void close();
     
Server Socket Class :
    -object required to communicate with server
    ServerSocet s=new ServerSocket(port number);
    
    Methods:
    public socket accept() : returns socket and established a connection between server and client
    public Synchronized void close() : close the socket 
 
 */


public class SocketProgramingInJava {

	public static void main(String[] args) throws Exception{
		
	}

}
