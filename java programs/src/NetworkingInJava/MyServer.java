package NetworkingInJava;
import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(5555);
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String str=(String)dis.readUTF();
        System.out.println("mesage= "+str);

        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Reply= Hello Client");
        dos.close();
        ss.close();

    }

}
