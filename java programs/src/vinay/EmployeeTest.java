package vinay;
import java.util.Scanner;
class Employee{
    private  String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee() {
        firstName="";
        lastName="";
        monthlySalary=0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

}

public class EmployeeTest{
    Scanner sc=new Scanner(System.in);
    String firstName;
    String lastName;
    double monthlySalary;
    double yearlySalary;

    public void getValues(){

        System.out.println("Enter First Name : ");
        firstName=sc.nextLine();
        System.out.println("Enter Last Name : ");
        lastName=sc.nextLine();
        System.out.println("Enter Employee Salary : ");
        monthlySalary=sc.nextInt();
        sc.nextLine();
    }
    public static void main(String[] args) {
       EmployeeTest e1=new EmployeeTest();

       Employee Emp1=new Employee();
        System.out.println("Enter data for Employee 1 ");
        e1.getValues();
        Emp1.setFirstName(e1.firstName);
        Emp1.setLastName(e1.lastName);
        Emp1.setMonthlySalary(e1.monthlySalary);
        e1.yearlySalary=Emp1.getMonthlySalary()*12.0;
        System.out.println("Yearly Salary of "+ Emp1.getFirstName() + " " + Emp1.getLastName() +" is " + e1.yearlySalary );
        e1.yearlySalary+=e1.yearlySalary*0.1;
        System.out.println("Yearly Salary of "+ Emp1.getFirstName() + " " + Emp1.getLastName() +" after 10% raise is " + e1.yearlySalary );

        System.out.println();

        Employee Emp2=new Employee();
        System.out.println("Enter data for Employee 2 ");
        e1.getValues();
        Emp2.setFirstName(e1.firstName);
        Emp2.setLastName(e1.lastName);
        Emp2.setMonthlySalary(e1.monthlySalary);
        e1.yearlySalary=Emp2.getMonthlySalary()*12.0;
        System.out.println("Yearly Salary of "+ Emp2.getFirstName() + " " + Emp2.getLastName() +" is " + e1.yearlySalary );
        e1.yearlySalary+=e1.yearlySalary*0.1;
        System.out.println("Yearly Salary of "+ Emp2.getFirstName() + " " + Emp2.getLastName() +" after 10% raise is " + e1.yearlySalary );


    }
}