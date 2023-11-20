import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("mango");

        // Convert the list to an array
        Object[] toArray = list.toArray();
        
        // Print the array
        System.out.println("Array: " + Arrays.toString(toArray));

        // Print the entire list
        System.out.println("List: " + list);
    }
}
