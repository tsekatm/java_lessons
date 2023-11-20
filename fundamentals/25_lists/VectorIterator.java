import java.util.*;

public class VectorIterator {
    public static void main(String[] args) {

        
        ArrayList<String> vector = new ArrayList<>();

        
        vector.add("banana");
        vector.add("apple");
        vector.add("mango");
        
        //Creating an iterator
        Iterator<String> iterator = vector.iterator();
        
        // Iterating over the vector using the Iterator
        while(iterator.hasNext()) {

            //getting the next element from the element
            String element = iterator.next();

            //Printing the current element
            System.out.println(element);
        }

        // Printing the entire list
        System.out.println("Complete list: " + vector);
        
    }
}