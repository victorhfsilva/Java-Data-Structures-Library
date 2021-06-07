package array;

/**
 * @title Boolean Array Library
 * This library has methods to access, set and search the elements of a generic array.
 * 
 * @param array
 * @param T: type of the array
 * 
 * @author Victor Silva
 * @see GeneralArray
 * @see StringArray
 * @see IntegerArray
 * @see DoubleArray
 */

public class GeneralArray <T> extends ObjectArray {
	
	private T[] array;

    //Constructors
    public GeneralArray(T[] array){this.array = array;}

    //Getters
    public T[] getArray(){
        return array;
    }

    //Setters
    public void setArray(T[] array){
        this.array=array;
    }

    //Setting an element of the Matrix
    //Big-O: O(1)
    public T[] setElementAt(T element, int row) {
    	try {
    		array[row]=element;
    		return array;
    	}
    	catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
    }
    
    //Accessing an element
    //Big-O: O(1)
    public T getElementAt(int index){
        try {
            System.out.println(array[index]);
            return array[index];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return null;
        }
    }
    

    //Searching for an element
    public int[] indexOfElement(T element){
    	int[] row = new int[] {};
    	//Linear Search
        //Big-O O(n)
        for (int j = 0; j<array.length; j++){
            if (element == array[j]) {
                System.out.println("The element is in the index "+j);
                //Save the old values and initialize the new matrix
	       		int[] oldRow = row;	
	       		row = new int[row.length+1];		    	       		
	       		//Insert the old values
	       	    for (int  i = 0; i < oldRow.length; i++) {
       	            row[i]=oldRow[i];
	       	    }
	       	    //Save the row index
	       	    row[oldRow.length]=j;
            }
        }
        //case the element is not found return a empty array
       	if (row.length == 0) System.out.println("The element is not in the Array.");
       	return row;
    }
    
    //Print Array
    //Big-O: O(n)
    public void printArray(){
        for (int i = 0; i<
        		array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

}
