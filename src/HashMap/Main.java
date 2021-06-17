package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		final int MAP_LENGTH = 100;
		
		//Create Map
		HashMap<Integer, ObjectExample> map1 = new HashMap<Integer, ObjectExample>(); 
		
		//Add Object to map
		ObjectExample banana = new ObjectExample(0,"banana",3.14);	
		map1.put(banana.code,banana);
		
		//Add Object Array to Map
		String[] fruits = new String[] {"banana","apple","strawberry","pineapple","watermelon","melon","lemon","blueberry","grape"};
		Random generator = new Random();
		ObjectExample[] fruitsObjects = new ObjectExample[MAP_LENGTH];		
		for (int i = 1; i < MAP_LENGTH; i++) {
			fruitsObjects[i] = new ObjectExample();
			fruitsObjects[i].code = i;
			fruitsObjects[i].fruit=fruits[generator.nextInt(fruits.length)];
			fruitsObjects[i].price=(double) generator.nextInt(8)+generator.nextDouble();
			map1.put(i, fruitsObjects[i]);
			System.out.println("Code: "+i+"\tFruit: "+fruitsObjects[i].fruit+"\t\tPrice: "+fruitsObjects[i].price);
		}
		System.out.println(map1);
		System.out.println();
	
		//Accessing Items
		System.out.println("Accessing");
		String fruit1 = map1.get(94).fruit;
		double price1 = map1.get(94).price;
		System.out.println("Code: "+94+"\tFruit: "+fruit1+"\t\tPrice: "+price1);
		System.out.println("Size: "+map1.size());
		System.out.println();
		
		//Removing Elements by key
		System.out.println("Removing");
		map1.remove(95);
		System.out.println(map1);
		System.out.println("Size: "+map1.size());
		System.out.println();
		
		//Replacing value
		System.out.println("Replace");
		ObjectExample apple = new ObjectExample(94,"aplle",3.18);	
		map1.replace(94,apple);
		//For Each (key, value)
		map1.forEach((i,v) -> System.out.println("Code: "+v.code+"\tFruit: "+v.fruit+"\t\tPrice: "+v.price));
		System.out.println();
		
		//Iterate through the keys of Map
		System.out.print("Keys: ");
		for (int i : map1.keySet()) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Iterate through the values of Map
		System.out.print("Values: ");
		for (ObjectExample i : map1.values()) {
			System.out.print(i.fruit+" ");
		}
		System.out.println("\n");
		
		//Search through the Map
		System.out.println("Searching");
		ArrayList<Integer> index1 = new ArrayList<Integer>();
		for (int i : map1.keySet()) {
			if ( map1.get(i).fruit == "banana") {
				index1.add(i);
				System.out.print(map1.get(i).fruit+" ");
			}
		}
		System.out.println();
		System.out.println(index1);
				
	}

}
