package NetworkingInJava;
import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) throws Exception {
        Socket ss=new Socket("localhost",5555);
        //Socket s=ss.accept();
        DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
        dos.writeUTF("Hello Server");

        DataInputStream dis=new DataInputStream(ss.getInputStream());
        String str=(String)dis.readUTF();
        System.out.println("mesage= "+str);
        dos.flush();
        dos.close();
        ss.close();

    }
}
