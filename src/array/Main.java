package array;
public class Main {
	
    public static void main(String[] args)  throws CloneNotSupportedException {
  	
    	
//    	//	DOUBLE MATRIX OBJECT   	
//    	System.out.println("DOUBLE MATRIX");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	DoubleMatrixMath doubleMatrix1 = new DoubleMatrixMath(new double[][] {{1.3, 3.3, 2.5, 2.7, 4.1, 5.7, 6.8},{0.3, 2.3, 1.5, 3.7, 2.1, 2.7, 3.8}});
//    	doubleMatrix1.printMatrix();
//    	DoubleMatrixMath doubleMatrix2 = new DoubleMatrixMath(new double[][] {{1.2, 3.5, 4.7, 5.8, 7.9, 9.2},{1.2, 3.5, 4.7, 5.8, 7.9, 9.2}}, new boolean[] {true, false});
//    	
//    	doubleMatrix2.printMatrix();
//    	System.out.println();
//    	
//    	//Getters
//    	double[][] matrix1 = doubleMatrix1.getMatrix();
//    	boolean[] sorted1 = doubleMatrix2.getSorted();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	doubleMatrix1.setMatrix(new double[][] {{1.6, 2.1, 4.3, 6.2, 6.7, 7.4, 9.6},{1.2, 7.2, 5.0, 6.1, 6.7, 3.4, 5.6}});
//    	doubleMatrix1.setSorted(new boolean[] {true,false});
//    	doubleMatrix1.printMatrix();
//    	doubleMatrix2.setMatrix(new double[][] {{4.5, 8.1, 2.2, 4.5, 5.6, 2.1},{4.2, 5.1, 6.2, 7.5, 8.6, 1.1}});
//    	doubleMatrix2.setSorted(new boolean[] {false,false});
//    	doubleMatrix2.printMatrix();
//    	System.out.println();
//    	
//    	//Set Element At
//    	doubleMatrix1.setElementAt(6.7, 1, 3);
//    	doubleMatrix2.setElementAt(5.2, 0, 4);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	double Element1 = doubleMatrix1.getElementAt(1,5);
//    	double Element2 = doubleMatrix2.getElementAt(0,3);
//    	boolean sorted2 = doubleMatrix1.getSortedAt(0);
//    	boolean sorted3 = doubleMatrix1.getSortedAt(1);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = doubleMatrix1.indexOfElement(6.7,0);
//    	int[][] Index2 = doubleMatrix2.indexOfElement(4.5);
//    	int[] Index3 = doubleMatrix1.indexOfElement(6.7,0, false);
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	double[][] matrix2 = doubleMatrix1.insertLine(new double[] {1.6, 2.1, 2.3, 3.2, 2.7, 1.4, 2.6}, 1);
//    	doubleMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	double[][] matrix3 = doubleMatrix1.insertLine(new double[] {1.6, 2.1, 4.3, 6.2, 6.7, 7.4, 9.6}, 3, true);
//    	doubleMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	double[][] matrix4 = doubleMatrix1.insertRow(new double[] {1.6, 2.1, 2.3, 3.2}, 5);
//    	doubleMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	double[][] matrix5 = doubleMatrix1.insertRow(new double[] {1.6, 2.1, 2.3, 3.2}, 5, false);
//    	doubleMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	doubleMatrix1.deleteLine(0);
//    	doubleMatrix1.printMatrix();    	
//    	System.out.println();
//    	
//    	doubleMatrix1.deleteRow(0);
//    	doubleMatrix1.printMatrix();    	
//    	System.out.println();
//    	
//    	doubleMatrix1.deleteRow(7, false);
//    	doubleMatrix1.printMatrix();    	
//    	System.out.println();
//   	
//    	//Sorting the array
//    	System.out.println("Sorting the array");
//    	double[][] matrix6 = doubleMatrix1.insertionSort(0);
//    	doubleMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	double[][] matrix7 = doubleMatrix2.bubbleSort(0);
//    	doubleMatrix2.printMatrix();
//    	System.out.println();
//    	
//    	//Double Matrix Math
//    	//Transposition
//    	System.out.println("Transpose Matrix");
//    	double[][] transpose = doubleMatrix1.transpose();
//    	DoubleMatrix transposeMatrix = new DoubleMatrix(transpose);
//    	transposeMatrix.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Sum
//    	System.out.println("Matrix Sum");
//    	double[][] sum = doubleMatrix2.sum(new double[][] {{1.3, 1.2, 3.2, 4.1, 3.1, 7.2},
//    														{2.3, 4.2, 5.2, 1.1, 3.7, 5.2}});
//    	DoubleMatrix matrixSum = new DoubleMatrix(sum);
//    	matrixSum.printMatrix();
//    	System.out.println();    	
//    	
//    	//Matrix Subtraction
//    	System.out.println("Matrix Subtraction");
//    	double[][] subtraction = doubleMatrix2.subtraction(new double[][] {{1.3, 1.2, 3.2, 4.1, 3.1, 7.2},
//    																		{2.3, 4.2, 5.2, 1.1, 3.7, 5.2}});
//    	DoubleMatrix matrixSubtraction = new DoubleMatrix(subtraction);
//    	matrixSubtraction.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Multiplication
//    	System.out.println("Matrix Element Wise Multiplication");
//    	double[][] elementMultiplication = doubleMatrix2.elementMultiplication(new double[][] {{1.3, 1.2, 3.2, 4.1, 3.1, 7.2},
//    																			{2.3, 4.2, 5.2, 1.1, 3.7, 5.2}});
//    	DoubleMatrix matrixElementMultiplication = new DoubleMatrix(elementMultiplication);
//    	matrixElementMultiplication.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Division
//    	System.out.println("Matrix Element Wise Division");
//    	double[][] elementDivision = doubleMatrix2.elementDivision(new double[][] {{1.3, 1.2, 3.2, 4.1, 3.1, 7.2},
//    																			{2.3, 4.2, 5.2, 1.1, 3.7, 5.2}});
//    	DoubleMatrix matrixElementDivision = new DoubleMatrix(elementDivision);
//    	matrixElementDivision.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Remainder
//    	System.out.println("Matrix Element Wise Remainder");
//    	double[][] elementRemainder = doubleMatrix2.elementRemainder(new double[][] {{1.3, 1.2, 3.2, 4.1, 3.1, 7.2},
//    																			{2.3, 4.2, 5.2, 1.1, 3.7, 5.2}});
//    	DoubleMatrix matrixElementRemainder = new DoubleMatrix(elementRemainder);
//    	matrixElementRemainder.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Remainder
//    	System.out.println("Matrix Multiplication");
//    	doubleMatrix2.printMatrix();
//    	System.out.println();
//    	double[][] multiplication = doubleMatrix2.multiplication(new double[][] {{1.3, 1.2}, {3.2, 4.1}, {3.1, 7.2},
//    																			{2.3, 4.2}, {5.2, 1.1}, {3.7, 5.2}});
//    	DoubleMatrix Multiplication= new DoubleMatrix(multiplication);
//    	Multiplication.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Scalar Sum
//    	System.out.println("Matrix Scalar Sum");
//    	doubleMatrix2.printMatrix();
//    	System.out.println();
//    	double[][] scalarSum = doubleMatrix2.scalarSum(1.14);
//    	DoubleMatrix ScalarSum= new DoubleMatrix(scalarSum);
//    	ScalarSum.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Scalar Subtraction
//    	System.out.println("Matrix Scalar Subtraction");
//    	double[][] scalarSubtraction = doubleMatrix2.scalarSubtraction(1.14);
//    	DoubleMatrix ScalarSubtraction = new DoubleMatrix(scalarSubtraction);
//    	ScalarSubtraction.printMatrix();
//    	System.out.println(); 	
    	
    	
//      //	INTEGER MATRIX OBJECT    	
//    	System.out.println("INTEGER MATRIX");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	IntegerMatrixMath integerMatrix1 = new IntegerMatrixMath(new int[][] {{1, 3, 2, 2, 4, 5, 6},{0, 2, 1, 3, 2, 2, 3}});
//    	integerMatrix1.printMatrix();
//    	IntegerMatrixMath integerMatrix2 = new IntegerMatrixMath(new int[][] {{1, 3, 4, 5, 7, 9},
//												{1, 3, 4, 5, 7, 9}}, new boolean[] {true, false});
//    	
//    	integerMatrix2.printMatrix();
//    	System.out.println();
//    	
//    	//Getters
//    	int[][] matrix1 = integerMatrix1.getMatrix();
//    	boolean[] sorted1 = integerMatrix2.getSorted();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	integerMatrix1.setMatrix(new int[][] {{1, 2, 4, 6, 6, 7, 9},{1, 7, 5, 6, 6, 3, 5}});
//    	integerMatrix1.setSorted(new boolean[] {true,false});
//    	integerMatrix1.printMatrix();
//    	integerMatrix2.setMatrix(new int[][] {{4, 8, 2, 4, 5, 2},{4, 5, 6, 7, 8, 1}});
//    	integerMatrix2.setSorted(new boolean[] {false,false});
//    	integerMatrix2.printMatrix();
//    	System.out.println();
//    	
//    	//Set Element At
//    	integerMatrix1.setElementAt(6, 1, 3);
//    	integerMatrix2.setElementAt(5, 0, 4);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	int Element1 = integerMatrix1.getElementAt(1,5);
//    	int Element2 = integerMatrix2.getElementAt(0,3);
//    	boolean sorted2 = integerMatrix1.getSortedAt(0);
//    	boolean sorted3 = integerMatrix1.getSortedAt(1);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = integerMatrix1.indexOfElement(6,0);
//    	int[][] Index2 = integerMatrix2.indexOfElement(4);
//    	int[] Index3 = integerMatrix1.indexOfElement(6,0, false);
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	int[][] matrix2 = integerMatrix1.insertLine(new int[] {1, 2, 2, 3, 2, 1, 2}, 1);
//    	integerMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	int[][] matrix3 = integerMatrix1.insertLine(new int[] {1, 2, 4, 6, 6, 7, 9}, 3, true);
//    	integerMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	int[][] matrix4 = integerMatrix1.insertRow(new int[] {1, 2, 2, 3}, 5);
//    	integerMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	int[][] matrix5 = integerMatrix1.insertRow(new int[] {1, 2, 2, 3}, 5, false);
//    	integerMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	integerMatrix1.deleteLine(0);
//    	integerMatrix1.printMatrix();    	
//    	System.out.println();
//    	
//    	integerMatrix1.deleteRow(0);
//    	integerMatrix1.printMatrix();    	
//    	System.out.println();
//    	
//    	integerMatrix1.deleteRow(7, false);
//    	integerMatrix1.printMatrix();    	
//    	System.out.println();
//   	
//    	//Sorting the array
//    	System.out.println("Sorting the array");
//    	int[][] matrix6 = integerMatrix1.insertionSort(0);
//    	integerMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	int[][] matrix7 = integerMatrix2.bubbleSort(0);
//    	integerMatrix2.printMatrix();
//    	System.out.println();
//    	
//    	//Double Matrix Math
//    	//Transposition
//    	System.out.println("Transpose Matrix");
//    	int[][] transpose = integerMatrix1.transpose();
//    	IntegerMatrix transposeMatrix = new IntegerMatrix(transpose);
//    	transposeMatrix.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Sum
//    	System.out.println("Matrix Sum");
//    	int[][] sum = integerMatrix2.sum(new int[][] {{1, 1, 3, 4, 3, 7},
//    														{2, 4, 5, 1, 3, 5}});
//    	IntegerMatrix matrixSum = new IntegerMatrix(sum);
//    	matrixSum.printMatrix();
//    	System.out.println();    	
//    	
//    	//Matrix Subtraction
//    	System.out.println("Matrix Subtraction");
//    	int[][] subtraction = integerMatrix2.subtraction(new int[][] {{1, 1, 3, 4, 3, 7},
//    																		{2, 4, 5, 1, 3, 5}});
//    	IntegerMatrix matrixSubtraction = new IntegerMatrix(subtraction);
//    	matrixSubtraction.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Multiplication
//    	System.out.println("Matrix Element Wise Multiplication");
//    	int[][] elementMultiplication = integerMatrix2.elementMultiplication(new int[][] {{1, 1, 3, 4, 3, 7},
//    																			{2, 4, 5, 1, 3, 5}});
//    	IntegerMatrix matrixElementMultiplication = new IntegerMatrix(elementMultiplication);
//    	matrixElementMultiplication.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Division
//    	System.out.println("Matrix Element Wise Division");
//    	int[][] elementDivision = integerMatrix2.elementDivision(new int[][] {{1, 1, 3, 4, 3, 7},
//    																			{2, 4, 5, 1, 3, 5}});
//    	IntegerMatrix matrixElementDivision = new IntegerMatrix(elementDivision);
//    	matrixElementDivision.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Remainder
//    	System.out.println("Matrix Element Wise Remainder");
//    	int[][] elementRemainder = integerMatrix2.elementRemainder(new int[][] {{1, 1, 3, 4, 3, 7},
//    																			{2, 4, 5, 1, 3, 5}});
//    	IntegerMatrix matrixElementRemainder = new IntegerMatrix(elementRemainder);
//    	matrixElementRemainder.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Element Wise Remainder
//    	System.out.println("Matrix Multiplication");
//    	integerMatrix2.printMatrix();
//    	System.out.println();
//    	int[][] multiplication = integerMatrix2.multiplication(new int[][] {{1, 2}, {3, 1}, {3, 2},
//    																			{3, 4}, {5, 1}, {3, 5}});
//    	IntegerMatrix Multiplication= new IntegerMatrix(multiplication);
//    	Multiplication.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Scalar Sum
//    	System.out.println("Matrix Scalar Sum");
//    	integerMatrix2.printMatrix();
//    	System.out.println();
//    	int[][] scalarSum = integerMatrix2.scalarSum(4);
//    	IntegerMatrix ScalarSum= new IntegerMatrix(scalarSum);
//    	ScalarSum.printMatrix();
//    	System.out.println();
//    	
//    	//Matrix Scalar Subtraction
//    	System.out.println("Matrix Scalar Subtraction");
//    	int[][] scalarSubtraction = integerMatrix2.scalarSubtraction(2);
//    	IntegerMatrix ScalarSubtraction = new IntegerMatrix(scalarSubtraction);
//    	ScalarSubtraction.printMatrix();
//    	System.out.println(); 
    	
    	
//    	//	STRING MATRIX OBJECT    	
//    	System.out.println("STRING MATRIX");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	StringMatrix stringMatrix1 = new StringMatrix(new String[][] {{"banana", "coconut", "strawberry"},{"apple", "pineapple", "banana"}});
//    	stringMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	//Getters
//    	String[][] matrix1 = stringMatrix1.getMatrix();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	stringMatrix1.setMatrix(new String[][] {{"banana", "coconut", "strawberry", "pineapple"},{"apple", "pineapple", "banana", "apple"}});
//    	stringMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	//Set Element At
//    	stringMatrix1.setElementAt("apple", 1, 2);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	String Element1 = stringMatrix1.getElementAt(1,5);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = stringMatrix1.indexOfElement("apple",1);
//    	int[][] Index2 = stringMatrix1.indexOfElement("pineapple");
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	String[][] matrix2 = stringMatrix1.insertLine(new String[] {"banana", "apple", "coconut", "avocado"}, 1);
//    	stringMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	
//    	String[][] matrix3 = stringMatrix1.insertRow(new String[] {"apple", "avocado", "banana"}, 3);
//    	stringMatrix1.printMatrix();
//    	System.out.println();
//    	    	
//    	stringMatrix1.deleteLine(0);
//    	stringMatrix1.printMatrix();    	
//    	System.out.println();
//    	
//    	stringMatrix1.deleteRow(0);
//    	stringMatrix1.printMatrix();    	
//    	System.out.println();
    	
    	
//    	//	BOOLEAN MATRIX OBJECT    	
//    	System.out.println("BOOLEAN MATRIX");
//    	System.out.println();
//    	
//    	//Object initialization
//    	System.out.println("Arrays creation");
//    	BooleanMatrix booleanMatrix1 = new BooleanMatrix(new boolean[][] {{true, false, false},{false, true, true}});
//    	booleanMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	//Getters
//    	boolean[][] matrix1 = booleanMatrix1.getMatrix();
//    	
//    	//Setters
//    	System.out.println("Arrays setting");
//    	booleanMatrix1.setMatrix(new boolean[][] {{true, true, false, true},{false, true, false, false}});
//    	booleanMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	//Set Element At
//    	booleanMatrix1.setElementAt(true, 1, 2);
//    	
//    	//Get Element At
//    	System.out.println("Get Element");
//    	boolean Element1 = booleanMatrix1.getElementAt(1,5);
//    	System.out.println();
//    	
//    	//Index of Element
//    	System.out.println("Index Of Element");
//    	int[] Index1 = booleanMatrix1.indexOfElement(false,1);
//    	int[][] Index2 = booleanMatrix1.indexOfElement(true);
//    	System.out.println();
//    	
//    	//Insert and delete element 
//    	System.out.println("Insert and Delete Element");
//    	boolean[][] matrix2 = booleanMatrix1.insertLine(new boolean[] {false, true, true, true}, 1);
//    	booleanMatrix1.printMatrix();
//    	System.out.println();
//    	
//    	
//    	boolean[][] matrix3 = booleanMatrix1.insertRow(new boolean[] {false, true, false}, 3);
//    	booleanMatrix1.printMatrix();
//    	System.out.println();
//    	    	
//    	booleanMatrix1.deleteLine(0);
//    	booleanMatrix1.printMatrix();    	
//    	System.out.println();
//    	
//    	booleanMatrix1.deleteRow(0);
//    	booleanMatrix1.printMatrix();    	
//    	System.out.println();

    	//General Type Array
    	
    	//DOUBLE ARRAY OBJECT    	
    	System.out.println("GENERAL DOUBLE ARRAY");
    	System.out.println();
    	
    	//Object initialization
    	System.out.println("Arrays creation");
    	GeneralArray<Double> doubleArray1 = new GeneralArray<Double>(new Double[] {1.3, 3.3, 2.5, 2.7, 4.1, 5.7, 6.8});
    	doubleArray1.printArray();
    	System.out.println();
    	
//    	// ARRAY OF OBJECTS    	
//    	//Create array of objects
//    	System.out.println("Array creation");
//    	ObjectArray booleanObjects1 = new ObjectArray(new ObjectArray[] {booleanMatrix1, new BooleanMatrix(matrix2), new BooleanMatrix(matrix3)});
//    	System.out.println(booleanObjects1);
//    	System.out.println("Getter");
//    	System.out.println(booleanObjects1.getObjects());
//    	System.out.println();
//   
//    	//Clone array of objects
//    	System.out.println("Array clone");
//    	ObjectArray booleanObjects2 = (ObjectArray) booleanObjects1.clone();
//    	System.out.println(booleanObjects2);
//    	System.out.println();
//    	
//    	//Getter
//    	System.out.println("Getter");
//    	ObjectArray[] booleanObjects3 = booleanObjects1.getObjects();
//    	System.out.println(booleanObjects3);
//    	System.out.println();
//    	
//    	//Setter
//    	ObjectArray booleanObjects4 = new ObjectArray();
//    	booleanObjects4.setObjects(new ObjectArray[] {booleanObjects1, booleanObjects2});
//    	
//    	//Set element at
//    	booleanObjects1.setElementAt(new BooleanMatrix(matrix1), 1);
//    	
//    	//Get object at
//    	System.out.println("Get Object");
//    	BooleanMatrix booleanMatrix2 = (BooleanMatrix) booleanObjects1.getObjectAt(0);
//    	booleanMatrix2.printMatrix();
//    	System.out.println();
//    	
//    	//Index of object
//    	System.out.println("Index of Object");
//    	booleanObjects2.indexOfObject(booleanMatrix1);
//    	
//    	//Insert and delete Object
//    	booleanObjects4.insertObject(booleanMatrix2, 2);
//    	booleanObjects4.deleteObject(1);
//    	booleanObjects4.deleteObject(0);
    	
    	
//    	ARRAYS    	
//    	//DOUBLE ARRAY OBJECT    	
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
    	
    	
////	INTEGER ARRAY OBJECT    	
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

    	
////	STRING ARRAY OBJECT    	
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
    	

////	BOOLEAN ARRAY OBJECT
    	
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
    	
    }

}
