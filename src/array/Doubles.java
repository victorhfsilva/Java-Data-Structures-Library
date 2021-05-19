package array;

public class Doubles extends Objects{
    private double[] array;
    private boolean sorted = false;

    //Constructors
    public Doubles(double[] array){
        this.array = array;
    }
    Doubles(double[] array, boolean sorted){
        this.array = array;
        this.sorted = sorted;
    }

    //Getters
    public double[] getArray(){
        return array;
    }
    public boolean getSorted(){ return sorted; }

    //Setters
    public void setArray(double[] array){
        this.array=array;
    }
    public void setSorted(boolean sorted){ this.sorted = sorted;}

    //Accessing an element
    //Big-O: O(1)
    public double getElementAt(int index){
        try {
            System.out.println(array[index]);
            return array[index];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return -1;
        }
    }

    //Searching for an element
    //sorted is true if the array is sorted
    public int indexOfElement(double element){
        //Binary Search
        //Big-O: O(log2(n))
        if (sorted){
            int f = array.length-1;
            int i = 0;
            while(i<=f){
                int m = (i+f)/2;
                if (element>array[m]) i = m+1;
                else if (element<array[m]) f = m-1;
                else if (element==array[m]) {
                    System.out.println("The element is in the index "+m);
                    return m;
                }
            }
            System.out.println("The element is not in the Array.");
            return -1;
        }
        else{
            //Linear Search
            //Big-O O(n)
            for (int i = 0; i<array.length; i++){
                if (element == array[i]) {
                    System.out.println("The element is in the index "+i);
                    return i;
                }
            }
            System.out.println("The element is not in the Array.");
        }
        return -1;
    }

    //Inserting an element
    //Big-O: O(n)
    public double[] insertElement(double element,int index){
        try { if (index>array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        double[] oldArray = array;
        if (index == array.length) {
            array = new double[oldArray.length+1];
            array[oldArray.length]=element;
        }
        else {
            double temp = array[index];
            array = new double[oldArray.length + 1];
        }
        for (int i = 0; i<index; i++){
            array[i]=oldArray[i];
        }
        array[index]=element;
        for (int i = index+1; i< array.length; i++){
            array[i]=oldArray[i-1];
        }
        return array;
    }

    //Deleting an element
    //Big-O: O(n)
    public double[] deleteElement(int index){
        try {if (index>=array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        double[] oldArray = array;
        array = new double[oldArray.length-1];
        for (int i=0; i<index;i++){
            array[i]=oldArray[i];
        }
        for (int i=index;i<array.length;i++){
            array[i]=oldArray[i+1];
        }
        return array;
    }

    //Sorting the Data
    //Insertion Sort
    //Big-O O(n²)
    public double[] insertionSort(){
        double temp;
        for (int i = 1; i<array.length; i++){
            for (int j=i; j>0; j--){
                if (array[i]<array[j-1]){
                    temp =  array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        sorted = true;
        return array;
    }

    //Bubble Sort
    //Big-O O(n²)
    public double[] bubbleSort(){
        double temp;
        for (int ult = array.length-1; ult > 0; ult--){
            for (int i = 0; i<ult; i++){
                if (array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                }
            }
        }
        sorted = true;
        return array;
    }

    //Print Array
    public void printArray(){
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
