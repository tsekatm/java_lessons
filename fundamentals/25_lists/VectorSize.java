import java.util.*;

public class VectorSize {
    public static void main(String[] args) {

        
        Vector<String> vector = new Vector<>();

        
        vector.add("banana");
        vector.add("apple");
        vector.add("mango");
        
        //Get and print the size of the list

        int size = vector.size();
        System.out.println("Size of the list = " + size);

        //Print the entire list
        
        System.out.println(vector);
        
    }
}