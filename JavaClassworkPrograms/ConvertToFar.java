import java.util.Scanner;
public class ConvertToFar{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       float c,f;
       System.out.println("Enter temperature in Celcius : ");
       c=sc.nextFloat();
       f=(9/5.0f)*c + 32.0f;
       System.out.println("Temperature in Farenhite is : "+f);
   
   }
}