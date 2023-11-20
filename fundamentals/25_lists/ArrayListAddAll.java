import java.util.*;

public class ArrayListAddAll {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("banana");
        list.add("apple");
        list.add("mango");
        
        //Creating another collection
        ArrayList<String> otherList = new ArrayList<>(Arrays.asList("pineapple", "strawberry"));

        
        boolean addAll = list.addAll(otherList);
        System.out.println("Add all: " + addAll);


        //Print the entire list
        
        System.out.println(otherList);
        System.out.println(list);
        
    }
}