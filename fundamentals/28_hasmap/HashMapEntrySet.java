import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry; 

public class HashMapEntrySet {
    public static void main(String[] args) {

        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add Key-value pairs to the map
        studentScores.put("Alice", 98);
        studentScores.put("Ray", 56);
        studentScores.put("Rose", 98);

        // Retrieve the set of entries
        Set<Entry<String, Integer>> entrySet = studentScores.entrySet();

        // Iterate over entries and print key-value pairs
        System.out.println("Student scores:");
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
