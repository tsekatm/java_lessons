import java.util.*;

public class VectorContains {
    public static void main(String[] args) {

        
        Vector<String> vector = new Vector<>();

        
        vector.add("banana");
        vector.add("apple");
        vector.add("mango");
        
        //Check if the vector contains a specific element
        boolean containsApple = vector.contains("apple");
        System.out.println("Contains 'apple': " + containsApple);


        //Print the entire vector
        
        System.out.println(vector);
        
    }
}