import java.util.*;

public class ArrayListIterator {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("banana");
        list.add("apple");
        list.add("mango");
        
        //Creating an iterator
        Iterator<String> iterator = list.iterator();
        
        // Iterating over the list using the Iterator
        while(iterator.hasNext()) {

            //getting the next element from the element
            String element = iterator.next();

            //Printing the current element
            System.out.println(element);
        }

        // Printing the entire list
        System.out.println("Complete list: " + list);
        
    }
}