package array;

public class GeneralArray <type> extends ObjectArray {
	
	private type[] array;

    //Constructors
    public GeneralArray(type[] array){this.array = array;}

    //Getters
    public type[] getArray(){
        return array;
    }

    //Setters
    public void setArray(type[] array){
        this.array=array;
    }

    //Setting an element of the Matrix
    //Big-O: O(1)
    public type[] setElementAt(type element, int row) {
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
    public type getElementAt(int index){
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
    public int[] indexOfElement(type element){
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
