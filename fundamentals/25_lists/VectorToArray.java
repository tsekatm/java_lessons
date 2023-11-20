import java.util.*;

public class VectorToArray {
    public static void main(String[] args) {

        ArrayList<String> vector = new ArrayList<>();

        vector.add("banana");
        vector.add("apple");
        vector.add("mango");

        // Convert the list to an array
        Object[] toArray = vector.toArray();
        
        // Print the array
        System.out.println("Array: " + Arrays.toString(toArray));

        // Print the entire list
        System.out.println("Vector: " + vector);
    }
}
