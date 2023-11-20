import java.util.*;

public class HashMapReplace {
	public static void main(String[] args) {
		
		//Create a HashMap with String keys and Integer values
		HashMap<String, Integer> studentScores = new HashMap<>();

		//Add Key-value pairs to the map

		studentScores.put("Alice", 98);
		studentScores.put("Ray", 56);
		studentScores.put("Rose", 98);
		studentScores.replace("Rose", 98, 100);

		// Print student scores
        System.out.println(studentScores);
	}
}