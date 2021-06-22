package doublyLinkedList;

import java.util.ArrayList;

/**
 * @title Create Doubly Linked List Class
 * This library has methods to access, set, search, insert and delete the Nodes from a Doubly Linked List.
 * 
 * @param T: type of the queue
 * 
 * @author Victor Silva
 */

public class CreateDoublyLinkedList<T>{
	
	class Node {
		T data;
		Node prev;
		Node next;
		
		public Node(T data) {
			this.data = data;
		}
	}
		
	Node head = null;
	Node tail = null;
	
	public Node getNodeAtIndex(int index) {
		try { if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutofBounds) {
			System.out.println("The index is out of bounds");
			return null;
		}
		Node current = null;
		if (head == null && tail == null) {
			System.out.println("The Doubly Linked List is empty");
			return null;
		}
		else if (index>=0 && index<size()) {
			if (index <= size()-index) {
				current = head;
				for (int i = 0; i<index; i++) {
					current = current.next;
				}
			}
			else {
				current = tail;
				for (int i = size()-1; i>index; i--) {
					current = current.prev;
				}
			}
		}
		return current;
	}
	
	public void setNodeAtIndex(int index, T element) {
		try { if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutofBounds) {
			System.out.println("The index is out of bounds");
			return;
		}
		Node current = null;
		if (head == null && tail == null) {
			System.out.println("The Doubly Linked List is empty");
			return;
		}
		else if (index>=0 && index<size()) {
			if (index <= size()-index) {
				current = head;
				for (int i = 0; i<index; i++) {
					current = current.next;
				}
			}
			else {
				current = tail;
				for (int i = size()-1; i>index; i--) {
					current = current.prev;
				}
			}
		}
		current.data = element;
	}
	
	public ArrayList<Integer> searchForElement(T element) {
		Node current = null;
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		if (head == null && tail == null) {
			System.out.println("The Doubly Linked List is empty");
			return null;
		}
		else {
			current = head;
			for (int i = 0; i<size(); i++) {
				if (current.data == element) indexes.add(i);
				current = current.next;
			}
			return indexes;
		}
	}
	
	public void addNewNodeToTail(T data){
		Node newNode = new Node(data);
		//if the doubly linked list is empty
		//the new node is the head and the tail
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			head.prev = null;
			tail.next = null;
		}
		else {
			//make the previous tail point to the new
			tail.next = newNode;
			//make the new tail point to the previous
			newNode.prev = tail;
			//make the new node the new tail
			tail = newNode;
			//make the new node point to null
			tail.next = null;
		}	
	}
	
	public Node removeNodeFromTail(){
		//if the doubly linked list is empty
		//the new node is the head and the tail
		if (head == null && tail == null) {
			System.out.println("The Doubly Linked List is empty");
		}
		else {
			//copy the value previous to the tail
			Node newTail = tail.prev;
			//make the previous tail prev point to null
			tail.prev = null;
			//make the new tail equal to the second tail
			tail = newTail;
			//make the new tail next point to null
			tail.next = null;
		}
		return tail;
	}
	
	public void addNewNodeToHead(T data) {
		Node newNode = new Node(data);
		//if the doubly linked list is empty
		//the new node is the head and the tail
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			head.prev = null;
			tail.next = null;
		}
		else {
			//make the previous head previous point to the new Node
			head.prev = newNode;
			//make the new node next point to the previous head
			newNode.next = head;
			//make the new node the new head
			head = newNode;
			//make the new head previous point to null
			head.prev = null;
		}
	}
	
	public void removeNodeFromHead() {
		//if the doubly linked list is empty
		//the new node is the head and the tail
		if (head == null && tail == null) {
			System.out.println("The Doubly Linked List is empty");
		}
		else {
			//copy the value of the second head
			Node newHead = head.next;
			//make the previous head node next point to the null
			head.next = null;
			//make the second node the new head
			head = newHead;
			//make the new head previous point to null
			head.prev = null;
		}
	}
	
	public void addNewNodeToIndex(int index,T data) {
		try { if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutofBounds) {
			System.out.println("The index is out of bounds");
			return;
		}
		Node newNode = new Node(data);
		//The Element will be inserted between currentPrev and currentNext
		Node currentNext;
		Node currentPrev;
		
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			head.prev = null;
			tail.next = null;
		}
		//case the element is not on the tail or the head
		else if (index>0 && index<size()-1) {
			if (index <= size()-index) {
				currentNext = head;
				currentPrev = null;
				
				for (int i = 0; i<index; i++) {
					currentNext = currentNext.next;
				}
				currentPrev = currentNext.prev;
				currentPrev.next = newNode;
				newNode.prev = currentPrev;
				currentNext.prev = newNode;
				newNode.next = currentNext;
				}
			else {
				currentNext = null;
				currentPrev = tail;
				for (int i = size()-1; i>=index; i--) {
					currentPrev = currentPrev.prev;
				}
				currentNext = currentPrev.next;
				currentPrev.next = newNode;
				newNode.prev = currentPrev;
				currentNext.prev = newNode;
				newNode.next = currentNext;
			}
		}
		
		else if (index == 0) {
			addNewNodeToHead(data);
		}
		else if (index == size()-1) {
			addNewNodeToTail(data);
		}
	}
	
	public void removeNodeFromIndex(int index) {
		try { if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutofBounds) {
			System.out.println("The index is out of bounds");
			return;
		}
		
		//The Element current will be removed between currentPrev and currentNext
		Node current;
		Node currentNext;
		Node currentPrev;
		
		if (head == null && tail == null) {
			System.out.println("The Doubly Linked List is empty");
		}
		//case the element is not on the tail or the head
		else if (index>0 && index<size()-1) {
			if (index <= size()-index) {
				current=head;
				
				for (int i = 0; i<index; i++) {
					current = current.next;
				}
				currentPrev = current.prev;
				currentNext = current.next;
				currentPrev.next = currentNext;
				currentNext.prev = currentPrev;
				current.prev = null;
				current.next = null;
				}
			else {
				current = tail;
				for (int i = size()-1; i>index; i--) {
					current = current.prev;
				}
				currentPrev = current.prev;
				currentNext = current.next;
				currentPrev.next = currentNext;
				currentNext.prev = currentPrev;
				current.prev = null;
				current.next = null;
			}
		}
		
		else if (index == 0) {
			removeNodeFromHead();
		}
		else if (index == size()-1) {
			removeNodeFromTail();
		}
	}
	
	public int size() {
		Node current = head;
		int size = 0;
		//if the doubly linked list is empty
		if(head==null && tail == null) {
			System.out.println("List is empty");
		}
		else {
			while (current != null) {
				size++;
				current = current.next;
			}
		}
		return size;
	}
	
	public void print() {
		Node current = head;
		//if the doubly linked list is empty
		if(head==null && tail == null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("Nodes of doubly linked list: ");
			while (current != null) {
				System.out.print(current.data+"\t");
				current = current.next;
			}
		}
	}
}