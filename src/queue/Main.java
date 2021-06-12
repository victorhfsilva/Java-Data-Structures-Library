package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Queues object (Queue is a Interface)
		Queue<Integer> queue1 = new LinkedList<>();
		
		//Add elements to the queue (Enqueuing)
		IntStream.of(1,3,4,2,6,3,6,2).forEach(i -> queue1.add(i));
		System.out.println("Enqueuing Elements");
		System.out.println(queue1);
		System.out.println();
		
		//Removing elements and returning them
		//Dequeuing
		System.out.println("Dequeuing");
		int integer1 = queue1.remove();
		System.out.println(integer1);
		System.out.println();
		
		//Peeking
		System.out.println("Peeking");
		int integer2 = queue1.peek();
		System.out.println(integer2);
		System.out.println();
		
		//Contains
		System.out.println("Contains");
		boolean contain1 = queue1.contains(2);
		System.out.println(contain1);
		System.out.println();
		
		//Accessing
		
	}

}
