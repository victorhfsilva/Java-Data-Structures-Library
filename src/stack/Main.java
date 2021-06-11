package stack;

import java.util.Iterator;
import java.util.Random;
import java.util.Stack;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		final int STR_ARRAY_LENGTH = 8;
		final int STR_LENGTH = 16;
		
		//Initialize Stack
		Stack stack1 = new Stack();
		
		//Inserting elements (Push)
		stack1.push("abcdefgh");
		stack1.push("asdfghjk");
		
		//Initialize String Generator
		Random generator = new Random();
		String[] strArray1 = new String[STR_ARRAY_LENGTH];
		char[] charArray1 = new char[STR_LENGTH];		
		
		for (int j = 0; j < strArray1.length; j++) {	
			for (int i = 0; i < charArray1.length; i++) {
				charArray1[i] = (char)(97+generator.nextInt(26));
			}
			strArray1[j] = String.valueOf(charArray1);
			//Inserting elements (Push)
			stack1.push(strArray1[j]);
		}
		
		//Print Stack
		System.out.println("Pushing");
		System.out.println(stack1);
		System.out.println("Size: "+stack1.size());
		System.out.println();
		
		//Peeking the element on the top of the stack
		//cast from object to stack   
		System.out.println("Peeking");
		String str1 = (String) stack1.peek();
		System.out.println(str1);
		System.out.println();
		
		//Deleting the element on the top and returning it
		//Popping
		System.out.println("Popping");
		String str2 = (String) stack1.pop();
		System.out.println(str2);
		System.out.println(stack1);
		System.out.println();
		
		//Searching for an element in the stack
		//output the distance from the top
		//starts counting from 1 instead of zero
		System.out.println("Searching");
		System.out.println("Size: "+stack1.size());
		int lastStringOffset = stack1.search(stack1.peek());
		System.out.println("Last String: "+lastStringOffset);
		int firstStringOffset = stack1.search("abcdefgh");
		System.out.println("First String: "+firstStringOffset);
		int secondStringOffset = stack1.search("asdfghjk");
		System.out.println("Second String: "+secondStringOffset);
		System.out.println();
		
		//Accessing an Element
		System.out.println("Accesing");
		String lastString = (String)stack1.elementAt(stack1.size()-1);
		System.out.println("Last String: "+lastString);
		String firstString = (String)stack1.elementAt(0);
		System.out.println("First String: "+firstString);
		System.out.println();
		
		//Inserting an Element in the index
		System.out.println("Inserting");
		stack1.insertElementAt("qwertyui", stack1.size()-2);
		System.out.println(stack1);
		System.out.println();
		
		//Deleting an element
		System.out.println("Deleting");
		stack1.remove(2);
		System.out.println(stack1);
		System.out.println();
	}

}
