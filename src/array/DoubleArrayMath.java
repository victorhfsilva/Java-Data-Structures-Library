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
		double product = 0;
		for (int i = 0; i < getArray().length; i++) {
			product *= getArray()[i];
		}
		return product;
	}
	//Sum of the array elements with num
	public double[] sum(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]+num;			
		}
		return newArray;
	}
	//Subtraction of the array elements with num
	public double[] subtraction(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]-num;			
		}
		return newArray;
	}
	//Multiplication of the array elements with num
	public double[] multiplication(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]*num;			
		}
		return newArray;
	}
	//Division of the array elements with num
	public double[] division(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]/num;			
		}
		return newArray;
	}
	//Remainder of the array elements with num
	public double[] remainder(double num) {
		double[] newArray = new double[getArray().length];
		for (int i = 0; i < getArray().length; i++) {
			newArray[i]= getArray()[i]%num;			
		}
		return newArray;
	}
	
}
