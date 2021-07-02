import java.util.Scanner;

public class GCD{

    static int gcd(int n1,int n2){
        if(n1-n2==0){
            return n1;
        }

        if(n1>n2)
        n1= gcd(n1-n2,n2);
        else 
        n2= gcd(n1,n2-n1);

        return n1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nums : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("GCD is  : " + gcd(a,b));

    }
}