package convert;
import java.util.*;
import maths.*;

public class Conversion{
    String convertToBinary(int a){
        return Integer.toBinaryString(a);
    }
    String convertToOctal(int a){
        return Integer.toOctalString(a);
    }
    String convertToHexadecimal(int a){
        return Integer.toHexString(a);
    }
    public static void main(String[] args) {
        Conversion c=new Conversion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int a=sc.nextInt();
        System.out.println("Enter choice \n1.Convert to Binary\n2.Convert to Octal\n3.Convert to Hexadecimal");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                 System.out.println("Binary number is " + c.convertToBinary(a));
                 break;
            case 2:
                System.out.println("Octal number is " + c.convertToOctal(a));
                break;
            case 3:
                System.out.println("Hexa decimal number is " + c.convertToHexadecimal(a));
                break;
            default:
                System.out.println("Invalid Choice");
        }

        StatisticalOperation s1 = new StatisticalOperation();
        System.out.print("Enter Size of array : ");
        int size = sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter choice \n1.Mean\n2.Median\n3.Standard Deviation");
         choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Mean is : ");
                System.out.println(s1.mean(arr));
                break;
            case 2:
                System.out.println(s1.median(arr));
                break;
            case 3:
                System.out.println(s1.standardDeviation(arr));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}