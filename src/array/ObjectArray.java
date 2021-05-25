package array;

public class ObjectArray implements Cloneable {
	
	private ObjectArray[] objects;
	
	//Override clone function from Object class
	@Override
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    //Constructors
    public ObjectArray(ObjectArray[] array){this.objects = array;}
    public ObjectArray(){}

    //Getters
    public ObjectArray[] getObjects(){
        return objects;
    }

    //Setters
    public void setObjects(ObjectArray[] objects){
        this.objects = objects;
    }
    
    //Setting an element of the Matrix
    //Big-O: O(1)
    public ObjectArray[] setElementAt(ObjectArray object, int row) {
    	try {
    		objects[row]=object;
    		return objects;
    	}
    	catch(ArrayIndexOutOfBoundsException OutOfBoundsException){
            System.out.println("Array Index is Out of Bounds");
            return objects;
        }
    }
    
    //Accessing an element
    //Big-O: O(1)
    public ObjectArray getObjectAt(int index){
        try {
            System.out.println(objects[index]);
            return objects[index];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return new ObjectArray();
        }
    }

    //Searching for an object
    //sorted is true if the array is sorted
    public int[] indexOfObject(ObjectArray object){
    	int[] row = new int[] {};
    	//Linear Search
        //Big-O O(n)
        for (int j = 0; j<objects.length; j++){
            if (object == objects[j]) {
                System.out.println("The object is in the index "+j);
                //Save the old values and initialize the new matrix
	       		int[] oldRow = row;	
	       		row = new int[row.length+1];		    	       		
	       		//Insert the old values
	       	    for (int  i = 0; i < oldRow.length; i++) {
       	            row[i]=oldRow[i];
	       	    }
	       	    //Save the row index
	       	    row[oldRow.length]=j;
            }
        }
        //case the element is not found return a empty array
       	if (row.length == 0) System.out.println("The element is not in the Array.");
       	return row;
    }

    //Inserting an object
    //Big-O: O(n)
    public ObjectArray[] insertObject(ObjectArray object, int index){
        try { if (index> objects.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array Index is Out of Bounds");
            return objects;
        } 
        
        ObjectArray[] oldArray = objects;
        objects = new ObjectArray[oldArray.length + 1];
        
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
    public ObjectArray[] deleteObject(int index){
        try {if (index>= objects.length || index<0) throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index is Out of Bounds");
            return objects;
        }
        ObjectArray[] oldArray = objects;
        objects = new ObjectArray[oldArray.length-1];
        for (int i=0; i<index;i++){
            objects[i]=oldArray[i];
        }
        for (int i = index; i< objects.length; i++){
            objects[i]=oldArray[i+1];
        }
        return objects;
    }
    
    //Print Array
    public void printObject(){
        for (int i = 0; i<objects.length;i++){
            System.out.print(objects[i]+"\t");
        }
        System.out.println();
    }
}
