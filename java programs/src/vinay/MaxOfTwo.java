package vinay;
import java.util.Scanner;
public class MaxOfTwo{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int a,b;
       System.out.println("Enter two Numbers : ");
       a=sc.nextInt();
       b=sc.nextInt();
       if(a>b)
       System.out.println(a+" is Max");
       else
       System.out.println(b+" is Max");
   }
}