package array;

public class IntegerArrayMath extends IntegerArray {

		//Constructors
		public IntegerArrayMath(int[] array, boolean sorted) {
			super(array, sorted);
		}
		public IntegerArrayMath(int[] array) {
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
			int product = 1;
			for (int i = 0; i < getArray().length; i++) {
				product *= getArray()[i];
			}
			return product;
		}
		//Sum of the array elements with num
		public int[] scalarSum(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]+num;			
			}
			return newArray;
		}
		//Subtraction of the array elements with num
		public int[] scalarSubtraction(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]-num;			
			}
			return newArray;
		}
		//Multiplication of the array elements with num
		public int[] scalarMultiplication(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]*num;			
			}
			return newArray;
		}
		//Division of the array elements with num
		public int[] scalarDivision(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]/num;			
			}
			return newArray;
		}
		//Remainder of the array elements with num
		public int[] scalarRemainder(int num) {
			int[] newArray = new int[getArray().length];
			for (int i = 0; i < getArray().length; i++) {
				newArray[i]= getArray()[i]%num;			
			}
			return newArray;
		}
		
		//Matrix sum
		int[] sum(int[] array){		
			try { 
				if (array.length != getArray().length) throw new Exception();
			}
			catch (Exception inputedMatrixWithDifferentDimmensions) {
				System.out.println("The inputed matrix has different dimmensions.");
				return getArray();
			}
			int[] newArray = new int[getArray().length];
			for (int i = 0; i<getArray().length; i++){
					newArray[i] = getArray()[i]+array[i];				
				}
			return newArray;
		}
		
		//Matrix subtraction
		int[] subtraction(int[] array){		
			try { 
				if (array.length != getArray().length) throw new Exception();
			}
			catch (Exception inputedMatrixWithDifferentDimmensions) {
				System.out.println("The inputed matrix has different dimmensions.");
				return getArray();
			}
			int[] newArray = new int[getArray().length];
			for (int i = 0; i<getArray().length; i++){
					newArray[i] = getArray()[i]-array[i];				
				}
			return newArray;
		}
		
		//Matrix Multiplication
		int[] elementMultiplication(int[] array){		
			try { 
				if (array.length != getArray().length) throw new Exception();
			}
			catch (Exception inputedMatrixWithDifferentDimmensions) {
				System.out.println("The inputed matrix has different dimmensions.");
				return getArray();
			}
			int[] newArray = new int[getArray().length];
			for (int i = 0; i<getArray().length; i++){
					newArray[i] = getArray()[i]*array[i];				
				}
			return newArray;
		}
		
		//Matrix Multiplication
		int[] elementDivision(int[] array){		
			try { 
				if (array.length != getArray().length) throw new Exception();
			}
			catch (Exception inputedMatrixWithDifferentDimmensions) {
				System.out.println("The inputed matrix has different dimmensions.");
				return getArray();
			}
			int[] newArray = new int[getArray().length];
			for (int i = 0; i<getArray().length; i++){
					newArray[i] = getArray()[i]/array[i];				
				}
			return newArray;
		}
		
		//Matrix Multiplication
		int[] elementRemainder(int[] array){		
			try { 
				if (array.length != getArray().length) throw new Exception();
			}
			catch (Exception inputedMatrixWithDifferentDimmensions) {
				System.out.println("The inputed matrix has different dimmensions.");
				return getArray();
			}
			int[] newArray = new int[getArray().length];
			for (int i = 0; i<getArray().length; i++){
					newArray[i] = getArray()[i]%array[i];				
				}
			return newArray;
		}
		
}
