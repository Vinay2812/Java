import java.util.Scanner;

public class SwitchCase{

    static double sum(double x,double y){
        return x+y;
    }

    static double sum(double x,double y,double z){
        return x+y+z;
    }

    static double sub(double x,double y){
        return x-y;
    }

    static double sub(double x,double y,double z){
        return x-y-z;
    }

    static double multiply(double x,double y){
        return x*y;
    }

    static double multiply(double x,double y,double z){
        return x*y*z;
    }

    static double divide(double x,double y){
        return x/y;
    }
    
    public static void main(String[]args){
        double a,b,c;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Choose 1.for calculation of 2 numbers \n2.for claculation of 3 numbers ");
        int choice=sc.nextInt();
        if(choice==1){
        System.out.println("Choose from the following for two numbers : ");
        System.out.println("1.Addition \n2.substraction \n3.Multiplication \n4.division");
        System.out.println("Enter two numbers : ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        
        }
        else if(choice==2)
        {
        System.out.println("Choose from the following for three numbers : ");
        System.out.println("1.Addition \n2.substraction \n3.Multiplication ");
        System.out.println("Enter three numbers : ");
        a=sc.nextDouble();
        b=sc.nextDouble();  
        c=sc.nextDouble();
        }
        else{
        System.out.println("Invalid choice");
        return;
        }
        int val=sc.nextInt();
        
        switch(val){
          case 1 : 
          if(choice==1)
          System.out.println(sum(a,b));
          else
          System.out.println(sum(a,b,c));

          break;

          case 2 :
          if(choice==1) 
          System.out.println(sub(a,b));
          else
          System.out.println(sub(a,b,c));
          break;

          case 3:
          if(choice==1)
          System.out.println(multiply(a,b));
          else
          System.out.println(multiply(a,b,c));
          break;

          case 4:
          if(b!=0)
          System.out.println(divide(a,b));
          else
          System.out.println("Trying to divide by zero");
          break;

          default : 
          System.out.println("invalid Choice");
          break;
        
        
        }
    }
}