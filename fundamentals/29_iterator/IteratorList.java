import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get an iterator for the list
        Iterator<String> iterator = fruits.iterator();

        // Iterate over the elements using the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
