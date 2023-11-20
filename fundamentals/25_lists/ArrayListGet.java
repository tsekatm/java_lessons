import java.util.*;

public class ArrayListGet {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("banana");
        list.add("apple");
        list.add("mango");
        
        //Get the items in the first index

        String get = list.get(0);
        System.out.println("the item in the first index = " + get);

        //Print the entire list
        
        System.out.println(list);
        
    }
}