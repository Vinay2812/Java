package vinay;
import java.util.Scanner;

class Student{
    int roll_no;
    String name;
    int age;
    
    
    Student(){
       System.out.println("In Default Constructor");
       roll_no=23;
       name="Vinay Sarda";
       age=18;

    }
    Student(int r,String s,int a){
       System.out.println("In Parameterised Constructor");
       roll_no=r;
       name=s;
       age=a;
    }
}

public class ConstructorsInJava{
    static void display(Student s){
        System.out.println("Student name is : "+s.name+" and his roll number is : "+ s.roll_no +" and his age is : " + s.age);
        System.out.println();
    }
    public static void main(String[]args){
       int roll_no;
       String name;
       int age;

       Student s1=new Student();
       display(s1);

       Scanner sc=new Scanner(System.in);

       System.out.println("Enter Student Name : ");
       name=sc.nextLine();
       
       System.out.println("Enter Student Roll Number : ");
       roll_no =sc.nextInt(); 

       System.out.println("Enter Student age : ");
       age=sc.nextInt();
        
       
       Student s2=new Student(roll_no,name,age);

       
       display(s2);
    }
}