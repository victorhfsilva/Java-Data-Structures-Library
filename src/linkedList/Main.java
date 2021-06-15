package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		
		//Adding elements in the beginning of the linkedList
		IntStream.of(1, 3, 4, 6, 2, 5).forEach(i -> linkedList1.addFirst(i));
		System.out.println("Adding Elements");
		System.out.println(linkedList1);
		
		//Adding elements on the middle of the linkedList
		linkedList1.add(2,0);
		System.out.println(linkedList1);
		
		//Adding elements in the end of the linkedList
		IntStream.of(5,4,2,1,2).forEach(i -> linkedList1.addLast(i));
		System.out.println(linkedList1);
		System.out.println();
		
		//Deleting elements in the beginning of the linkedList
		System.out.println("Deleting Elements");
		int first1 = linkedList1.removeFirst();
		int first2 = linkedList1.pollFirst();
		int first3 = linkedList1.pop();
		System.out.println("First Elements:\t"+first1+"\t"+first2+"\t"+first3);
		System.out.println(linkedList1);		
		
		//Deleting elements in the end of the linkedList
		int last1 = linkedList1.removeLast();
		int last2 = linkedList1.pollLast();
		System.out.println("Last Elements:\t"+last1+"\t"+last2);
		System.out.println(linkedList1);
		System.out.println();
		
		//Deleting elements in the middle of the linkedList
		int middle1 = linkedList1.remove(2);
		System.out.println("Index "+ 2 + " element: "+middle1);
		System.out.println(linkedList1);
		System.out.println();
		
		//Accessing
		System.out.println("Accessing");
		int index1 = linkedList1.get(2);
		System.out.println("index: "+index1);
		System.out.println();
				
		//Searching
		System.out.println("Searching");
		//returns the first index of the element in the linkedList
		int index2 = linkedList1.indexOf(4);
		//returns the last index of the element in the linkedList
		int index3 = linkedList1.lastIndexOf(4);
		System.out.println("First Index: "+index2+" Last Index: "+index3);
		System.out.println();
		
		//Convert to ArrayList
		System.out.println("Convert to ArrayList");
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); 
		linkedList1.stream().forEach(i -> arrayList1.add(i));
		System.out.println(arrayList1);
		System.out.println();
		
		//Search
		System.out.println("Sort the ArrayList");
		Collections.sort(arrayList1);
		System.out.println(arrayList1);
		System.out.println();
		
		//Binary Search
		System.out.println("Binary Search");
		int index4 = Collections.binarySearch(arrayList1, 5);
		System.out.println(index4);
		
	}

}
