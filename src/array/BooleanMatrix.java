package array;

public class BooleanMatrix {
	
private boolean[][] array;
	
	//Getters
	public boolean[][] getArray() {return array;}
	
	//Setters
	public void setArray(boolean[][] array) {this.array = array;}
	
    //Constructors
    public BooleanMatrix(boolean[][] array){		
    	//create an array with the number o rows in each line
    	int temp;
    	int[] length = new int[array.length];
		for (int line = 0; line < array.length; line++) {
			length[line]=array[line].length;
		}
		//sort this array
		for (int i = 1; i < array.length; i++) {
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
			for (int line = 1; line < array.length; line++) {
				if (array[line].length != array[line-1].length) throw new Exception();
				this.array = array;
			}
		}
		//case not create a matrix with a number of rows equal to the inputed longer row
		catch (Exception matrixNumbersOfRowsDifferent) {
			System.out.println("The number of rows is different for each array.");
			this.array = new boolean[array.length][length[length.length-1]];
			//copy the inputed arrays to the new matrix
			for (int line = 0; line < array.length; line++) {
				for (int row = 0; row < array[line].length; row++) {
					this.array[line][row]=array[line][row];
				}
			}
		}
    }
    
    
    //Setting an element of the Matrix
    //Big-O: O(1)
    public boolean[][] setElementAt(boolean element, int line, int row) {
    	try {
    		array[line][row]=element;
    		return array;
    	}
    	catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
    }
       
    //Accessing an element of the Matrix Array
    //Big-O: O(1)
    public boolean getElementAt(int line,int row){
        try {
            System.out.println(array[line][row]);
            return array[line][row];
        }
        catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return false;
        }
    }
        
    //Searching for an element in the entire matrix
    public int[][] indexOfElement(boolean element){
    	int[][] rowLine = new int[][] {};
    	//Linear Search
        //Big-O O(n*m)
        for (int line = 0; line<array.length; line++) {
    		for (int row = 0; row<array[line].length; row++){
                if (element == array[line][row]) {
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
    public int[] indexOfElement(boolean element,int line) {
		//initialize the row array
    	int[] row = new int[]{};    	
    	//Check if the line is out of bounds
    	try {if (line > array.length || line<0) throw new ArrayIndexOutOfBoundsException();}
		catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
			System.out.println("Array Index is Out of Bounds");			
	        return row;
		}    	
    	//Linear Search
    	//Big-O O(n)
   		for (int j = 0; j<array[line].length; j++){
                if (element == array[line][j]) {
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
    public boolean[][] insertLine(boolean[] elements, int line){
    	
    	//check if the inserted number of elements is different to the matrix number of rows
    	try { if (elements.length != array[0].length) throw new Exception();}
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
		boolean[][] oldArray = array;
		
		array = new boolean[oldArray.length+1][oldArray[0].length];
		
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
	    		
		return array;
    	
    }
    
        
    //Inserting a row
    public boolean[][] insertRow(boolean[] elements, int row){
    	//check if the elements have the same number of lines than the array
		try {if (elements.length != array.length) throw new Exception();}
		catch (Exception insertedNumbersOfLinesDifferent) {
			System.out.println("The inserted number of lines is different for each array.");
			return array;
		}

    	//check if the row is out bounds
		try { if (row>array[0].length || row<0 ) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException OutOfBoundsException) {
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
		
		//Save the old values and initialize the new matrix
        boolean[][] oldArray = array;
        array = new boolean[oldArray.length][oldArray[0].length+1];
 
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
    
    //Print Matrix
    public void printMatrix(){
    	for (int line = 0; line<array.length;line++){
           	for (int row = 0; row < array[line].length; row++) {
        		System.out.print(array[line][row]+"\t");
			}
        	System.out.println();
        }    
    }

}
