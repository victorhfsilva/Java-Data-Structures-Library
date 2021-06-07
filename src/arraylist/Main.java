package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		// ArrayList Initialization
		ArrayList<Integer> integerArrayList1 = new ArrayList<Integer>();
		integerArrayList1.add(2);
		integerArrayList1.add(3);
		integerArrayList1.add(1);
		Random generator = new Random();
		for (int i = 0; i < 5; i++) {
			integerArrayList1.add(generator.nextInt(10));
		}	
		
		Collections.sort(integerArrayList1);
		System.out.println(integerArrayList1.size());
		System.out.println(Collections.binarySearch(integerArrayList1, 3));
		for (int i = 0; i < integerArrayList1.size(); i++) {
		      System.out.println(integerArrayList1.get(i));
	    }
		
		
	}

}
