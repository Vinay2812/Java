import java.util.Scanner;
public class Replace{
     public static void main(String[]args){
       int a,b;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Two Numbers : ");
       a=sc.nextInt();
       b=sc.nextInt();

       int temp=a;
       a=b;
       b=temp;
      System.out.printf("After Swapping Two Numbers Are\n A=%d\tB=%d ",a,b);
    }
}