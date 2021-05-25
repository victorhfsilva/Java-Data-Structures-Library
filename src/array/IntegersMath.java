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
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]+num;			
			}
			return newArray;
		}
		//Subtraction of the array elements with num
		public int[] subtraction(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]-num;			
			}
			return newArray;
		}
		//Multiplication of the array elements with num
		public int[] multiplication(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]*num;			
			}
			return newArray;
		}
		//Division of the array elements with num
		public int[] division(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]/num;			
			}
			return newArray;
		}
		//Remainder of the array elements with num
		public int[] remainder(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]%num;			
			}
			return newArray;
		}
}
