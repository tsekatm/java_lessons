import java.util.*;

public class VectorGet {
    public static void main(String[] args) {

        
        Vector<String> vector = new Vector<>();

        
        vector.add("banana");
        vector.add("apple");
        vector.add("mango");
        
        //Get the items in the first index

        String get = vector.get(0);
        System.out.println("the item in the first index = " + get);

        //Print the entire vector
        
        System.out.println(vector);
        
    }
}