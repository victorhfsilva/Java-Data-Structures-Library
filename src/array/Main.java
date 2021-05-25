package array;
public class Main {
	
    public static void main(String[] args)  throws CloneNotSupportedException {
        
//		DOUBLE ARRAY OBJECT
    	System.out.println("DOUBLE ARRAY");
    	System.out.println();
    	
    	//Object initialization
    	System.out.println("Arrays creation");
    	DoubleArray doubleArray1 = new DoubleArray(new double[] {1.3, 3.3, 2.5, 2.7, 4.1, 5.7, 6.8});
    	doubleArray1.printArray();
    	DoubleArray doubleArray2 = new DoubleArray(new double[] {1.2, 3.5, 4.7, 5.8, 7.9, 9.2}, true);
    	doubleArray2.printArray();
    	System.out.println();
    	
    	//Getters
    	double[] double_array1 = doubleArray1.getArray();
    	boolean double_sorted2 = doubleArray2.getSorted();
    	
    	//Setters
    	System.out.println("Arrays setting");
    	doubleArray1.setArray(new double[] {1.6, 2.1, 4.3, 6.2, 6.7, 7.4, 9.6});
    	doubleArray1.setSorted(true);
    	doubleArray1.printArray();
    	doubleArray2.setArray(new double[] {4.5, 8.1, 2.2, 4.5, 5.6, 2.1});
    	doubleArray2.setSorted(false);
    	doubleArray2.printArray();
    	System.out.println();
    	
    	//Set Element At
    	doubleArray1.setElementAt(6.7, 3);
    	doubleArray2.setElementAt(5.2, 4);
    	
    	//Get Element At
    	System.out.println("Get Element");
    	double doubleElement1 = doubleArray1.getElementAt(2);
    	double doubleElement2 = doubleArray2.getElementAt(3);
    	System.out.println();
    	
    	//Index of Element
    	System.out.println("Index Of Element");
    	int[] doubleIndex1 = doubleArray1.indexOfElement(6.7);
    	int[] doubleIndex2 = doubleArray2.indexOfElement(4.5);
    	int[] doubleIndex3 = doubleArray1.indexOfElement(6.7, false);
    	System.out.println();
    	
    	//Insert and delete element 
    	System.out.println("Insert and Delete Element");
    	double[] double_array3 = doubleArray1.insertElement(5.4, 4);
    	doubleArray1.printArray();
    	double[] double_array4 = doubleArray2.deleteElement(3);
    	doubleArray2.printArray();
    	
    	
    	
    	
    	
    	
//    	DoubleArray array1 = new DoubleArray(new double[]{1, 4, 3, 5, 3});
//        StringArray array2 = new StringArray(new String[]{"banana","apple","strawberry","pineapple"});
//        IntegerArray array3 = new IntegerArray(new int[]{3,2,4,5,6,1});
//        ObjectArray objects = new ObjectArray(new ObjectArray[]{array1,array2, array3});       
//       
//        //ARRAY OF ELEMENTS
//        
//        //Print Array
//        System.out.println("Print Array");
//        array1.printArray();
//        System.out.println();
//
//        //Get Element
//        System.out.println("Get Element");
//        array1.getElementAt(4);
//        array2.getElementAt(3);
//        System.out.println();
//
//        //Search Element in not Sorted Matrix
//        System.out.println("Search for Element");
//        array1.indexOfElement(5);
//        array2.indexOfElement("apple");
//        System.out.println();
//
//        //Insert Element in the last index
//        System.out.println("Insert Element");
//        array3.insertElement(40,6);
//        array3.printArray();
//        array2.insertElement("lemon", 3);
//        array2.printArray();
//        System.out.println();
//
//        //Delete Element
//        System.out.println("Delete Element");
//        array1.deleteElement(2);
//        array1.printArray();
//        array2.deleteElement(1);
//        array2.printArray();
//        System.out.println();
//
//        //Sorting the Array
//        System.out.println("Sorting the Array");
//        array1.bubbleSort();
//        array1.printArray();
//        System.out.println();
//        
//        //2D Array of Doubles
//        
//        System.out.println("Searching 2D Array");
//        
//        //Print the inputed matrix
//        System.out.println("Print the Inputed Matrix");
//        double[][] array5_double = {{1.0,2.1,3.0,2.1,4.2},{1.1,4.2,2.4},{5.2,4.2,5.2,3.4}};
//        DoubleMatrix array5 = new DoubleMatrix(array5_double);
//        array5.printMatrix();
//        System.out.println();
//        
//        //Get the index of some elements of the matrix
//        System.out.println("Get the index of some elements");
//        int[][] rowLineInt = array5.indexOfElement(4.2);
//        double[][] rowLine = new double[rowLineInt.length][2];
//        for (int i = 0; i < rowLineInt.length; i++) {
//        	for (int j = 0; j < rowLineInt[i].length; j++) {
//				rowLine[i][j] = (double) rowLineInt[i][j];
//			}
//		}
//        DoubleMatrix RowLine = new DoubleMatrix((double[][]) rowLine);
//        RowLine.printMatrix();
//        System.out.println();
//        
//        //Get the index of elements on specific line
//        int[] row = array5.indexOfElement(5.2,2);
//        IntegerArray Row = new IntegerArray(row);
//        Row.printArray();
//        System.out.println();
//        
//        //Get the index of elements on sorted line
//        array5.bubbleSort(2);
//        array5.printMatrix();
//        row = array5.indexOfElement(5.2, 2);
//        Row.setArray(row);
//        Row.printArray();
//        System.out.println();
//        
//        //Inserting rows to the matrix
//        array5.insertRow(new double[] {2.3, 4.2,3.2},3);
//        array5.printMatrix();
//        System.out.println();
//        
//        array5.insertLine(new double[] {1.2, 1.5, 6.1, 6.2, 4.1, 3.2}, 3);
//        array5.printMatrix();
//        System.out.println();
//        
//        array5.insertionSort(1);
//        System.out.println();
//        array5.printMatrix();
//        System.out.println();
//        
//        //ARRAY OF OBJECTS
//        
//        //Print Objects
//        System.out.println("Print Objects");
//        objects.printObject();
//        System.out.println();
//        
//        //Index of Object
//        System.out.println("Print Index of Object");
//        objects.indexOfObject(array3);
//        System.out.println();
//        
//        //Get Object and Clone It
//        System.out.println("Clone Object");
//        ObjectArray array4 = (ObjectArray) objects.getObjectAt(0).clone();
//        System.out.println();
//       
//        //Insert Object and get its reference
//        System.out.println("Insert Cloned Object");
//        objects.insertObject(array4,3);
//        objects.getObjectAt(2);
//        objects.printObject();
//        System.out.println();
//        
//        //Delete a Object
//        System.out.println("Delete Object");
//        objects.deleteObject(1);
//        objects.printObject();        
    }

}
