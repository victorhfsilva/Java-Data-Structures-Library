package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import array.IntegerArrayMath;

/**
 * @title Using Array List 
 * This class implement array lists as examples. Some of its tasks are: setting, accessing, cloning,
 * clearing, searching, sorting and inserting or deleting elements. 
 * 
 * @author Victor Silva
 */

public class Main {
	
	public static <T> ArrayList<Integer> linear_search(ArrayList<T> arrayList,T element){
		//Linear Search using Stream
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == element) {
				indexes.add(i);
			}
		}
		return indexes;
	}
	
	public static void main(String[] args) {
		
		// ArrayList Initialization
		System.out.println("ArrayList");
		ArrayList<Integer> integerArrayList1 = new ArrayList<Integer>();
		IntStream.of(1,3,4,2,6,3,6,2).forEach(i -> integerArrayList1.add(i));
		Random generator = new Random();
		for (int i = 0; i < 5; i++) {
			integerArrayList1.add(generator.nextInt(10));
		}
		//Print ArrayList
		integerArrayList1.stream().forEach(i -> System.out.print(i+"\t"));		
		//Print Size
		System.out.println("\nSize: "+integerArrayList1.size()+"\n");
		
		//Get Element of Specific Index
		System.out.println("Getting element");
		int intElement1 = integerArrayList1.get(9);
		System.out.println(intElement1+"\n");
		
		//Set Element of Specific Index
		System.out.println("Setting element");
		integerArrayList1.set(3, -2);
		integerArrayList1.stream().forEach(i -> System.out.print(i+"\t"));
		System.out.println("\n");
		
		//Clone ArrayList
		System.out.println("Cloning Array List");
		ArrayList<Integer> integerArrayList2 = (ArrayList<Integer>) integerArrayList1.clone();
		System.out.println(integerArrayList1);
		System.out.println(integerArrayList2+"\n");
		
		//Reseting the array ArrayList
		System.out.println("Reseting the Array");
		integerArrayList2.clear();
		IntStream.of(3,2,5,1,8,3,4,3).forEach(i -> integerArrayList2.add(i));
		System.out.println(integerArrayList2+"\n");
		
		//Inserting and Deleting
		System.out.println("Inserting and Deleting Elements");
		//Inserting Element
		integerArrayList2.add(2,-1);
		//Deleting an Element
		integerArrayList2.remove(4);
		System.out.println(integerArrayList2+"\n");
		
		//Linear Search
		System.out.println("Linear Search");
		ArrayList<Integer> index2 = linear_search(integerArrayList2, 3);
		System.out.println(index2+"\n");
		
		//Binary Search
		//Sort using collections
		System.out.println("Collection Sorting");
		Collections.sort(integerArrayList2);
		System.out.println(integerArrayList2);
		//Collections Binary Search output only the first occurrence
		System.out.println("Binary Search");
		int index2_1 = Collections.binarySearch(integerArrayList2, 3);
		System.out.println(index2_1);	
		
	}

}
