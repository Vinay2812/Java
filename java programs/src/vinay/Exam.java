package vinay;
import java.util.*;
import java.io.*;

public class Exam {
	
	public static void readData() throws Exception
	{

		System.out.println("Enter Data : ");
		DataInputStream dis =new DataInputStream(System.in);
		
		int c;
		
		
		while((c=dis.read())!=(int)'\n')
		{
			System.out.print((char)c);
		}
		dis.close();
		
	}
	
	public static void writeData() throws Exception
	{

	String str="Hello";
	
	DataOutputStream dos=new DataOutputStream(System.out);
	
	
	dos.write(str.getBytes());
	}

	public static void main(String[] args) {
		
		 try {
			System.out.println("Writing data : ");
			writeData();
			System.out.println("\nReading data : ");
			readData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
