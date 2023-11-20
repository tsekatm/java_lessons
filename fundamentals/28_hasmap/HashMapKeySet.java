import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapKeySet {
    public static void main(String[] args) {

        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add Key-value pairs to the map
        studentScores.put("Alice", 98);
        studentScores.put("Ray", 56);
        studentScores.put("Rose", 98);

        // Retrieve the set of keys
        Set<String> keySet = studentScores.keySet();

        // Iterate over keys and print key-value pairs
        System.out.println("Student scores:");

        for (String key : keySet) {
            System.out.println(key + ": " + studentScores.get(key));
        }
    }
}
