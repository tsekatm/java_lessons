import java.util.*;

public class ArrayListSize {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("banana");
        list.add("apple");
        list.add("mango");
        
        //Get and print the size of the list

        int size = list.size();
        System.out.println("Size of the list = " + size);

        //Print the entire list
        
        System.out.println(list);
        
    }
}