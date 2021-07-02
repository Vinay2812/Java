package vinay;

import java.io.*;

import java.util.Scanner;

public class FIS_FOS_DIS_DOS {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter File Name : ");
		String f_name= sc.nextLine();
		File f= new File(f_name);
		
		if(!f.exists())
		{
		f.createNewFile();
		}
	
		FileOutputStream fout=new FileOutputStream(f,true);
		
		System.out.println("Please enter data to write on file : ");
		String str=sc.nextLine();
		fout.write(str.getBytes());
		
		DataOutputStream out= new DataOutputStream(fout);
		out.writeInt(70);
		out.flush();
		out.close();
		fout.close();

		FileInputStream fin =new FileInputStream(f);

		DataInputStream din= new DataInputStream(fin);
		int count=fin.available();
		byte[] bdata =new byte [count];
		din.read(bdata);
		for(byte b: bdata)
		{
			System.out.print((char)b);
		}

		din.close();
		fin.close();

		
	}


}
