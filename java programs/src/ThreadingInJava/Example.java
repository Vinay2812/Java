package ThreadingInJava;
/*//using interface
class A implements Runnable{
	public void run()
	{
		int i;
		for(i=0;i<10;i++) {
			System.out.println("Thread A "+i);
		}
	}
}

class B implements Runnable{
	public void run()
	{
		int i;
		for(i=0;i<10;i++) {
			System.out.println("Thread B "+i);
		}
	}
}*/
//using abstract class
class A extends Thread{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++) {
			try {
				if(i==2)
					sleep(5000);
			}catch(Exception e) {}
			System.out.println("i= "+i+" threadA");
		}
	}
}

class B extends Thread{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++) {
			System.out.println("i= "+i+" threadB");
		}
	}
}
public class Example {

	public static void main(String[] args) {
		/*
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());

		t1.start();
		t2.start();*/
		
		A o1=new A();
		B o2=new B();
		
		o1.start();
		o2.start();
		
	}

}
