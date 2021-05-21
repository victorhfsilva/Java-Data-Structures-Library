package array;
public class Main {
	
    public static void main(String[] args)  throws CloneNotSupportedException {
        Doubles array1 = new Doubles(new double[]{1, 4, 3, 5, 3});
        Strings array2 = new Strings(new String[]{"banana","apple","strawberry","pineapple"});
        Integers array3 = new Integers(new int[]{3,2,4,5,6,1});
        Objects objects = new Objects(new Objects[]{array1,array2, array3});       
       
        //ARRAY OF ELEMENTS
        
        //Print Array
        System.out.println("Print Array");
        array1.printArray();
        System.out.println();

        //Get Element
        System.out.println("Get Element");
        array1.getElementAt(4);
        array2.getElementAt(3);
        System.out.println();

        //Search Element in not Sorted Matrix
        System.out.println("Search for Element");
        array1.indexOfElement(5);
        array2.indexOfElement("apple");
        System.out.println();

        //Insert Element in the last index
        System.out.println("Insert Element");
        array1.insertElement(4,3);
        array1.printArray();
        array2.insertElement("lemon", 3);
        array2.printArray();
        System.out.println();

        //Delete Element
        System.out.println("Delete Element");
        array1.deleteElement(2);
        array1.printArray();
        array2.deleteElement(1);
        array2.printArray();
        System.out.println();

        //Sorting the Array
        System.out.println("Sorting the Array");
        array1.bubbleSort();
        array1.printArray();
        System.out.println();
        
        //2D Array of Doubles
        //CORRIGIR LINHA X COLUNA
        System.out.println("Searching 2D Array");
        double[][] array5_double = {{1.0,2.1,3.0},{1.1,4.2,2.4},{1.5,4.1,5.2,2.1}};
        DoubleMatrix array5 = new DoubleMatrix(array5_double);
        array5.indexOfElement(4.2);
        array5.indexOfElement(5.2,2);
        array5.insertElement(3.4, 1, 3);
        array5.printArray();
        array5.insertionSort(1);
        System.out.println();
        array5.printArray();
        System.out.println();
        
        //ARRAY OF OBJECTS
        
        //Print Objects
        System.out.println("Print Objects");
        objects.printObject();
        System.out.println();
        
        //Index of Object
        System.out.println("Print Index of Object");
        objects.indexOfObject(array3);
        System.out.println();
        
        //Get Object and Clone It
        System.out.println("Clone Object");
        Objects array4 = (Objects) objects.getObjectAt(0).clone();
        System.out.println();
       
        //Insert Object and get its reference
        System.out.println("Insert Cloned Object");
        objects.insertObject(array4,2);
        objects.getObjectAt(2);
        objects.printObject();
        System.out.println();
        
        //Delete a Object
        System.out.println("Delete Object");
        objects.deleteObject(1);
        objects.printObject();        
    }

}
