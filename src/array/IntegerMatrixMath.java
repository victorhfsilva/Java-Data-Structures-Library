package array;

public class IntegerMatrixMath extends IntegerMatrix {
	
	public IntegerMatrixMath(int[][] matrix, boolean[] sorted) {
		super(matrix, sorted);
	}

	public IntegerMatrixMath(int[][] matrix) {
		super(matrix);
	}
	
	//Transpose the matrix
	int[][] transpose(){
		int[][] newMatrix = new int[getMatrix()[0].length][getMatrix().length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[0].length; j++){
				newMatrix[j][i] = getMatrix()[i][j];
			}
		}
		return newMatrix;
	}
	
	//Matrix sum
	int[][] sum(int[][] matrix){		
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
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]+matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Matrix Subtraction
	int[][] subtraction(int[][] matrix){		
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
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]-matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Element Wise Multiplication
	int[][] elementMultiplication(int[][] matrix){		
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
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]*matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Element Wise Division
	int[][] elementDivision(int[][] matrix){		
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
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]/matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Element Wise Remainder
	int[][] elementRemainder(int[][] matrix){		
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
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]%matrix[i][j];				
			}
		}
		return newMatrix;
	}
	
	//Matrix Multiplication
	int[][] multiplication(int[][] matrix){
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
		int[][] newMatrix = new int[matrixLines][inputedMatrixColumns];
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
	int[][] scalarSum(int num){
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]+num;
			}
		}
		return newMatrix;
	}
	
	//Scalar Subtraction
	int[][] scalarSubtraction(int num){
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]-num;
			}
		}
		return newMatrix;
	}
		
	//Scalar Multiplication
	int[][] scalarMultiplication(int num){
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]*num;
			}
		}
		return newMatrix;
	}
	
	//Scalar Division
	int[][] scalarDivision(int num){
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]/num;
			}
		}
		return newMatrix;
	}
	
	//Scalar Remainder
	int[][] scalarRemainder(int num){
		int[][] newMatrix = new int[getMatrix().length][getMatrix()[0].length];
		for (int i = 0; i<getMatrix().length; i++){
			for (int j = 0; j<getMatrix()[i].length; j++){
				newMatrix[i][j] = getMatrix()[i][j]%num;
			}
		}
		return newMatrix;
	}

}
