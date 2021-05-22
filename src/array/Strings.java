package array;

public class Strings extends Objects {
    private String[] array;

    //Constructors
    public Strings(String[] array){this.array = array;}

    //Getters
    public String[] getArray(){
        return array;
    }

    //Setters
    public void setArray(String[] array){
        this.array=array;
    }

    //Accessing an element
    //Big-O: O(1)
    public String getElementAt(int index){
        try {
            System.out.println(array[index]);
            return array[index];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return "";
        }
    }

    //Searching for an element
    //sorted is true if the array is sorted
    public int indexOfElement(String element){
        //Linear Search
        //Big-O O(n)
        for (int i = 0; i<array.length; i++){
            if (element == array[i]) {
                System.out.println("The element is in the index "+i);
                return i;
            }
        }
        System.out.println("The element is not in the Array.");
        return -1;
    }

    //Inserting an element
    //Big-O: O(n)
    public String[] insertElement(String element,int index){
        try { if (index>array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        String[] oldArray = array;
        array = new String[oldArray.length + 1];
        
        //Insert the element
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
    public String[] deleteElement(int index){
        try {if (index>=array.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return array;
        }
        String[] oldArray = array;
        array = new String[oldArray.length-1];
        for (int i=0; i<index;i++){
            array[i]=oldArray[i];
        }
        for (int i=index;i<array.length;i++){
            array[i]=oldArray[i+1];
        }
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
