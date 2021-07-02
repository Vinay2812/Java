package vinay;
import java.util.Scanner;
public class MethodOverloading{

    static double sum(double x,double y){
        return x+y;
    }

    static double sum(double x,double y,double z){
        return x+y+z;
    }
    
    public static void main(String[]args){
      double a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter three numbers : ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
      
      System.out.println("Sum of first two numbers is : " + sum(a,b));
      System.out.println("Sum of three numbers is : " + sum(a,b,c));
   }

}