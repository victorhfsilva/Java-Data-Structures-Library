package array;

public class DoubleArrayMath extends DoubleArray{
	//Constructors
	public DoubleArrayMath(double[] array, boolean sorted) {
		super(array, sorted);
	}
	public DoubleArrayMath(double[] array) {
		super(array);
	}
	//The array elements summation 
	public double summation() {
		double summation = 0;
		for (int i = 0; i < getArray().length; i++) {
			summation += getArray()[i];
		}
		return summation;
	}
	//The array elements product
	public double product() {
		double product = 1;
		for (int i = 0; i < getArray().length; i++) {
			product *= getArray()[i];
		}
		return product;
	}
	//Sum of the array elements with num
	public double[] scalarSum(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]+num;			
		}
		return newArray;
	}
	//Subtraction of the array elements with num
	public double[] scalarSubtraction(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]-num;			
		}
		return newArray;
	}
	//Multiplication of the array elements with num
	public double[] scalarMultiplication(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]*num;			
		}
		return newArray;
	}
	//Division of the array elements with num
	public double[] scalarDivision(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]/num;			
		}
		return newArray;
	}
	//Remainder of the array elements with num
	public double[] scalarRemainder(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]%num;			
		}
		return newArray;
	}
	
	//Matrix sum
	double[] sum(double[] array){		
		try { 
			if (array.length != getArray().length) throw new Exception();
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getArray();
		}
		double[] newArray = new double[getArray().length];
		for (int i = 0; i<getArray().length; i++){
				newArray[i] = getArray()[i]+array[i];				
			}
		return newArray;
	}
	
	//Matrix subtraction
	double[] subtraction(double[] array){		
		try { 
			if (array.length != getArray().length) throw new Exception();
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getArray();
		}
		double[] newArray = new double[getArray().length];
		for (int i = 0; i<getArray().length; i++){
				newArray[i] = getArray()[i]-array[i];				
			}
		return newArray;
	}
	
	//Matrix Multiplication
	double[] elementMultiplication(double[] array){		
		try { 
			if (array.length != getArray().length) throw new Exception();
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getArray();
		}
		double[] newArray = new double[getArray().length];
		for (int i = 0; i<getArray().length; i++){
				newArray[i] = getArray()[i]*array[i];				
			}
		return newArray;
	}
	
	//Matrix Multiplication
	double[] elementDivision(double[] array){		
		try { 
			if (array.length != getArray().length) throw new Exception();
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getArray();
		}
		double[] newArray = new double[getArray().length];
		for (int i = 0; i<getArray().length; i++){
				newArray[i] = getArray()[i]/array[i];				
			}
		return newArray;
	}
	
	//Matrix Multiplication
	double[] elementRemainder(double[] array){		
		try { 
			if (array.length != getArray().length) throw new Exception();
		}
		catch (Exception inputedMatrixWithDifferentDimmensions) {
			System.out.println("The inputed matrix has different dimmensions.");
			return getArray();
		}
		double[] newArray = new double[getArray().length];
		for (int i = 0; i<getArray().length; i++){
				newArray[i] = getArray()[i]%array[i];				
			}
		return newArray;
	}
		
}
