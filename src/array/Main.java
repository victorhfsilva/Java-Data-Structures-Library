package array;
public class Main {
	
    public static void main(String[] args)  throws CloneNotSupportedException {
        
    	//	DOUBLE MATRIX OBJECT
    	System.out.println("DOUBLE MATRIX");
    	System.out.println();
    	
    	//Object initialization
    	System.out.println("Arrays creation");
    	DoubleMatrixMath doubleMatrix1 = new DoubleMatrixMath(new double[][] {{1.3, 3.3, 2.5, 2.7, 4.1, 5.7, 6.8},{0.3, 2.3, 1.5, 3.7, 2.1, 2.7, 3.8}});
    	doubleMatrix1.printMatrix();
    	DoubleMatrixMath doubleMatrix2 = new DoubleMatrixMath(new double[][] {{1.2, 3.5, 4.7, 5.8, 7.9, 9.2},
												{1.2, 3.5, 4.7, 5.8, 7.9, 9.2}}, new boolean[] {true, false});
    	
    	doubleMatrix2.printMatrix();
    	System.out.println();
    	
    	//Getters
    	double[][] matrix1 = doubleMatrix1.getMatrix();
    	boolean[] sorted1 = doubleMatrix2.getSorted();
    	
    	//Setters
    	System.out.println("Arrays setting");
    	doubleMatrix1.setMatrix(new double[][] {{1.6, 2.1, 4.3, 6.2, 6.7, 7.4, 9.6},{1.2, 7.2, 5.0, 6.1, 6.7, 3.4, 5.6}});
    	doubleMatrix1.setSorted(new boolean[] {true,false});
    	doubleMatrix1.printMatrix();
    	doubleMatrix2.setMatrix(new double[][] {{4.5, 8.1, 2.2, 4.5, 5.6, 2.1},{4.2, 5.1, 6.2, 7.5, 8.6, 1.1}});
    	doubleMatrix2.setSorted(new boolean[] {false,false});
    	doubleMatrix2.printMatrix();
    	System.out.println();
    	
    	//Set Element At
    	doubleMatrix1.setElementAt(6.7, 1, 3);
    	doubleMatrix2.setElementAt(5.2, 0, 4);
    	
    	//Get Element At
    	System.out.println("Get Element");
    	double Element1 = doubleMatrix1.getElementAt(1,5);
    	double Element2 = doubleMatrix2.getElementAt(0,3);
    	boolean sorted2 = doubleMatrix1.getSortedAt(0);
    	boolean sorted3 = doubleMatrix1.getSortedAt(1);
    	System.out.println();
    	
    	//Index of Element
    	System.out.println("Index Of Element");
    	int[] Index1 = doubleMatrix1.indexOfElement(6.7,0);
    	int[][] Index2 = doubleMatrix2.indexOfElement(4.5);
    	int[] Index3 = doubleMatrix1.indexOfElement(6.7,0, false);
    	System.out.println();
    	
    	//Insert and delete element 
    	System.out.println("Insert and Delete Element");
    	double[][] matrix2 = doubleMatrix1.insertLine(new double[] {1.6, 2.1, 2.3, 3.2, 2.7, 1.4, 2.6}, 1);
    	doubleMatrix1.printMatrix();
    	System.out.println();
    	
    	double[][] matrix3 = doubleMatrix1.insertLine(new double[] {1.6, 2.1, 4.3, 6.2, 6.7, 7.4, 9.6}, 3, true);
    	doubleMatrix1.printMatrix();
    	System.out.println();
    	
    	double[][] matrix4 = doubleMatrix1.insertRow(new double[] {1.6, 2.1, 2.3, 3.2}, 5);
    	doubleMatrix1.printMatrix();
    	System.out.println();
    	
    	double[][] matrix5 = doubleMatrix1.insertRow(new double[] {1.6, 2.1, 2.3, 3.2}, 5, false);
    	doubleMatrix1.printMatrix();
    	System.out.println();
    	
    	doubleMatrix1.deleteLine(0);
    	doubleMatrix1.printMatrix();    	
    	System.out.println();
    	
    	doubleMatrix1.deleteRow(0);
    	doubleMatrix1.printMatrix();    	
    	System.out.println();
    	
    	doubleMatrix1.deleteRow(7, false);
    	doubleMatrix1.printMatrix();    	
    	System.out.println();
   	
    	//Sorting the array
    	System.out.println("Sorting the array");
    	double[][] matrix6 = doubleMatrix1.insertionSort(0);
    	doubleMatrix1.printMatrix();
    	System.out.println();
    	
    	double[][] matrix7 = doubleMatrix2.bubbleSort(0);
    	doubleMatrix2.printMatrix();
    	System.out.println();

//    	//Double Math
//    	System.out.println("Summation and Product");
//    	double summation = doubleMatrix1.summation();
//    	System.out.println(summation);
//    	double product = doubleMatrix2.product();
//    	System.out.println(product);
//    	System.out.println();
//    	
//    	System.out.println("Scalar Sum");
//    	double[] array7 = doubleMatrix1.scalarSum(3.4);
//    	doubleMatrix1.setArray(array7);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Subtraction");
//    	double[] array8 = doubleMatrix1.scalarSubtraction(3.4);
//    	doubleMatrix1.setArray(array8);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Multiplication");
//    	double[] array9 = doubleMatrix1.scalarMultiplication(3.4);
//    	doubleMatrix1.setArray(array9);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Division");
//    	double[] array10 = doubleMatrix1.scalarDivision(3.4);
//    	doubleMatrix1.setArray(array10);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Remainder");
//    	double[] array11 = doubleMatrix1.scalarRemainder(1.21);
//    	doubleMatrix1.setArray(array11);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Sum");
//    	double[] array12 = doubleMatrix1.sum(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleMatrix1.setArray(array12);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Subtraction");
//    	double[] array13 = doubleMatrix1.subtraction(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleMatrix1.setArray(array13);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Multiplication");
//    	double[] array14 = doubleMatrix1.elementMultiplication(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleMatrix1.setArray(array14);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Division");
//    	double[] array15 = doubleMatrix1.elementDivision(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleMatrix1.setArray(array15);
//    	doubleMatrix1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Remainder");
//    	double[] array16 = doubleMatrix1.elementRemainder(new double[] {0.02, 0.12, .02, .17, .29, .089, .04, .1});
//    	doubleMatrix1.setArray(array16);
//    	doubleMatrix1.printArray();
//    	System.out.println();
    	
//    	//		DOUBLE ARRAY OBJECT
//    	System.out.println("DOUBLE ARRAY");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	DoubleArrayMath doubleArray1 = new DoubleArrayMath(new double[] {1.3, 3.3, 2.5, 2.7, 4.1, 5.7, 6.8});
//    	doubleArray1.printArray();
//    	DoubleArrayMath doubleArray2 = new DoubleArrayMath(new double[] {1.2, 3.5, 4.7, 5.8, 7.9, 9.2}, true);
//    	doubleArray2.printArray();
//    	System.out.println();
//    	
//    	//Getters
//    	double[] array1 = doubleArray1.getArray();
//    	boolean sorted2 = doubleArray2.getSorted();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	doubleArray1.setArray(new double[] {1.6, 2.1, 4.3, 6.2, 6.7, 7.4, 9.6});
//    	doubleArray1.setSorted(true);
//    	doubleArray1.printArray();
//    	doubleArray2.setArray(new double[] {4.5, 8.1, 2.2, 4.5, 5.6, 2.1});
//    	doubleArray2.setSorted(false);
//    	doubleArray2.printArray();
//    	System.out.println();
//    	
//    	//Set Element At
//    	doubleArray1.setElementAt(6.7, 3);
//    	doubleArray2.setElementAt(5.2, 4);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	double Element1 = doubleArray1.getElementAt(2);
//    	double Element2 = doubleArray2.getElementAt(3);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = doubleArray1.indexOfElement(6.7);
//    	int[] Index2 = doubleArray2.indexOfElement(4.5);
//    	int[] Index3 = doubleArray1.indexOfElement(6.7, false);
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	double[] array3 = doubleArray1.insertElement(5.4, 4);
//    	doubleArray1.printArray();
//    	double[] array4 = doubleArray2.deleteElement(0);
//    	doubleArray2.printArray();
//    	System.out.println();
//    	
//    	//Sorting the array
//    	System.out.println("Sorting the array");
//    	double[] array5 = doubleArray1.insertionSort();
//    	doubleArray1.printArray();
//    	double[] array6 = doubleArray2.bubbleSort();
//    	doubleArray2.printArray();
//    	System.out.println();
//    	
//    	//Double Math
//    	System.out.println("Summation and Product");
//    	double summation = doubleArray1.summation();
//    	System.out.println(summation);
//    	double product = doubleArray2.product();
//    	System.out.println(product);
//    	System.out.println();
//    	
//    	System.out.println("Scalar Sum");
//    	double[] array7 = doubleArray1.scalarSum(3.4);
//    	doubleArray1.setArray(array7);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Subtraction");
//    	double[] array8 = doubleArray1.scalarSubtraction(3.4);
//    	doubleArray1.setArray(array8);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Multiplication");
//    	double[] array9 = doubleArray1.scalarMultiplication(3.4);
//    	doubleArray1.setArray(array9);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Division");
//    	double[] array10 = doubleArray1.scalarDivision(3.4);
//    	doubleArray1.setArray(array10);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Remainder");
//    	double[] array11 = doubleArray1.scalarRemainder(1.21);
//    	doubleArray1.setArray(array11);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Sum");
//    	double[] array12 = doubleArray1.sum(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleArray1.setArray(array12);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Subtraction");
//    	double[] array13 = doubleArray1.subtraction(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleArray1.setArray(array13);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Multiplication");
//    	double[] array14 = doubleArray1.elementMultiplication(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleArray1.setArray(array14);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Division");
//    	double[] array15 = doubleArray1.elementDivision(new double[] {2.1, 4.2, 5.2, 5.7, 8.9, 10.9, 5.2, 9.1});
//    	doubleArray1.setArray(array15);
//    	doubleArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Remainder");
//    	double[] array16 = doubleArray1.elementRemainder(new double[] {0.02, 0.12, .02, .17, .29, .089, .04, .1});
//    	doubleArray1.setArray(array16);
//    	doubleArray1.printArray();
//    	System.out.println();
    	
////		INTEGER ARRAY OBJECT
//    	System.out.println("INTEGER ARRAY");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	IntegerArrayMath integerArray1 = new IntegerArrayMath(new int[] {1, 3, 2, 2, 4, 5, 6});
//    	integerArray1.printArray();
//    	IntegerArrayMath  integerArray2 = new IntegerArrayMath(new int[] {1, 3, 4, 5, 7, 9}, true);
//    	integerArray2.printArray();
//    	System.out.println();
//    	
//    	//Getters
//    	int[] array1 = integerArray1.getArray();
//    	boolean sorted2 = integerArray2.getSorted();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	integerArray1.setArray(new int[] {1, 2, 4, 6, 6, 7, 9});
//    	integerArray1.setSorted(true);
//    	integerArray1.printArray();
//    	integerArray2.setArray(new int[] {4, 8, 2, 4, 5, 2});
//    	integerArray2.setSorted(false);
//    	integerArray2.printArray();
//    	System.out.println();
//    	
//    	//Set Element At
//    	integerArray1.setElementAt(6, 3);
//    	integerArray2.setElementAt(5, 4);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	double Element1 = integerArray1.getElementAt(2);
//    	double Element2 = integerArray2.getElementAt(3);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = integerArray1.indexOfElement(6);
//    	int[] Index2 = integerArray2.indexOfElement(4);
//    	int[] Index3 = integerArray1.indexOfElement(6, false);
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	int[] array3 = integerArray1.insertElement(5, 4);
//    	integerArray1.printArray();
//    	int[] array4 = integerArray2.deleteElement(3);
//    	integerArray2.printArray();
//    	System.out.println();
//    	
//    	//Sorting the array
//    	System.out.println("Sorting the array");
//    	int[] array5 = integerArray1.insertionSort();
//    	integerArray1.printArray();
//    	int[] array6 = integerArray2.bubbleSort();
//    	integerArray2.printArray();
//    	System.out.println();
//    	
//    	//Double Math
//    	System.out.println("Summation and Product");
//    	double summation = integerArray1.summation();
//    	System.out.println(summation);
//    	double product = integerArray2.product();
//    	System.out.println(product);
//    	System.out.println();
//    	
//    	System.out.println("Scalar Sum");
//    	int[] array7 = integerArray1.scalarSum(3);
//    	integerArray1.setArray(array7);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Subtraction");
//    	int[] array8 = integerArray1.scalarSubtraction(3);
//    	integerArray1.setArray(array8);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Multiplication");
//    	int[] array9 = integerArray1.scalarMultiplication(3);
//    	integerArray1.setArray(array9);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Division");
//    	int[] array10 = integerArray1.scalarDivision(3);
//    	integerArray1.setArray(array10);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Scalar Remainder");
//    	int[] array11 = integerArray1.scalarRemainder(2);
//    	integerArray1.setArray(array11);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Sum");
//    	int[] array12 = integerArray1.sum(new int[] {2, 4, 5, 5, 8, 10, 5, 9});
//    	integerArray1.setArray(array12);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Subtraction");
//    	int[] array13 = integerArray1.subtraction(new int[] {1, 2, 3, 2, 2, 5, 2, 3});
//    	integerArray1.setArray(array13);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Multiplication");
//    	int[] array14 = integerArray1.elementMultiplication(new int[] {2, 4, 5, 5, 8, 10, 5, 9});
//    	integerArray1.setArray(array14);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Division");
//    	int[] array15 = integerArray1.elementDivision(new int[] {1, 2, 3, 2, 2, 4, 2, 3});
//    	integerArray1.setArray(array15);
//    	integerArray1.printArray();
//    	System.out.println();
//    	
//    	System.out.println("Array Remainder");
//    	int[] array16 = integerArray1.elementRemainder(new int[] {3, 3, 2, 3, 7, 5, 7, 8});
//    	integerArray1.setArray(array16);
//    	integerArray1.printArray();
//    	System.out.println();

////		STRING ARRAY OBJECT
//    	System.out.println("STRING ARRAY");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	StringArray stringArray1 = new StringArray(new String[] {"apple", "banana", "strawberry", "pineapple", "grape", "blueberry", "coconut"});
//    	stringArray1.printArray();
//    	System.out.println();
//    	
//    	//Getters
//    	String[] array1 = stringArray1.getArray();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	stringArray1.setArray(new String[] {"banana", "grape", "apple", "coconut", "grape", "blueberry"});
//    	stringArray1.printArray();
//    	System.out.println();
//    	
//    	//Set Element At
//    	stringArray1.setElementAt("banana", 3);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	String Element1 = stringArray1.getElementAt(2);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = stringArray1.indexOfElement("banana");
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	String[] array3 = stringArray1.insertElement("pineapple", 4);
//    	stringArray1.printArray();
//    	String[] array4 = stringArray1.deleteElement(3);
//    	stringArray1.printArray();
//    	System.out.println();    	
    	
////		BOOLEAN ARRAY OBJECT
//    	System.out.println("BOOLEAN ARRAY");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	BooleanArray booleanArray1 = new BooleanArray(new boolean[] {true, false, false, true, false, true, true});
//    	booleanArray1.printArray();
//    	System.out.println();
//    	
//    	//Getters
//    	boolean[] array1 = booleanArray1.getArray();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	booleanArray1.setArray(new boolean[] {false, true, false, false, true, true});
//    	booleanArray1.printArray();
//    	System.out.println();
//    	
//    	//Set Element At
//    	booleanArray1.setElementAt(true, 3);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	boolean Element1 = booleanArray1.getElementAt(2);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = booleanArray1.indexOfElement(false);
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	boolean[] array3 = booleanArray1.insertElement(false, 4);
//    	booleanArray1.printArray();
//    	boolean[] array4 = booleanArray1.deleteElement(3);
//    	booleanArray1.printArray();
//    	System.out.println();
    	
    	
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
