import java.util.*;

public class VectorContainsAll {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("banana");
        vector.add("apple");
        vector.add("mango");

        // Creating another collection
        Vector<String> otherVector = new Vector<>(Arrays.asList("pineapple", "strawberry"));

        boolean containsAll = vector.containsAll(otherVector);
        System.out.println("Contains all: " + containsAll);

        // Print the entire vectors
        System.out.println("Original Vector: " + vector);
        System.out.println("Other Vector: " + otherVector);
    }
}
