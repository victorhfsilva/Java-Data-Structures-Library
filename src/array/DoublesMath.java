package array;

public class DoublesMath extends Doubles{
	//Constructors
	public DoublesMath(double[] array, boolean sorted) {
		super(array, sorted);
	}
	public DoublesMath(double[] array) {
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
		for (int i = 0; i < getArray().length; i++) {
			setElementAt(getArray()[i]+num,i);			
		}
		return getArray();
	}
	//Subtraction of the array elements with num
	public double[] subtraction(double num) {
		for (int i = 0; i < getArray().length; i++) {
			setElementAt(getArray()[i]-num,i);			
		}
		return getArray();
	}
	//Multiplication of the array elements with num
	public double[] multiplication(double num) {
		for (int i = 0; i < getArray().length; i++) {
			setElementAt(getArray()[i]*num,i);			
		}
		return getArray();
	}
	//Division of the array elements with num
	public double[] division(double num) {
		for (int i = 0; i < getArray().length; i++) {
			setElementAt(getArray()[i]/num,i);			
		}
		return getArray();
	}
	//Remainder of the array elements with num
	public double[] remainder(double num) {
		for (int i = 0; i < getArray().length; i++) {
			setElementAt(getArray()[i]%num,i);			
		}
		return getArray();
	}
	
}
