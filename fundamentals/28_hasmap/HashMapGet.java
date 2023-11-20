import java.util.*;

public class HashMapGet {
	public static void main(String[] args) {
		
		//Create a HashMap with String keys and Integer values
		HashMap<String, Integer> studentScores = new HashMap<>();

		//Add Key-value pairs to the map

		studentScores.put("Alice", 98);
		studentScores.put("Ray", 56);
		studentScores.put("Rose", 98);

		// Retrieve and print values based on keys
        System.out.println("Alice's score: " + studentScores.get("Alice"));
	}
}