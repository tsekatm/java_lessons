import java.util.*;

public class ArrayListContains {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("banana");
        list.add("apple");
        list.add("mango");
        
        //Check if the list contains a specific element
        boolean containsApple = list.contains("apple");
        System.out.println("Contains 'apple': " + containsApple);


        //Print the entire list
        
        System.out.println(list);
        
    }
}