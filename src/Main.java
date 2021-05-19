import array.Doubles;
import array.Objects;

public class Main {

    public static void main(String[] args) {
        Doubles array1 = new Doubles(new double[]{1, 4, 3, 5, 3});
        Objects obj1 = array1;
        Objects object = new Objects(new Objects[]{obj1});
        array1.printArray();
        System.out.println();

        //Get Element
        System.out.println("Get Element");
        array1.getElementAt(5);
        System.out.println();

        //Search Element in not Sorted Matrix
        System.out.println("Search for Element");
        array1.indexOfElement(5);
        System.out.println();

        //Insert Element in the last index
        System.out.println("Insert Element");
        array1.insertElement(7,6);
        array1.printArray();
        System.out.println();

        //Delete Element
        System.out.println("Delete Element");
        array1.deleteElement(6);
        array1.printArray();
        System.out.println();

        //Sorting the Array
        System.out.println("Sorting the Array");
        array1.bubbleSort();
        array1.printArray();
    }

}
