package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @title Generic Queue Library
 * This library has methods to access, set, search, insert and delete the elements of a queue.
 * 
 * @param queue
 * @param T: type of the queue
 * 
 * @author Victor Silva
 */

public class GenericQueue<T> implements Cloneable {
	
	private Queue<T> queue;
	
	public GenericQueue(){
		queue = new LinkedList<>();
	}
	
	public GenericQueue(Queue<T> queue) {
		this.queue = queue;
	}
	
	public Queue<T> getQueue() {
		return queue;
	}
	
	public void setQueue(Queue<T> queue) {
		this.queue = queue;
	}
	
	//get element at index
	public T getElementAt(int index) {
		T element = null;
		try { if (index >= queue.size() || index < 0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");
			return element;
		}
		Queue<T> queueCopy = new LinkedList<> (queue);
		
		for (int i = 0; i<=index; i++) {
			element = queue.remove();
		}
		queue.clear();
		queue.addAll(queueCopy);
		System.out.println(element);
		return element;
	}
	
	//Search for an element and return arraylist of its index
	public ArrayList<Integer> searchElement(T searchedElement) {
		ArrayList<Integer> indexes = new ArrayList<>();
		Queue<T> queueCopy = new LinkedList<> (queue);
		T element = null;
		for (int i = 0; i<queueCopy.size(); i++) {
			element = queue.remove();
			if (element == searchedElement) {
				indexes.add(i);
				System.out.println("The element is in the index: " + i);
			}
		}
		if (indexes.isEmpty()) System.out.println("The element is not on the queue.");
		queue.clear();
		queue.addAll(queueCopy);
		return indexes;
	}
	
	//set element at index
	public void setElementAt(T setElement, int index) {
		try { if (index >= queue.size() || index < 0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");
			return;
		}		
		Queue<T> queueCopy = new LinkedList<> (queue);
		int size = queueCopy.size();
		queue.clear();
		for (int i = 0; i < index; i++) {
			queue.add(queueCopy.remove());
		}
		queue.add(setElement);
		queueCopy.remove();
		for (int i = index + 1; i < size; i++) {
			queue.add(queueCopy.remove());
		}
	}
	
	//Insert element at index
	public void insertElementAt(T insertedElement, int index) {
		try { if (index >= queue.size() || index < 0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");
			return;
		}			
		Queue<T> queueCopy = new LinkedList<> (queue);
		int size = queueCopy.size();
		queue.clear();
		for (int i = 0; i < index; i++) {
			queue.add(queueCopy.remove());
		}
		queue.add(insertedElement);
		for (int i = index + 1; i < size+1; i++) {
			queue.add(queueCopy.remove());
		}
	}
	
	//Delete element at index
	public void deleteElementAt(int index) {
		try { if (index >= queue.size() || index < 0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");
			return;
		}			
		Queue<T> queueCopy = new LinkedList<> (queue);
		int size = queueCopy.size();
		queue.clear();
		for (int i = 0; i < index; i++) {
			queue.add(queueCopy.remove());
		}
		queueCopy.remove();
		for (int i = index + 1; i < size; i++) {
			queue.add(queueCopy.remove());
		}
	}
	
}
