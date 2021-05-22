package array;

public class DoubleMatrix extends Objects{
	
	private double[][] array;
	private boolean[]  sorted;
	
	//Getters
	public double[][] getArray() {return array;}
	public boolean[] getSorted(){return sorted;}
	
	//Setters
	public void setArray(double[][] array) {this.array = array;}
	public void setSorted(boolean[] sorted){this.sorted = sorted;}
	
    //Constructors
    public DoubleMatrix(double[][] array){
			
    	int temp;
		int[] length = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			length[i]=array[i].length;
		}
		for (int i = 1; i < array.length; i++) {
	            for (int j=i; j>0; j--){
	                if (length[i]<length[j-1]){
                    	temp =  length[j-1];
                        length[j-1] = length[j];
                        length[j] = temp;
	                }
	            }
		}		
		//Print Array Length
        for (int i = 0; i<length.length; i++){
            System.out.print(length[i]+"\t");
        }
        System.out.println();
	       
    	
		try {
			for (int i = 1; i < array.length; i++) {
				if (array[i].length != array[i-1].length) throw new Exception();
				this.array = array;
			}
		}
		
		catch (Exception matrixNumbersOfRowsDifferent) {
			System.out.println("The number of rows is different for each array.");
			this.array = new double[array.length][length[length.length-1]];
		}
    	
        sorted = new boolean[array.length];
        for (int line = 0; line < array.length; line++) {
			sorted[line] = false;
		}
    }
    
    public DoubleMatrix(double[][] array, boolean[] sorted){
        this.array = array;
        try { if (sorted.length == array.length) throw new Exception(); }
        catch (Exception sortedNumberOfRowsDifferent) {
        	System.out.println("The number of rows is different for each array.");
        	for (int line = 0; line < array.length; line++) {
    			sorted[line]=false;
    		}
        }
    }
    
    //Setting an element of the Matrix
    //Big-O: O(1)
    public double[][] setElementAt(double element, int line, int row) {
    	try {
    		array[line][row]=element;
    		return array;
    	}
    	catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
    }
    
    //Setting an element of the Sorted
    //Big-O: O(1)
    public boolean[] setSortedAt(boolean sortedLine, int line) {
    	try {
    		sorted[line]=sortedLine;
    		return sorted;
    	}
    	catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
    		System.out.println("Array Index is Out of Bounds");
    		return sorted;
    	}
    }
   
    //Accessing an element of the Matrix Array
    //Big-O: O(1)
    public double getElementAt(int line,int row){
        try {
            System.out.println(array[line][row]);
            return array[line][row];
        }
        catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return -1;
        }
    }
    
    //Accessing an element of the Sorted Array
    //Big-O: O(1)
    public boolean getSortedAt(int line) {
    	try {
    		System.out.println(sorted[line]);
    		return sorted[line];
    	}
    	catch(ArrayIndexOutOfBoundsException OutOfBoundsException) {
    		System.out.println("Array Index is Out of Bounds");
            return false;
    	}
    }
    
    //Searching for an element in the entire matrix
    public int indexOfElement(double element){
    	//Linear Search
        //Big-O O(n*m)
        for (int line = 0; line<array.length; line++) {
    		for (int row = 0; row<array[line].length; row++){
                if (element == array[line][row]) {
                	System.out.println("The element is in the line "+line+" and row "+row);
                    return row;
                }
            }
        }
        System.out.println("The element is not in the Array.");
        return -1;
    }
    
    //Searching for an element in a specific row of the matrix
    public int indexOfElement(double element,int line) {
		//Check if the line is out of bounds
    	try {if (line > array.length || line<0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");
	        return -1;
		}	
	    //Binary Search
	    //Big-O: O(log2(n))
	    if (sorted[line]){
		   int row_end = array[line].length-1;
	       int row_beginning = 0;
	       while(row_beginning<=row_end){
	           int row_middle = (row_beginning+row_end)/2;
	           if (element>array[line][row_middle]) row_beginning = row_middle+1;
	           else if (element<array[line][row_middle]) row_end = row_middle-1;
	           else if (element==array[line][row_middle]) {
	               System.out.println("The element is in the row"+row_middle);
	               return row_middle;
	           }
	       }
	       System.out.println("The element is not in the Array.");
	       return -1;
	       }
	       else{
	           //Linear Search
	           //Big-O O(n)
	       		for (int row = 0; row<array[line].length; row++){
		                if (element == array[line][row]) {
		                    System.out.println("The element is in the row "+row);
		                    return row;
		                }
		            }
		        }
	           System.out.println("The element is not in the Array.");
	       return -1;
   }
  
    //Searching for an element in a specific row of the matrix while setting if the row is sorted
    public int indexOfElement(double element,int line, boolean sortedLine) {
    	//Check if the line is out of bounds
    	try {if (line > array.length || line<0) throw new ArrayIndexOutOfBoundsException();}
    	catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
    		System.out.println("Array Index is Out of Bounds");
            return -1;
    	}
    	this.sorted[line] = sortedLine;
    	//Binary Search
        //Big-O: O(log2(n))
        if (sorted[line]){
        	int row_end = array[line].length-1;
            int row_beginning = 0;
            while(row_beginning<=row_end){
                int row_middle = (row_beginning+row_end)/2;
                if (element>array[line][row_middle]) row_beginning = row_middle+1;
                else if (element<array[line][row_middle]) row_end = row_middle-1;
                else if (element==array[line][row_middle]) {
                    System.out.println("The element is in the row"+row_middle);
                    return row_middle;
                }
            }
            System.out.println("The element is not in the Array.");
            return -1;
        }
        else{
            //Linear Search
            //Big-O O(n)
        		for (int row = 0; row<array[line].length; row++){
	                if (element == array[line][row]) {
	                    System.out.println("The element is in the row "+row);
	                    return row;
	                }
	            }
	        }
            System.out.println("The element is not in the Array.");
        return -1;
    }
    
    //Inserting a line
    public double[][] insertLine(double[] elements, int line){
    	//check if the matrix arrays have the same number of rows
    	for (int i = 1; i < array.length; i++) {
			try {if (array[i].length != array[i-1].length) throw new Exception();}
			catch (Exception matrixNumbersOfRowsDifferent) {
				System.out.println("The number of rows is different for each array.");
				return array;
			}
		}
    	
    	//check if the inserted number of elements is equal to the matrix number of rows
    	try { if (elements.length == array[0].length) throw new Exception();}
    	catch (Exception insertedNumbersOfRowsDifferent) {
    		System.out.println("The inserted number of rows is different from the matrix.");
    		return array;
    	}
    	
    	//check if the line is out bounds
    	try { if (line>array.length || line<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return array;
	        }
    	
		//Save the old values and initialize the new matrix
		double[][] oldArray = array;
		boolean[] oldSorted = sorted;
		
		array = new double[oldArray.length+1][oldArray[0].length];
    	sorted = new boolean[oldSorted.length+1];
		
		//Insert the line of elements
	    for (int row = 0; row < oldArray[0].length; row++) {
    		for (int i = 0; i<line; i++){
	            array[i][row]=oldArray[i][row];
	        }
	        array[line][row]=elements[row];
	        for (int i = line+1; i < array.length; i++){
	            array[i][row]=oldArray[i-1][row];
	        }
	    }
	    
	    //Insert the sorted element
        for (int i = 0; i<line; i++){
            sorted[i]=oldSorted[i];
        }
        sorted[line]=false;
        for (int i = line+1; i< sorted.length; i++){
            sorted[i]=oldSorted[i-1];
        }
		
		return array;
    	
    }
    
    //Inserting a line
    public double[][] insertLine(double[] elements, int line, boolean sortedLine){
    	
    	//check if the matrix arrays have the same number of rows
    	for (int i = 1; i < array.length; i++) {
			try {if (array[i].length != array[i-1].length) throw new Exception();}
			catch (Exception matrixNumbersOfRowsDifferent) {
				System.out.println("The number of rows is different for each array.");
				return array;
			}
		}
    	
    	//check if the inserted number of elements is equal to the matrix number of rows
    	try { if (elements.length == array[0].length) throw new Exception();}
    	catch (Exception insertedNumbersOfRowsDifferent) {
    		System.out.println("The inserted number of rows is different from the matrix.");
    		return array;
    	}
    	
    	//check if the line is out bounds
    	try { if (line>array.length || line<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return array;
	        }
    	
		//Save the old values and initialize the new matrix
		double[][] oldArray = array;
		boolean[] oldSorted = sorted;
		
		array = new double[oldArray.length+1][oldArray[0].length];
    	sorted = new boolean[oldSorted.length+1];
		
		//Insert the line of elements
	    for (int row = 0; row < oldArray[0].length; row++) {
    		for (int i = 0; i<line; i++){
	            array[i][row]=oldArray[i][row];
	        }
	        array[line][row]=elements[row];
	        for (int i = line+1; i < array.length; i++){
	            array[i][row]=oldArray[i-1][row];
	        }
	    }
	    
	    //Insert the sorted element
        for (int i = 0; i<line; i++){
            sorted[i]=oldSorted[i];
        }
        sorted[line]=sortedLine;
        for (int i = line+1; i< sorted.length; i++){
            sorted[i]=oldSorted[i-1];
        }
		
		return array;
    	
    }
    
    //Inserting a row
    public double[][] insertRow(double[] elements, int row){
    	//check if the matrix arrays have the same number of rows
    	//check if the array have the same number of rows and if the elements have the same number of lines than the array
    	for (int line = 1; line < array.length; line++) {
   			try { if (!(array[line].length == array[line-1].length && elements.length == array.length)) throw new Exception();}
   			catch (Exception ex) {
   				System.out.println("The number of rows are different for each array.");
   				return array;
   			}
   		}
    	//check if the row is out bounds
		try { if (row>array[0].length || row<0 ) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
		
        double[][] oldArray = array;
        array = new double[oldArray.length][oldArray[0].length+1];
 
    	//insert the element and change the line which it was inserted
	    for (int line = 0; line < oldArray.length; line++) {
    		for (int i = 0; i<row; i++){
	            array[line][i]=oldArray[line][i];
	        }
	        array[line][row]=elements[line];
	        for (int i = row+1; i< array[line].length; i++){
	            array[line][i]=oldArray[line][i-1];
	        }
	    }
        return array;
    }   
    
//    //Inserting an element
//    //Big-O: O(n*m)
//    public double[][] insertElement(double element,int line,int row){
//        try { if (row>array[line].length || row<0 || line>=array.length || line<0) throw new ArrayIndexOutOfBoundsException();}
//        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
//            System.out.println("Array Index is Out of Bounds");
//            return array;
//        }
//        double[][] oldArray = array;
//        //case the element is going to be inserted in the last index
//        if (row == array[line].length) {
//            array = new double[oldArray.length][oldArray[line].length+1];
//            array[line][oldArray[line].length]=element;
//        }
//        //case the element is going to be inserted elsewhere
//        else {
//            array = new double[oldArray.length][oldArray[line].length + 1];
//        }
//        //copy the arrays that won't be changed
//        for (int i = 0; i < oldArray.length; i++) {
//			for (int j = 0; j < oldArray[i].length; j++) {
//				if(i != line) {
//					array[i][j]=oldArray[i][j];
//				}
//			}
//		}
//        //insert the element and change the line which it was inserted
//        for (int i = 0; i<row; i++){
//            array[line][i]=oldArray[line][i];
//        }
//        array[line][row]=element;
//        for (int i = row+1; i< array[line].length; i++){
//            array[line][i]=oldArray[line][i-1];
//        }
//        return array;
//    } 
    
    
    //Sorting the Data
    //Insertion Sort
    //Big-O O(m*n²)
    public double[][] insertionSort(int line){
        double temp;
        for (int i = 1; i<array[line].length; i++){
            for (int j=i; j>0; j--){
                if (array[line][i]<array[line][j-1]){
                    for (int k = 0; k < array.length; k++) {
                    	temp =  array[k][j-1];
                        array[k][j-1] = array[k][j];
                        array[k][j] = temp;
					}
                }
            }
        }
        sorted[line] = true;
    	for (int i = 0; i < array.length; i++) {
    		if (i != line) {
    			sorted[i] = false;
    		}
		}
        return array;
    }

    //Bubble Sort
    //Big-O O(m*n²)
    public double[][] bubbleSort(int line){
        double temp;
        for (int ult = array.length-1; ult > 0; ult--){
            for (int row = 0; row<ult; row++){
                if (array[line][row]>array[line][row+1]){
                    for (int i = 0; i < array.length; i++) {
                    	temp = array[i][row];
                        array[i][row] = array[i][row+1];
                        array[i][row+1]=temp;
					}
                }
            }
        }
        sorted[line] = true;
        for (int i = 0; i < array.length; i++) {
    		if (i != line) {
    			sorted[i] = false;
    		}
		}
        return array;
    }
    
    //Print Array
    public void printMatrix(){
        for (int line = 0; line<array.length;line++){
           	for (int row = 0; row < array[line].length; row++) {
        		System.out.print(array[line][row]+"\t");
			}
        	System.out.println();
        }
    }
    
    //Print Array
    public void printArray(){
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }    
}
