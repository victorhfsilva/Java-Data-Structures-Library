package array;

public class Objects {
    private Objects[] objects;

    //Constructors
    public Objects(Objects[] array){
        this.objects = array;
    }
    Objects(){
        System.out.println("Null Object");
    }

    //Getters
    public Objects[] getObjects(){
        return objects;
    }

    //Setters
    public void setObjects(Objects[] objects){
        this.objects = objects;
    }

    //Accessing an element
    //Big-O: O(1)
    public Objects getObjectAt(int index){
        try {
            System.out.println(objects[index]);
            return objects[index];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return new Objects();
        }
    }

    //Searching for an object
    //sorted is true if the array is sorted
    public int indexOfObject(Objects object){
        //Linear Search
        //Big-O O(n)
        for (int i = 0; i< objects.length; i++){
            if (object == objects[i]) {
                System.out.println("The object is in the index "+i);
                return i;
            }
        }
        System.out.println("The object is not in the Array.");
        return -1;
    }

    //Inserting an object
    //Big-O: O(n)
    public Objects[] insertObject(Objects object, int index){
        try { if (index> objects.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index is Out of Bounds");
            return objects;
        }
        Objects[] oldArray = objects;
        if (index == objects.length) {
            objects = new Objects[oldArray.length+1];
            objects[oldArray.length]=object;
        }
        else {
            Objects temp = objects[index];
            objects = new Objects[oldArray.length + 1];
        }
        for (int i = 0; i<index; i++){
            objects[i]=oldArray[i];
        }
        objects[index]=object;
        for (int i = index+1; i< objects.length; i++){
            objects[i]=oldArray[i-1];
        }
        return objects;
    }

    //Deleting an element
    //Big-O: O(n)
    public Objects[] deleteObject(int index){
        try {if (index>= objects.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return objects;
        }
        Objects[] oldArray = objects;
        objects = new Objects[oldArray.length-1];
        for (int i=0; i<index;i++){
            objects[i]=oldArray[i];
        }
        for (int i = index; i< objects.length; i++){
            objects[i]=oldArray[i+1];
        }
        return objects;
    }
}
