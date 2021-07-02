package vinay;
import java.io.*;
import java.util.*;

public class File_Handling {
public static void main(String[]args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name : ");
        String f_name=sc.nextLine();
        File file=new File(f_name);
        if(!file.exists()){
            System.out.println("Creating File...");
            file.createNewFile();
        }

        System.out.println("Reading file contents...");
         int i;
         FileInputStream fin = new FileInputStream(file);

         do{
             i=fin.read();
             if(i!=-1){
                 System.out.print((char)i);
             }
         }while(i!=-1);

         fin.close();

         System.out.println("\nPress Y/y to append data");
         String choice=sc.next();

         if(choice.equals("Y") || choice.equals("y")){
            FileOutputStream fout = new FileOutputStream(file,true);
            String data,ans="";

            while((data=sc.nextLine()).equals("exit")!=true ){
                ans=(ans+data) + "\n";
            }
           char []arr =ans.toCharArray();
           for(i=0;i<ans.length();i++){
               fout.write(arr[i]);
           }
            System.out.println("Data Appended");
            fout.close();
         }
         else{
            System.out.println("Terminated");
         }
        
        }
}