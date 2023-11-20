import java.util.*;

public class ArrayListContainsAll {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("banana");
        list.add("apple");
        list.add("mango");
        
        //Creating another collection
        ArrayList<String> otherList = new ArrayList<>(Arrays.asList("apple", "mango"));

        //Check if the list contains a specific element
        boolean containsAll = list.containsAll(otherList);
        System.out.println("Contains all: " + containsAll);


        //Print the entire list
        
        System.out.println(otherList);
        System.out.println(list);
        
    }
}