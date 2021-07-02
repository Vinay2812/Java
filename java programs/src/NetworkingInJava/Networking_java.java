package NetworkingInJava;
import java.net.*;
import java.io.*;
//java socket programming - facility to share data between computing devices

//java Terminologies
/*
 1.IP Address - 
 	-logical address(172.16.0.1) IPV4->32 bits
 	    range ->0.0.0.0 to 255.255.255.255
 	-ip address is unique in nature
 
 2.Protocol-
 	-set of rules to perform communication
 	ex->TCP,FTP,TELNET,SMTP,POP
 	
 3.Port Number -(associates with ip address)
 	-Uniquely identify different application
 	
 4.MAC address -
 	-physical address(given by manufacturer)
 	-unique address
 	-identify NIC(Network interface controller)
 	
 5.Connection Oriented and Connection less network
 	-connection oriented->Acknowledgement is sent(more reliable and slow)
 	-connection less oriented->Acknowledgement is not sent(less reliable but fast)
 	
 6.Socket -
 	-end point between 2 way of communication
 	
 Package -> java.net.*;
 
 //Classes ->
  1.Authenticator
  2.DatagramPacket
  3.DatagramSocket
  4.InetAddress
  5.Socket
  6.URL
  7.URL_Connection
  8.URL_Decoder
  9.URL_Encoder
  
  URL(Uniform Resource Locator)
    -points to resource on www
    
    http://www.tutorial.com/java_tut
    Protocol->http
    host->www.javatutorial.com
    file name->java_tut
    
    
   Constructors of URL-
   1.URL(String txt)->creates instance of url from the string representation
   2.URL(String protocol,String host,int port,String file)
   3.URL(String protocol,String host,int port,String file,URL_StreamHandler handler)
   
   Methods of URL-
   1.getProtocol();
   2.getHost();
   3.getPort();
   4.getFile();
   5.getAuthority();
   6.toString();
   7.openConnection();
 	
 */
public class Networking_java {
		
	public static void main(String[] args) throws Exception {

		URL u1 = new URL("https://www.tutorialspoint.com/index.htm");
//		System.out.println(u1.getProtocol());
//		System.out.println(u1.getHost());
//		System.out.println(u1.getPort());
//		System.out.println(u1.getFile());
		
		//connection between url
		URLConnection u2=u1.openConnection();
		InputStream in=u2.getInputStream();
		
		int c;
		while((c=in.read())!=-1)
		{
			System.out.print((char)c);
		}
		
	}

}
