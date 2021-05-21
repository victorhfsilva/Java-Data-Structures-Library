package array;

import java.util.Iterator;

public class DoubleMatrix extends Objects{
	
	private double[][] array;
	private boolean sorted = false;
	
	//Getters
	public double[][] getArray() {
		return array;
	}
	public boolean getSorted(){return sorted;}
	
	//Setters
	public void setArray(double[][] array) {
		this.array = array;
	}
	public void setSorted(boolean sorted){this.sorted = sorted;}
	
    //Constructors
    public DoubleMatrix(double[][] array){
        this.array = array;
    }
    DoubleMatrix(double[][] array, boolean sorted){
        this.array = array;
        this.sorted = sorted;
    }
    
    //Setting an element
    //Big-O: O(1)
    public double[][] setElementAt(double element, int line, int row) {
    	try {
    		array[line][row]=element;
    		return array;
    	}
    	catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
    }
   
    //Accessing an element
    //Big-O: O(1)
    public double getElementAt(int line,int row){
        try {
            System.out.println(array[line][row]);
            return array[line][row];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return -1;
        }
    }
    
    //Searching for an element
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

    public int indexOfElement(double element,int line) {
   	//Binary Search
       //Big-O: O(log2(n))
       if (sorted){
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
    
    public int indexOfElement(double element,int line, boolean sorted) {
    	 this.sorted = sorted;
    	//Binary Search
        //Big-O: O(log2(n))
        if (sorted){
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
    
    //Inserting an element
    //Big-O: O(n)
    public double[][] insertElement(double element,int line,int row){
        try { if (row>array[line].length || row<0 || line>=array.length || line<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        double[][] oldArray = array;
        //case the element is going to be inserted in the last index
        if (row == array[line].length) {
            array = new double[oldArray.length][oldArray[line].length+1];
            array[line][oldArray[line].length]=element;
        }
        //case the element is going to be inserted elsewhere
        else {
            double temp = array[line][row];
            array = new double[oldArray.length][oldArray[line].length + 1];
        }
        //copy the arrays that won't be changed
        for (int i = 0; i < oldArray.length; i++) {
			for (int j = 0; j < oldArray[i].length; j++) {
				if(i != line) {
					array[i][j]=oldArray[i][j];
				}
			}
		}
        //insert the element and change the line which it was inserted
        for (int i = 0; i<row; i++){
            array[line][i]=oldArray[line][i];
        }
        array[line][row]=element;
        for (int i = row+1; i< array[line].length; i++){
            array[line][i]=oldArray[line][i-1];
        }
        return array;
    }   
    
    //Sorting the Data
    //Insertion Sort
    //Big-O O(n²)
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
        sorted = true;
        return array;
    }

    //Bubble Sort
    //Big-O O(n²)
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
        sorted = true;
        return array;
    }
    
    //Print Array
    public void printArray(){
        for (int line = 0; line<array.length;line++){
           	for (int row = 0; row < array[line].length; row++) {
        		System.out.print(array[line][row]+"\t");
			}
        	System.out.println();
        }
        
    }
    
}
