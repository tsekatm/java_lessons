import java.util.*;

public class VectorAddAll {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("banana");
        vector.add("apple");
        vector.add("mango");

        // Creating another collection
        Vector<String> otherVector = new Vector<>(Arrays.asList("pineapple", "strawberry"));

        // Add all elements from otherVector to vector
        boolean addAll = vector.addAll(otherVector);
        System.out.println("Add all: " + addAll);

        // Print the entire vectors
        System.out.println("Original Vector: " + vector);
        System.out.println("Other Vector: " + otherVector);
    }
}
