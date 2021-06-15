package queue;

import java.util.ArrayList;
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
		System.out.println(queue1);
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
		System.out.println("Accessing");
		GenericQueue queueObject1 = new GenericQueue(queue1);
		System.out.println(queueObject1.getQueue());
		queueObject1.getElementAt(1);
		System.out.println(queueObject1.getQueue());
		System.out.println();
		
		//Searching
		System.out.println("Searching");
		Queue<Integer> queue2 = new LinkedList<>();
		IntStream.of(1,3,4,6,5,7,3,8).forEach(i -> queue2.add(i));
		GenericQueue queueObject2 = new GenericQueue(queue2);
		System.out.println(queueObject2.getQueue());
		System.out.println("Size: "+queueObject2.getQueue().size());
		
		ArrayList<Integer> indexes = queueObject2.searchElement(3);
		System.out.println(indexes);
		System.out.println(queueObject2.getQueue());
		System.out.println();
		
		//Setting element at
		System.out.println("Setting Element");
		queueObject2.setElementAt(2, 2);
		System.out.println(queueObject2.getQueue());
		System.out.println();
		
		//Inserting element at
		System.out.println("Inserting Element");
		queueObject2.insertElementAt(9, 1);
		System.out.println(queueObject2.getQueue());
		System.out.println();
		
		//Deleting element at
		System.out.println("Deleting Element");
		queueObject2.deleteElementAt(3);
		System.out.println(queueObject2.getQueue());
		System.out.println();
		
		//Stream
		System.out.println("Streaming");
		IntStream.of(5,4,2,3,2).forEach(i -> queue2.add(i));
		queue2.stream().map(i -> Math.pow(i, 3)).forEach(i -> System.out.print(i+"\t"));
		System.out.println();
		
	}

}
