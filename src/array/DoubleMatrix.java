package array;

/**
 * @title Double Matrix Library
 * This library has methods to access, set, search, sort, insert and remove lines 
 * or rows of a integer matrix.
 * 
 * @param matrix
 * @param sorted: array of booleans specifying which lines are sorted
 * 
 * @author Victor Silva
 * @see StringMatrix
 * @see IntegerMatrix
 * @see BooleanMatrix
 */

public class DoubleMatrix extends ObjectArray{
	
	private double[][] matrix;
	private boolean[]  sorted;
	
	//Getters
	public double[][] getMatrix() {return matrix;}
	public boolean[] getSorted(){return sorted;}
	
	//Setters
	public void setMatrix(double[][] matrix) {this.matrix = matrix;}
	public void setSorted(boolean[] sorted){this.sorted = sorted;}
	
    //Constructors
    public DoubleMatrix(double[][] matrix){
		
    	//create an array with the number o rows in each line
    	int temp;
    	int[] length = new int[matrix.length];
		for (int line = 0; line < matrix.length; line++) {
			length[line]=matrix[line].length;
		}
		//sort this array
		for (int i = 1; i < matrix.length; i++) {
	            for (int j=i; j>0; j--){
	                if (length[i]<length[j-1]){
                    	temp =  length[j-1];
                        length[j-1] = length[j];
                        length[j] = temp;
	                }
	            }
		}		
	       
    	//check if each line of the array has the same number of rows
		try {
			for (int line = 1; line < matrix.length; line++) {
				if (matrix[line].length != matrix[line-1].length) throw new Exception();
				this.matrix = matrix;
			}
		}
		//case not create a matrix with a number of rows equal to the inputed longer row
		catch (Exception matrixNumbersOfRowsDifferent) {
			System.out.println("The number of rows is different for each array.");
			this.matrix = new double[matrix.length][length[length.length-1]];
			//copy the inputed arrays to the new matrix
			for (int line = 0; line < matrix.length; line++) {
				for (int row = 0; row < matrix[line].length; row++) {
					this.matrix[line][row]=matrix[line][row];
				}
			}
		}
    	//create a sorted array with false values with the same length as the array matrix 
        sorted = new boolean[matrix.length];
        for (int line = 0; line < matrix.length; line++) {
			sorted[line] = false;
		}
    }
    
    public DoubleMatrix(double[][] matrix, boolean[] sorted){
    	
    	//create an array with the number o rows in each line
    	int temp;
    	int[] length = new int[matrix.length];
		for (int line = 0; line < matrix.length; line++) {
			length[line]=matrix[line].length;
		}
		//sort this array
		for (int i = 1; i < matrix.length; i++) {
	            for (int j=i; j>0; j--){
	                if (length[i]<length[j-1]){
                    	temp =  length[j-1];
                        length[j-1] = length[j];
                        length[j] = temp;
	                }
	            }
		}		
	       
    	//check if each line of the array has the same number of rows
		try {
			for (int line = 1; line < matrix.length; line++) {
				if (matrix[line].length != matrix[line-1].length) throw new Exception();
			}
			this.matrix = matrix;
		}
		//case not create a matrix with a number of rows equal to the inputed longer row
		catch (Exception matrixNumbersOfRowsDifferent) {
			System.out.println("The number of rows is different for each array.");
			this.matrix = new double[matrix.length][length[length.length-1]];
			//copy the inputed arrays to the new matrix
			for (int line = 0; line < matrix.length; line++) {
				for (int row = 0; row < matrix[line].length; row++) {
					this.matrix[line][row]=matrix[line][row];
				}
			}
		}
        
        //Check if sorted has the same length as array
        try { 
        		if (sorted.length != matrix.length) throw new Exception();
        		this.sorted = sorted;
    		}
        catch (Exception sortedNumberOfRowsDifferent) {
        	System.out.println("The number of rows is different for each array.");
        	for (int line = 0; line < matrix.length; line++) {
    			sorted[line]=false;
    		}
        }
    }
    
    //Setting an element of the Matrix
    public double[][] setElementAt(double element, int line, int row) {
    	try {
    		matrix[line][row]=element;
    		return matrix;
    	}
    	catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return matrix;
        }
    }
    
    //Setting an element of the Sorted
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
    public double getElementAt(int line,int row){
        try {
            System.out.println(matrix[line][row]);
            return matrix[line][row];
        }
        catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return -1;
        }
    }
    
    //Accessing an element of the Sorted Array
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
    public int[][] indexOfElement(double element){
    	int[][] rowLine = new int[][] {};
    	//Linear Search
        for (int line = 0; line<matrix.length; line++) {
    		for (int row = 0; row<matrix[line].length; row++){
                if (element == matrix[line][row]) {
                	System.out.println("The element is in the line "+line+" and row "+row);                	
                	//Save the old values and initialize the new matrix
            		int[][] oldRowLine = rowLine;            		
            		rowLine = new int[rowLine.length+1][2];            		
            		//Insert the old values
            	    for (int  i = 0; i < oldRowLine.length; i++) {
                		for (int j = 0; j<2; j++){
            	            rowLine[i][j]=oldRowLine[i][j];
            	        }
            	    }
            	    //Save the row and line index
            	    rowLine[oldRowLine.length][0]=line; rowLine[oldRowLine.length][1]=row;
                }
            }
        }
        //case the element is not found return a empty array
        if (rowLine.length == 0) System.out.println("The element is not on the array.");
        return rowLine;
    }
    
    //Searching for an element in a specific row of the matrix
    public int[] indexOfElement(double element,int line) {
		//initialize the row array
    	int[] row = new int[]{};    	
    	//Check if the line is out of bounds
    	try {if (line > matrix.length || line<0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");			
	        return row;
		}    	
	    //Binary Search
	    if (sorted[line]){
		   int row_end = matrix[line].length-1;
	       int row_beginning = 0;
	       while(row_beginning<=row_end){	           
	    	   int row_middle = (row_beginning+row_end)/2;	           
	           //case the element is bigger than the middle value
	    	   if (element>matrix[line][row_middle]) row_beginning = row_middle+1;	           
	           //case the element is smaller than the middle value
	    	   else if (element<matrix[line][row_middle]) row_end = row_middle-1;	           
	           //case the element is equal the middle value
	           else if (element==matrix[line][row_middle]) {
	               System.out.println("The element is in the row "+row_middle);	               
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
		       	    while(element == matrix[line][row_middle_left]) {
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
		       	    while(element == matrix[line][row_middle_right]) {
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
	       		for (int j = 0; j<matrix[line].length; j++){
		                if (element == matrix[line][j]) {
		                    System.out.println("The element is in the row "+j);		                    
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
		        }
	    		//case the element is not found return a empty array
	    		if (row.length == 0)System.out.println("The element is not in the Array.");
	    		return row;
   }
  
    //Searching for an element in a specific row of the matrix while setting if the row is sorted
    public int[] indexOfElement(double element,int line, boolean sortedLine) {
    	//initialize the row array
    	int[] row = new int[]{};
    	//Check if the line is out of bounds
    	try {if (line > matrix.length || line<0) throw new ArrayIndexOutOfBoundsException();}
    	catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
    		System.out.println("Array Index is Out of Bounds");
            return row;
    	}
    	//set the line sorted value to the inputed value
    	this.sorted[line] = sortedLine;
    	//Binary Search
        if (sorted[line]){
        	int row_end = matrix[line].length-1;
 	       	int row_beginning = 0;
 	       	while(row_beginning<=row_end){ 	           
 	    	   int row_middle = (row_beginning+row_end)/2;
 	    	   //case the element is bigger than the middle value
 	           if (element>matrix[line][row_middle]) row_beginning = row_middle+1;
 	           //case the element is smaller than the middle value
 	           else if (element<matrix[line][row_middle]) row_end = row_middle-1;
 	           //case the element is equal the middle value
 	           else if (element==matrix[line][row_middle]) {
 	               	System.out.println("The element is in the row "+row_middle); 	               
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
	 	       	    while(element == matrix[line][row_middle_left]) {
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
	 	       	    while(element == matrix[line][row_middle_right]) {
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
       		for (int j = 0; j<matrix[line].length; j++){
	                if (element == matrix[line][j]) {
	                    System.out.println("The element is in the row "+j);	                    
	                    //Save the old values and initialize the new matrix
	    	       		int[] oldRow = row;	    	       		
	    	       		row = new int[row.length+1];	    	       		
	    	       		//Insert the old values
	    	       	    for (int  i = 0; i < oldRow.length; i++) {
	           	            row[i]=oldRow[i];
	    	       	    }
	    	       	    row[oldRow.length]=j;		                   
	                }
	            }
	        }
    		if (row.length == 0)System.out.println("The element is not in the Array.");
    		return row;
    }
    
    //Inserting a line
    public double[][] insertLine(double[] elements, int line){
    	
    	//check if the inserted number of elements is different to the matrix number of rows
    	try { if (elements.length != matrix[0].length) throw new Exception();}
    	catch (Exception insertedNumbersOfRowsDifferent) {
    		System.out.println("The inserted number of rows is different from the matrix.");
    		return matrix;
    	}
    	
    	//check if the line is out bounds
    	try { if (line>matrix.length || line<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return matrix;
	        }
    	
		//Save the old values and initialize the new matrix
		double[][] oldMatrix = matrix;
		boolean[] oldSorted = sorted;
		
		matrix = new double[oldMatrix.length+1][oldMatrix[0].length];
    	sorted = new boolean[oldSorted.length+1];
		
		//Insert the line of elements
	    for (int row = 0; row < oldMatrix[0].length; row++) {
    		for (int i = 0; i<line; i++){
	            matrix[i][row]=oldMatrix[i][row];
	        }
	        matrix[line][row]=elements[row];
	        for (int i = line+1; i < matrix.length; i++){
	            matrix[i][row]=oldMatrix[i-1][row];
	        }
	    }
	    
	    //Insert the sorted elements
        for (int i = 0; i<line; i++){
            sorted[i]=oldSorted[i];
        }
        sorted[line]=false;
        for (int i = line+1; i< sorted.length; i++){
            sorted[i]=oldSorted[i-1];
        }
		
		return matrix;
    	
    }
    
    //Inserting a line
    public double[][] insertLine(double[] elements, int line, boolean sortedLine){
    	    	
    	//check if the inserted number of elements is equal to the matrix number of rows
    	try { if (elements.length != matrix[0].length) throw new Exception();}
    	catch (Exception insertedNumbersOfRowsDifferent) {
    		System.out.println("The inserted number of rows is different from the matrix.");
    		return matrix;
    	}
    	
    	//check if the line is out bounds
    	try { if (line>matrix.length || line<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return matrix;
	        }
    	
		//Save the old values and initialize the new matrix
		double[][] oldMatrix = matrix;
		boolean[] oldSorted = sorted;
		
		matrix = new double[oldMatrix.length+1][oldMatrix[0].length];
    	sorted = new boolean[oldSorted.length+1];
		
		//Insert the line of elements
	    for (int row = 0; row < oldMatrix[0].length; row++) {
    		for (int i = 0; i<line; i++){
	            matrix[i][row]=oldMatrix[i][row];
	        }
	        matrix[line][row]=elements[row];
	        for (int i = line+1; i < matrix.length; i++){
	            matrix[i][row]=oldMatrix[i-1][row];
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
		
		return matrix;
    	
    }

    //Deleting a line
    public double[][] deleteLine(int line){
    	
    	//check if the line is out bounds
    	try { if (line>matrix.length || line<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return matrix;
	        }
    	
		//Save the old values and initialize the new matrix
		double[][] oldMatrix = matrix;
		boolean[] oldSorted = sorted;
		
		matrix = new double[oldMatrix.length-1][oldMatrix[0].length];
    	sorted = new boolean[oldSorted.length-1];
		
		//Insert the line of elements
    	for (int i = 0; i<line; i++){
    		for (int row = 0; row < oldMatrix[0].length; row++){
	            matrix[i][row]=oldMatrix[i][row];
	        }
    	}
    	for (int i = line; i < matrix.length; i++){
    		for (int row = 0; row < oldMatrix[0].length; row++){
	            matrix[i][row]=oldMatrix[i+1][row];
	        }
	    }
	    
	    //Insert the sorted elements
        for (int i = 0; i<line; i++){
            sorted[i]=oldSorted[i];
        }
        for (int i = line; i< sorted.length; i++){
            sorted[i]=oldSorted[i+1];
        }
		
		return matrix;
    	
    }
    
    //Inserting a row
    public double[][] insertRow(double[] elements, int row){
    	//check if the elements have the same number of lines than the array
		try {if (elements.length != matrix.length) throw new Exception();}
		catch (Exception insertedNumbersOfLinesDifferent) {
			System.out.println("The inserted number of lines is different for each array.");
			return matrix;
		}

    	//check if the row is out bounds
		try { if (row>matrix[0].length || row<0 ) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
            System.out.println("Array Index is Out of Bounds");
            return matrix;
        }
		
		//Save the old values and initialize the new matrix
        double[][] oldMatrix = matrix;
        matrix = new double[oldMatrix.length][oldMatrix[0].length+1];
 
    	//insert the element and change the line which it was inserted
	    for (int line = 0; line < oldMatrix.length; line++) {
    		for (int i = 0; i<row; i++){
	            matrix[line][i]=oldMatrix[line][i];
	        }
	        matrix[line][row]=elements[line];
	        for (int i = row+1; i< matrix[line].length; i++){
	            matrix[line][i]=oldMatrix[line][i-1];
	        }
	    }
	    
        return matrix;
    }
    
    //Inserting a row
    public double[][] insertRow(double[] elements, int row, boolean sorted){
    	//check if the elements have the same number of lines than the array
		try {if (elements.length != matrix.length) throw new Exception();}
		catch (Exception insertedNumbersOfLinesDifferent) {
			System.out.println("The inserted number of lines is different for each array.");
			return matrix;
		}

    	//check if the row is out bounds
		try { if (row>matrix[0].length || row<0 ) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
            System.out.println("Array Index is Out of Bounds");
            return matrix;
        }
		
		//Save the old values and initialize the new matrix
        double[][] oldMatrix = matrix;
        matrix = new double[oldMatrix.length][oldMatrix[0].length+1];
 
    	//insert the element and change the line which it was inserted
	    for (int line = 0; line < oldMatrix.length; line++) {
    		for (int i = 0; i<row; i++){
	            matrix[line][i]=oldMatrix[line][i];
	        }
	        matrix[line][row]=elements[line];
	        for (int i = row+1; i< matrix[line].length; i++){
	            matrix[line][i]=oldMatrix[line][i-1];
	        }
	    }
	    
	    //case sorted is false, make sorted array false
	    if (!sorted) {
		    for (int i = 0; i < this.sorted.length; i++){
		        this.sorted[i]=false;
		    }
	    }
	    
        return matrix;
    }   

    //Deleting a row
    public double[][] deleteRow(int row){
    	
    	//check if the line is out bounds
    	try { if (row>matrix[0].length || row<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return matrix;
	        }
    	
		//Save the old values and initialize the new matrix
		double[][] oldMatrix = matrix;
		
		matrix = new double[oldMatrix.length][oldMatrix[0].length-1];
		
		//Insert the line of elements
		for (int j = 0; j < row; j++){
			for (int line = 0; line<oldMatrix.length; line++){
	            matrix[line][j]=oldMatrix[line][j];
	        }
    	}
    	for (int j = row; j < matrix[0].length; j++){
    		for (int line = 0; line < oldMatrix.length; line++){
	            matrix[line][j]=oldMatrix[line][j+1];
	        }
	    }
	    
		return matrix;	
    } 
    
    public double[][] deleteRow(int row, boolean sorted){
    	
    	//check if the line is out bounds
    	try { if (row>matrix[0].length || row<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return matrix;
	        }
    	
		//Save the old values and initialize the new matrix
		double[][] oldMatrix = matrix;
		
		matrix = new double[oldMatrix.length][oldMatrix[0].length-1];
		
		//Insert the line of elements
		for (int j = 0; j < row; j++){
			for (int line = 0; line<oldMatrix.length; line++){
	            matrix[line][j]=oldMatrix[line][j];
	        }
    	}
    	for (int j = row; j < matrix[0].length; j++){
    		for (int line = 0; line < oldMatrix.length; line++){
	            matrix[line][j]=oldMatrix[line][j+1];
	        }
	    }
	    
    	//case sorted is false, make sorted array false
	    if (!sorted) {
		    for (int i = 0; i < this.sorted.length; i++){
		        this.sorted[i]=false;
		    }
	    }		
		return matrix;	
    } 
    
    //Sorting the Data
    
    //Insertion Sort
    public double[][] insertionSort(int line){
    	for (int j =1; j<matrix[line].length; j++) {
    		double[] temp = new double[matrix.length];
    		for (int i = 0; i < matrix.length; i++) {
    			temp[i] = matrix[i][j];
			}
    		int k = j - 1;
    		while (k>=0 && matrix[line][k] > temp[line]) {
    			for (int i = 0; i < matrix.length; i++) {
    				matrix[i][k+1]=matrix[i][k];
				}   		
    			k--;
    		}
    		for (int i = 0; i < matrix.length; i++) {
    			matrix[i][k+1] = temp[i];
    		}    		
    	}    	
    	for (int k = 0; k < line; k++) {
    		sorted[k] = false;  		
		}
		sorted[line] = true;
		for (int k = line+1; k < matrix.length; k++) {
			sorted[k] = false;  		
		}    	
		return matrix;    	
    }
        
    //Bubble Sort
    public double[][] bubbleSort(int line){
    	double[] temp = new double[matrix.length];
    	for (int k = 0; k < matrix[line].length-1; k++) {
    		for (int j = 0; j < matrix[line].length-k-1; j++) {
    			if (matrix[line][j]>matrix[line][j+1]) {
    				for (int i = 0; i < matrix.length; i++) {
    					temp[i] = matrix[i][j];
    					matrix[i][j]=matrix[i][j+1];
    					matrix[i][j+1]=temp[i];
    				}
    			}
    		}
    	}    	
    	for (int k = 0; k < line; k++) {
    		sorted[k] = false;  		
		}
		sorted[line] = true;
		for (int k = line+1; k < matrix.length; k++) {
			sorted[k] = false;  		
		}    	
    	return matrix;
    }
    
    //Print Matrix
    public void printMatrix(){
        for (int line = 0; line<matrix.length;line++){
           	for (int row = 0; row < matrix[line].length; row++) {
        		System.out.print(matrix[line][row]+"\t");
			}
        	System.out.println();
        }
    }
     
}
