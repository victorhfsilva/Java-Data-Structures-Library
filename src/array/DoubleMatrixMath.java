package array;

/**
 * @title Double Matrix Math
 * This library extends the DoubleMatrix Class with math related methods.
 * 
 * 
 * @author Victor Silva
 * @see IntegerMatrixMath
 */

public class DoubleMatrixMath extends DoubleMatrix {

	public DoubleMatrixMath(double[][] matrix, boolean[] sorted) {
		super(matrix, sorted);
	}

	public DoubleMatrixMath(double[][] matrix) {
		super(matrix);
	}
	
	//Transpose the matrix
	double[][] transpose(){
		double[][] newMatrix = new double[getMatrix()[0].length][getMatrix().length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[0].length; j++){
				newMatrix[j][i] = getMatrix()[i][j];
			}
		}
		return newMatrix;
	}
	
	//Matrix sum
	double[][] sum(double[][] matrix){		
		try { 
			if (matrix.length != getMatrix().length) throw new Exception();
			for (int line = 0; line < getMatrix().length; line++) {
				if (matrix[line].length != getMatrix()[line].length) throw new Exception();
			}
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getMatrix();
		}
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]+matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Matrix Subtraction
	double[][] subtraction(double[][] matrix){		
		try { 
			if (matrix.length != getMatrix().length) throw new Exception();
			for (int line = 0; line < getMatrix().length; line++) {
				if (matrix[line].length != getMatrix()[line].length) throw new Exception();
			}
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getMatrix();
		}
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]-matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Element Wise Multiplication
	double[][] elementMultiplication(double[][] matrix){		
		try { 
			if (matrix.length != getMatrix().length) throw new Exception();
			for (int line = 0; line < getMatrix().length; line++) {
				if (matrix[line].length != getMatrix()[line].length) throw new Exception();
			}
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getMatrix();
		}
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]*matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Element Wise Division
	double[][] elementDivision(double[][] matrix){		
		try { 
			if (matrix.length != getMatrix().length) throw new Exception();
			for (int line = 0; line < getMatrix().length; line++) {
				if (matrix[line].length != getMatrix()[line].length) throw new Exception();
			}
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getMatrix();
		}
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]/matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Element Wise Remainder
	double[][] elementRemainder(double[][] matrix){		
		try { 
			if (matrix.length != getMatrix().length) throw new Exception();
			for (int line = 0; line < getMatrix().length; line++) {
				if (matrix[line].length != getMatrix()[line].length) throw new Exception();
			}
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getMatrix();
		}
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]%matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Matrix Multiplication
	double[][] multiplication(double[][] matrix){
		try {
			//check if each line of the array has the same number of rows
			for (int line = 1; line < matrix.length; line++) {
				if (matrix[line].length != matrix[line-1].length) throw new Exception();
			}
			
			if (getMatrix()[0].length != matrix.length) throw new Exception();
		}
		catch (Exception invalidInputedMatrix) {
			System.out.println("The matrix inputed is invalid.");
			return getMatrix();
		}
		//matrix number of lines
		int matrixLines = getMatrix().length;
		//inputed matrix number of columns
		int inputedMatrixColumns = matrix[0].length;
		//inputed matrix number of lines and matrix number of columns 
		int n = getMatrix()[0].length;	
		//Initialize the new Matrix
		double[][] newMatrix = new double[matrixLines][inputedMatrixColumns];
		//Do the matrix multiplication		
		for (int i = 0; i<matrixLines; i++){
			for (int j = 0; j<inputedMatrixColumns; j++){
				for (int k = 0; k<n; k++) {
					newMatrix[i][j] += getMatrix()[i][k]*matrix[k][j];
				}	
			} 
		}
		return newMatrix;
	}
	
	//Scalar Sum
	double[][] scalarSum(double num){
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]+num;
			}
		}
		return newMatrix;
	}
	
	//Scalar Subtraction
	double[][] scalarSubtraction(double num){
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]-num;
			}
		}
		return newMatrix;
	}
		
	//Scalar Multiplication
	double[][] scalarMultiplication(double num){
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]*num;
			}
		}
		return newMatrix;
	}
	
	//Scalar Division
	double[][] scalarDivision(double num){
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]/num;
			}
		}
		return newMatrix;
	}
	
	//Scalar Remainder
	double[][] scalarRemainder(double num){
		double[][] newMatrix = new double[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]%num;
			}
		}
		return newMatrix;
	}
	
}
