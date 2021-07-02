import java.io.*;

import java.util.Scanner;

public class FileHandlingInJava{
        public static void main(String[] args) throws IOException {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter file name");
            String f_name=sc.nextLine();
            File f=new File(f_name);
            if(!f.exists())
            {
                f.createNewFile();
            }
            FileInputStream fis=new FileInputStream(f);
            int c;
            while((c=fis.read())!=-1)
            {
                System.out.print((char)c);
            }
            System.out.print("\nEnter Y to append new data:");

            String dec=sc.nextLine();
            if(dec.equals("Y") || dec.equals("y"))
            {
                FileOutputStream fos=new FileOutputStream(f);
                System.out.print("Enter th data to write into file:");
                String str="";

                while((str=sc.nextLine()).equals("exit")==true)
                {
                }
                fos.write(str.getBytes());
                System.out.print("Data appended");
            }
            else
            {
                System.out.print("Terminated");
            }




    }
}