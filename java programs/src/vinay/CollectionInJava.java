package vinay;
import java.util.*;

public class CollectionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=10;
//		List<Integer> l1=new Vector<Integer>(n);
//		
//		l1.add(10);
//		l1.add(20);
//		l1.add(30);
//		
//		for(var x : l1) {
//			System.out.print(x + " ");
//		}
		
//		Queue<Integer> l1=new PriorityQueue<Integer>();
//		
//		l1.add(30);
//		l1.add(20);
//		l1.add(50);
//		
//		for(var x : l1) {
//			System.out.print(x + " ");
//		}
//		
//		System.out.println();
//		System.out.println(l1.element());
//		System.out.println(l1.peek());
//		
//		System.out.println(l1.remove());
//		System.out.println(l1.poll());
//		
//		for(var x : l1) {
//			System.out.print(x + " ");
//		}
//		
//		Deque<Integer> l1=new ArrayDeque<Integer>();
//	
//		l1.add(30);
//		l1.add(20);
//		l1.add(50);
//		
//		for(var x : l1) {
//			System.out.print(x + " ");
//		}
//		
//		System.out.println();
//		System.out.println(l1.element());
//		System.out.println(l1.peek());
//		
//		System.out.println(l1.remove());
//		System.out.println(l1.poll());
//		
//		for(var x : l1) {
//			System.out.print(x + " ");
//		}
		
//		HashSet<Integer> l1=new HashSet<Integer>();
//		
//		l1.add(30);
//		l1.add(30);
//		l1.add(50);
//		
//		for(Object x : l1) {
//			System.out.print(x + " ");
//		}
		
		var vec=new Vector<Vector<Integer>>(10);
		
		var res=new Vector<Integer>();
		res.add(10);
		res.add(10);
		res.add(10);
		
		vec.add(res);
		
		for(var x : vec){
			for(var y : x) {
				System.out.print(y +" ");
			}
		}
		
		
		
	}

}
