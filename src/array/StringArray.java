package array;

/**
 * @title String Array Library
 * This library has methods to access, set insert, remove and search the elements of a string array.
 * 
 * @param array
 * 
 * @author Victor Silva
 * @see GeneralArray
 * @see BooleanArray
 * @see IntegerArray
 * @see DoubleArray
 */

public class StringArray extends ObjectArray {
    private String[] array;

    //Constructors
    public StringArray(String[] array){this.array = array;}

    //Getters
    public String[] getArray(){
        return array;
    }

    //Setters
    public void setArray(String[] array){
        this.array=array;
    }

    //Setting an element of the Array
    public String[] setElementAt(String element, int row) {
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
    public String getElementAt(int index){
        try {
            System.out.println(array[index]);
            return array[index];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return "";
        }
    }

    //Searching for an element
    public int[] indexOfElement(String element){
    	int[] row = new int[] {};
    	//Linear Search
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

    //Inserting an element
    public String[] insertElement(String element,int index){
        try { if (index>array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        String[] oldArray = array;
        array = new String[oldArray.length + 1];        
        //Insert the element
        for (int i = 0; i<index; i++){
            array[i]=oldArray[i];
        }
        array[index]=element;
        for (int i = index+1; i< array.length; i++){
            array[i]=oldArray[i-1];
        }
        return array;
    }

    //Deleting an element
    public String[] deleteElement(int index){
        try {if (index>=array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        String[] oldArray = array;
        array = new String[oldArray.length-1];
        for (int i=0; i<index;i++){
            array[i]=oldArray[i];
        }
        for (int i=index;i<array.length;i++){
            array[i]=oldArray[i+1];
        }
        return array;
    }
    
    //Print Array
    public void printArray(){
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

}
