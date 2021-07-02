import java.util.Scanner;
interface  Vehicle{
    String name="Lamborghini";
}
interface LandVehicle extends Vehicle{
    int numWheels=4;
    void drive();
}
interface  SeaVehicle extends Vehicle{
    String startDate="24/03/2021";
    void launch();
}
class Car implements LandVehicle{
    int maxPassenger;
    int maxSpeed;
    String colour;

    public Car(int maxPassenger, int maxSpeed, String colour) {
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    public void drive(){
        System.out.println("the car is on drive");
    }

    public void display(){
        System.out.println("Company is : "+name);
        System.out.println("The number of wheels of car is : " +numWheels);
        System.out.println("Max passengers can sit is :" + maxPassenger + "\nMax speed can be : " + maxSpeed + "\nColour of car is : "+ colour);
    }
}
class Ship implements SeaVehicle{
    int maxPassenger;
    int maxSpeed;
    String colour;

    public Ship(int maxPassenger, int maxSpeed, String colour) {
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }
    public void launch(){
        System.out.println("The ship is launched");
    }

    public void display(){
        System.out.println("Company is : "+name);
        System.out.println("Launch date is  "+startDate);
        System.out.println("Max passengers can sit is :" + maxPassenger + "\nMax speed can be : " + maxSpeed + "\nColour of ship is : "+ colour);
    }
}

class HoverCraft implements LandVehicle,SeaVehicle{

    public void launch(){
        System.out.println("The HoverCraft is launched");
    }
    public void drive(){
        System.out.println("the hoverCraft is on drive");
    }
    public void enterLand(int a,int b,String c){
        System.out.println("HoverCraft is entering land");
        Car C=new Car(a,b,c);
        C.display();
    }
    public void enterSea(int a,int b,String c){
        System.out.println("hovercraft is entering sea");
        Ship S=new Ship(a,b,c);
        S.display();
    }
}

public class Interfaces{
    public static void main(String[] args) {
        System.out.println("Choose from the following \n1.Car\n2.Ship\n3.HoverCraft");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1 :
                System.out.println("Enter max passengers of car ");
                int a= sc.nextInt();
                System.out.println("Enter max speed of car ");
                int b= sc.nextInt();
                System.out.println("Enter colour of car ");
                String c= sc.next();

                Car c1=new Car(a,b,c);
                c1.display();
                break;
            case 2 :
                System.out.println("Enter max passengers of ship ");
                int a1= sc.nextInt();
                System.out.println("Enter max speed of ship ");
                int b1= sc.nextInt();
                System.out.println("Enter colour of ship ");
                String s= sc.next();

                Ship s1=new Ship(a1,b1,s);
                s1.display();
                break;

            case 3 :
                System.out.println("choose for following \n 1.Enter land \n2.Enter Sea");
                int val =sc.nextInt();
                switch(val){
                    case 1 :
                        System.out.println("Enter max passengers of car ");
                        int x= sc.nextInt();
                        System.out.println("Enter max speed of car ");
                        int y= sc.nextInt();
                        System.out.println("Enter colour of car ");
                        String z= sc.next();

                        HoverCraft h = new HoverCraft();
                        h.drive();
                        h.enterLand(x,y,z);
                        break;

                    case 2 :
                        System.out.println("Enter max passengers of ship ");
                        int p= sc.nextInt();
                        System.out.println("Enter max speed of ship ");
                        int q= sc.nextInt();
                        System.out.println("Enter colour of ship ");
                        String r= sc.next();

                        HoverCraft h1 = new HoverCraft();
                        h1.launch();
                        h1.enterSea(p,q,r);
                        break;
                }
                break;

            default:
                System.out.println("invalid Choice");

        }
    }
}