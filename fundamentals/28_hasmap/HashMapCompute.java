import java.util.*;

public class HashMapCompute {
	public static void main(String[] args) {
		
		//Create a HashMap with String keys and Integer values
		HashMap<String, Integer> studentScores = new HashMap<>();

		//Add Key-value pairs to the map

		studentScores.put("Alice", 98);
		studentScores.put("Ray", 56);
		studentScores.put("Rose", 98);
		

		// Using compute to update Alice's score
        studentScores.compute("Alice", (key, oldValue) -> oldValue == null ? 90 : oldValue + 5);

        // Printing the updated score
        System.out.println("Alice's updated score: " + studentScores.get("Alice"));

		// Print student scores
        System.out.println(studentScores);
	}
}