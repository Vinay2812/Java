package vinay;
class A{

    void show(){
        System.out.println("1");
    }
}
class B extends A{
    void show(){
        System.out.println("2");
    }
    void display(){
        System.out.println("3");
    }
}

class Outer{
    void show(){
        System.out.println("1");
    }
    static class Inner{
        void show(){
            System.out.println("2");
        }
    }

    class Inner1{
        void show(){
            System.out.println("3");
        }
    }
}

class C{
   static void show(){
        System.out.println("c");
    }
}
class D extends C{
    static void show(){
        System.out.println("d");
    }
}

class Garbage{
    public void finalize(){
        System.out.println("In Garbage class");
    }

}
public class Test{
    public static void main(String[] args) {
        //method hiding
       /*A a=new B();//->2
        a.show();
        a.display();->error*/

       /* Outer o= new Outer();
        o.show();*/

        //for static inner class
       /* Outer.Inner in = new Outer.Inner();
        in.show();*/

        //for non static inner class
       /* Outer.Inner1 in1 = o.new Inner1();
        in1.show();*/

        //Type Casting
       /* A a=new B();
        B b= new B();
        b=(B)a;*/

       // During over riding..if one fun is static other need to be static
        C c= new D();
        c.show();

        //Garbage collections example
       /* Garbage g=new Garbage();
        Garbage g2=new Garbage();
        g2=null;
        g=null;
       //g.finalize();
        System.gc();*/


    }
}