import java.util.Scanner;

public class IsPrime{
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
      return true;
    }
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Number to check if it is prime");
         int n=sc.nextInt();

         System.out.println(isPrime(n));
     
    }
}