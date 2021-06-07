package array;

/**
 * @title String Matrix Library
 * This library has methods to access, set, search, insert and remove lines or rows of a string matrix.
 * 
 * @param matrix
 * 
 * @author Victor Silva
 * @see BooleanMatrix
 * @see IntegerMatrix
 * @see DoubleMatrix
 */

public class StringMatrix extends ObjectArray {
	
	private String[][] matrix;
	
	//Getters
	public String[][] getMatrix() {return matrix;}
	
	//Setters
	public void setMatrix(String[][] matrix) {this.matrix = matrix;}
	
    //Constructors
    public StringMatrix(String[][] matrix){		
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
//		//Print the length array after sorting
//        for (int line = 0; line<length.length; line++){
//            System.out.print(length[line]+"\t");
//        }
//        System.out.println();
	       
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
			this.matrix = new String[matrix.length][length[length.length-1]];
			//copy the inputed arrays to the new matrix
			for (int line = 0; line < matrix.length; line++) {
				for (int row = 0; row < matrix[line].length; row++) {
					this.matrix[line][row]=matrix[line][row];
				}
			}
		}
    }
    
    
    //Setting an element of the Matrix
    //Big-O: O(1)
    public String[][] setElementAt(String element, int line, int row) {
    	try {
    		matrix[line][row]=element;
    		return matrix;
    	}
    	catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return matrix;
        }
    }
       
    //Accessing an element of the Matrix Array
    //Big-O: O(1)
    public String getElementAt(int line,int row){
        try {
            System.out.println(matrix[line][row]);
            return matrix[line][row];
        }
        catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return "";
        }
    }
        
    //Searching for an element in the entire matrix
    public int[][] indexOfElement(String element){
    	int[][] rowLine = new int[][] {};
    	//Linear Search
        //Big-O O(n*m)
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
    public int[] indexOfElement(String element,int line) {
		//initialize the row array
    	int[] row = new int[]{};    	
    	//Check if the line is out of bounds
    	try {if (line > matrix.length || line<0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");			
	        return row;
		}    	
    	//Linear Search
    	//Big-O O(n)
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
		//case the element is not found return a empty array
		if (row.length == 0)System.out.println("The element is not in the Array.");
		return row;
   }
      
    //Inserting a line
    public String[][] insertLine(String[] elements, int line){
    	
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
		String[][] oldArray = matrix;
		
		matrix = new String[oldArray.length+1][oldArray[0].length];
		
		//Insert the line of elements
	    for (int row = 0; row < oldArray[0].length; row++) {
    		for (int i = 0; i<line; i++){
	            matrix[i][row]=oldArray[i][row];
	        }
	        matrix[line][row]=elements[row];
	        for (int i = line+1; i < matrix.length; i++){
	            matrix[i][row]=oldArray[i-1][row];
	        }
	    }
	    		
		return matrix;
    	
    }
    
    //Deleting a line
    public String[][] deleteLine(int line){
    	
    	//check if the line is out bounds
    	try { if (line>matrix.length || line<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return matrix;
	        }
    	
		//Save the old values and initialize the new matrix
		String[][] oldMatrix = matrix;
		
		matrix = new String[oldMatrix.length-1][oldMatrix[0].length];
		
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
	    		
		return matrix;
    	
    }
        
    //Inserting a row
    public String[][] insertRow(String[] elements, int row){
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
        String[][] oldArray = matrix;
        matrix = new String[oldArray.length][oldArray[0].length+1];
 
    	//insert the element and change the line which it was inserted
	    for (int line = 0; line < oldArray.length; line++) {
    		for (int i = 0; i<row; i++){
	            matrix[line][i]=oldArray[line][i];
	        }
	        matrix[line][row]=elements[line];
	        for (int i = row+1; i< matrix[line].length; i++){
	            matrix[line][i]=oldArray[line][i-1];
	        }
	    }
	    
        return matrix;
    }
    
    //Deleting a row
    public String[][] deleteRow(int row){
    	
    	//check if the line is out bounds
    	try { if (row>matrix[0].length || row<0 ) throw new ArrayIndexOutOfBoundsException();}
	        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
	            System.out.println("Array Index is Out of Bounds");
	            return matrix;
	        }
    	
		//Save the old values and initialize the new matrix
		String[][] oldMatrix = matrix;
		
		matrix = new String[oldMatrix.length][oldMatrix[0].length-1];
		
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
