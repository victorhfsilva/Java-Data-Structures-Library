package array;

public class IntegersMath extends Integers {

	//Constructors
		public IntegersMath(int[] array, boolean sorted) {
			super(array, sorted);
		}
		public IntegersMath(int[] array) {
			super(array);
		}
		//The array elements summation 
		public int summation() {
			int summation = 0;
			for (int i = 0; i < getArray().length; i++) {
				summation += getArray()[i];
			}
			return summation;
		}
		//The array elements product
		public int product() {
			int product = 0;
			for (int i = 0; i < getArray().length; i++) {
				product *= getArray()[i];
			}
			return product;
		}
		//Sum of the array elements with num
		public int[] sum(int num) {
			for (int i = 0; i < getArray().length; i++) {
				setElementAt(getArray()[i]+num,i);			
			}
			return getArray();
		}
		//Subtraction of the array elements with num
		public int[] subtraction(int num) {
			for (int i = 0; i < getArray().length; i++) {
				setElementAt(getArray()[i]-num,i);			
			}
			return getArray();
		}
		//Multiplication of the array elements with num
		public int[] multiplication(int num) {
			for (int i = 0; i < getArray().length; i++) {
				setElementAt(getArray()[i]*num,i);			
			}
			return getArray();
		}
		//Division of the array elements with num
		public int[] division(int num) {
			for (int i = 0; i < getArray().length; i++) {
				setElementAt(getArray()[i]/num,i);			
			}
			return getArray();
		}
		//Remainder of the array elements with num
		public int[] remainder(int num) {
			for (int i = 0; i < getArray().length; i++) {
				setElementAt(getArray()[i]%num,i);			
			}
			return getArray();
		}
	
}
