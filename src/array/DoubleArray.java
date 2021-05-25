package array;

public class Doubles extends Objects{
    private double[] array;
    private boolean sorted = false;

    //Constructors
    public Doubles(double[] array){
        this.array = array;
    }
    Doubles(double[] array, boolean sorted){
        this.array = array;
        this.sorted = sorted;
    }

    //Getters
    public double[] getArray(){
        return array;
    }
    public boolean getSorted(){ return sorted; }

    //Setters
    public void setArray(double[] array){
        this.array=array;
    }
    public void setSorted(boolean sorted){ this.sorted = sorted;}

    //Setting an element of the Matrix
    //Big-O: O(1)
    public double[] setElementAt(double element, int row) {
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
    public double getElementAt(int index){
        try {
            System.out.println(array[index]);
            return array[index];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return -1;
        }
    }

    //Searching for an element
    //sorted is true if the array is sorted
    public int[] indexOfElement(double element){
    	int[] row = new int[] {};
    	//Binary Search
        //Big-O: O(log2(n)+k)
        if (sorted){
            int row_end = array.length-1;
            int row_beginning = 0;
            while(row_beginning<=row_end){
                int row_middle = (row_beginning+row_end)/2;
                //case the element is bigger than the middle value
                if (element>array[row_middle]) row_beginning = row_middle+1;
                //case the element is smaller than the middle value
                else if (element<array[row_middle]) row_end = row_middle-1;
                //case the element is equal to the middle value
                else if (element==array[row_middle]) {
                    System.out.println("The element is in the index "+row_middle);
                    //Initialize a new row array with length 1
		            row = new int[row.length+1];	       	    
		       	    //Save the row value in the index 1
		       	    row[0]=row_middle;
		       	    //Save the row array in oldRow
		       	    int[] oldRow = row;
		       	    //create variables with the row_middle left and right boundaries
		       	    int row_middle_left = row_middle-1;
		       	    int row_middle_right = row_middle+1;
		       	    //check if the left elements have similar value to row_middle
		       	    while(element == array[row_middle_left]) {
		       	    	//Initialize the new matrix		       			       
			       		row = new int[row.length+1];		       		
			       		//Insert the old values
			       	    for (int  i = 0; i < oldRow.length; i++) {
		       	            row[i]=oldRow[i];
			       	    }
			       	    System.out.println("The element is in the row "+row_middle_left);
			       	    //Save the row index
			       	    row[oldRow.length]=row_middle_left;
			       	    //Save the row array and subtract the index of row_middle_left
			       	    row_middle_left--;
		       	    	oldRow = row;	
		       	    }		       	    
		       	    //check if the left element has similar value
		       	    while(element == array[row_middle_right]) {
		       	    	//Initialize the new matrix	       	    	
			       		row = new int[row.length+1];		       		
			       		//Insert the old values
			       	    for (int  i = 0; i < oldRow.length; i++) {
		       	            row[i]=oldRow[i];
			       	    }
			       	    System.out.println("The element is in the row "+row_middle_right);
			       	    //Save the row index		       	    
			       	    row[oldRow.length]=row_middle_right;		       	    
			       	    //Save the row array and add the index of row_middle_right
			       	    oldRow = row;
		       	    	row_middle_right++;
		       	    }
		       	    return row;
                }
            }
            //case the element is not found return a empty array
 	       	if (row.length == 0) System.out.println("The element is not in the Array.");
            return row;
        }
        else{
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
    }

  //Searching for an element while setting if the row is sorted
    public int[] indexOfElement(int element, boolean sorted){
        this.sorted = sorted;
    	int[] row = new int[] {};
    	//Binary Search
        //Big-O: O(log2(n)+k)
        if (sorted){
            int row_end = array.length-1;
            int row_beginning = 0;
            while(row_beginning<=row_end){
                int row_middle = (row_beginning+row_end)/2;
                //case the element is bigger than the middle value
                if (element>array[row_middle]) row_beginning = row_middle+1;
                //case the element is smaller than the middle value
                else if (element<array[row_middle]) row_end = row_middle-1;
                //case the element is equal to the middle value
                else if (element==array[row_middle]) {
                    System.out.println("The element is in the index "+row_middle);
                    //Initialize a new row array with length 1
		            row = new int[row.length+1];	       	    
		       	    //Save the row value in the index 1
		       	    row[0]=row_middle;
		       	    //Save the row array in oldRow
		       	    int[] oldRow = row;
		       	    //create variables with the row_middle left and right boundaries
		       	    int row_middle_left = row_middle-1;
		       	    int row_middle_right = row_middle+1;
		       	    //check if the left elements have similar value to row_middle
		       	    while(element == array[row_middle_left]) {
		       	    	//Initialize the new matrix		       			       
			       		row = new int[row.length+1];		       		
			       		//Insert the old values
			       	    for (int  i = 0; i < oldRow.length; i++) {
		       	            row[i]=oldRow[i];
			       	    }
			       	    System.out.println("The element is in the row "+row_middle_left);
			       	    //Save the row index
			       	    row[oldRow.length]=row_middle_left;
			       	    //Save the row array and subtract the index of row_middle_left
			       	    row_middle_left--;
		       	    	oldRow = row;	
		       	    }		       	    
		       	    //check if the left element has similar value
		       	    while(element == array[row_middle_right]) {
		       	    	//Initialize the new matrix	       	    	
			       		row = new int[row.length+1];		       		
			       		//Insert the old values
			       	    for (int  i = 0; i < oldRow.length; i++) {
		       	            row[i]=oldRow[i];
			       	    }
			       	    System.out.println("The element is in the row "+row_middle_right);
			       	    //Save the row index		       	    
			       	    row[oldRow.length]=row_middle_right;		       	    
			       	    //Save the row array and add the index of row_middle_right
			       	    oldRow = row;
		       	    	row_middle_right++;
		       	    }
		       	    return row;
                }
            }
            //case the element is not found return a empty array
 	       	if (row.length == 0) System.out.println("The element is not in the Array.");
            return row;
        }
        else{
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
    }
    
    //Inserting an element
    //Big-O: O(n)
    public double[] insertElement(double element,int index){
        try { if (index>array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        double[] oldArray = array;
        array = new double[oldArray.length + 1];
        
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
    //Big-O: O(n)
    public double[] deleteElement(int index){
        try {if (index>=array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        
        double[] oldArray = array;
        array = new double[oldArray.length-1];
        
        for (int i=0; i<index;i++){
            array[i]=oldArray[i];
        }
        for (int i=index;i<array.length;i++){
            array[i]=oldArray[i+1];
        }
        return array;
    }

    //Sorting the Data
    //Insertion Sort
    //Big-O O(n²)
    public double[] insertionSort(){
        double temp;
        for (int i = 1; i<array.length; i++){
            for (int j=i; j>0; j--){
                if (array[i]<array[j-1]){
                    temp =  array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        sorted = true;
        return array;
    }

    //Bubble Sort
    //Big-O O(n²)
    public double[] bubbleSort(){
        double temp;
        for (int ult = array.length-1; ult > 0; ult--){
            for (int i = 0; i<ult; i++){
                if (array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                }
            }
        }
        sorted = true;
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