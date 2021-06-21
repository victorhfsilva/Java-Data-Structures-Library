package doublyLinkedList;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		CreateDoublyLinkedList<Integer> doublyLinkedList1 = new CreateDoublyLinkedList<Integer>();
		doublyLinkedList1.print();
		System.out.println();
		
		//Add Nodes to the head
		System.out.println("Adding Nodes to the Head");
		IntStream.of(1,3,4,5).forEach(i -> doublyLinkedList1.addNewNodeToHead(i));
		doublyLinkedList1.print();
		System.out.println();
		int size1=doublyLinkedList1.size();
		System.out.println("The size is: "+ size1);
		System.out.println();
		
		//Removing Nodes to the head
		System.out.println("Removing Nodes from the Head");
		doublyLinkedList1.removeNodeFromHead();
		doublyLinkedList1.print();
		System.out.println();
		int size2 = doublyLinkedList1.size();
		System.out.println("The size is: "+ size2);
		System.out.println();
		
		//Add Nodes to the tail
		System.out.println("Adding Nodes to the Tail");
		IntStream.of(2,6,7,8).forEach(i -> doublyLinkedList1.addNewNodeToTail(i));
		doublyLinkedList1.print();
		System.out.println();
		int size3 = doublyLinkedList1.size();
		System.out.println("The size is: "+ size3);
		System.out.println();
		
		//Removing Nodes to the head
		System.out.println("Removing Nodes from the Tail");
		doublyLinkedList1.removeNodeFromTail();
		doublyLinkedList1.print();
		System.out.println();
		int size4 = doublyLinkedList1.size();
		System.out.println("The size is: "+ size4);
		System.out.println();
		
		//Add Nodes to the middle
		System.out.println("Adding Nodes to the Middle");
		IntStream.of(0,9).forEach(i -> doublyLinkedList1.addNewNodeToIndex(4,i));
		doublyLinkedList1.print();
		System.out.println();
		int size5 = doublyLinkedList1.size();
		System.out.println("The size is: "+ size5);
		System.out.println();
		
		//Add Nodes to the middle
		System.out.println("Removing Nodes to the Middle");
		IntStream.of(1,5).forEach(i -> doublyLinkedList1.removeNodeFromIndex(i));
		doublyLinkedList1.print();
		System.out.println();
		int size6 = doublyLinkedList1.size();
		System.out.println("The size is: "+ size6);
		System.out.println();
		
		
	}

}
