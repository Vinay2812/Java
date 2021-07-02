package vinay;
import java.util.Scanner;
interface Engine{
    String engineName="DTSI";
    void engineType();
    void engineType(String s);
}
interface  Tyre{
    String tyreCompany="MRF";
    void numberOfTyres();
    void numberOfTyres(int x);
}
interface Door{
    void doorStatus();
    void doorStatus(String s);
}

class Bike{
    public void numberOfTyres(){
        System.out.println("No. of tyres are 2");
    }
}
public class Cars extends Bike implements Engine,Tyre,Door {
    public void engineType(String s){
        System.out.println("Engine name is "+engineName);
        System.out.println("Engine type is : " + s);
    }
    public void engineType(){
        System.out.println("Engine name is "+engineName);
        System.out.println("Engine type is 4 stroke engine");
    }
    public void numberOfTyres(int x){
        System.out.println("Tyre company is : "+ tyreCompany);
        System.out.println("Number of tyres are : " + x);
    }
    public void numberOfTyres(){
        System.out.println("Tyre company is : "+ tyreCompany);
        System.out.println("Number of tyres are 4");
    }
    public void doorStatus(String s){
        System.out.println("Door is " + s);
    }
    public void doorStatus(){
        System.out.println("Door is open");
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Cars c1=new Cars();
         Bike b = new Cars();
        b.numberOfTyres();

        System.out.println("Choose \n1.for default Details of car\n2.for taking Details from user\n");
        System.out.print("Enter choice : ");
        int choice=sc.nextInt();
        if(choice==2) {
            sc.nextLine();
            System.out.println("Enter Type of Engine (2 stroke or 4 stroke)");
            String s = sc.nextLine();

            System.out.println("Enter Number of tyres ");
            int x = sc.nextInt();

            System.out.println("Enter the status of door(open or close)");
            String y = sc.next();

            System.out.println("Car Details are....");
            c1.engineType(s);
            System.out.println();
            c1.numberOfTyres(x);
            System.out.println();
            c1.doorStatus(y);
        }
        else if(choice==1){
            System.out.println("Car Details are....");
            c1.engineType();
            System.out.println();
            c1.numberOfTyres();
            System.out.println();
            c1.doorStatus();
        }
        else{
            System.out.println("Invalid Choice");
        }
    }

}