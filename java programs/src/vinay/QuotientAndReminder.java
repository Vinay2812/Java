package vinay;
import java.util.Scanner;

public class QuotientAndReminder{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Divident and Divisor");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.printf("Quotient : %d and remainder : %d ",(a/b),(a%b));

    }
}