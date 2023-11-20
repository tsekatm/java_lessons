import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class HashMapNameSurname {
    public static void main(String[] args) {
        // Create an empty HashMap with name as key and surname as value
        HashMap<String, String> nameSurnameMap = new HashMap<>();

        // Add name-surname pairs to the map
        nameSurnameMap.put("Mary", "Steward");
        nameSurnameMap.put("Billy", "Jones");
        nameSurnameMap.put("Rose", "Panther");
        nameSurnameMap.put("Anne", "Kale");
        nameSurnameMap.put("Peter", "Maroon");
        nameSurnameMap.put("Jake", "Ron");
        nameSurnameMap.put("Jesicca", "Boomberg");

        // Retrieve the set of entries
        Set<Entry<String, String>> nameSurnameEntrySet = nameSurnameMap.entrySet();

        // Iterate over entries and print key-value pairs (name and surname)
        System.out.println("Name-Surname pairs:");
        for (Entry<String, String> entry : nameSurnameEntrySet) {
            String name = entry.getKey();
            String surname = entry.getValue();
            System.out.println(name + ": " + surname);
        }
    }
}
