import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class HashMapCityCountry {
    public static void main(String[] args) {
        // Create an empty HashMap with name as key and surname as value
        HashMap<String, String> cityCountryMap = new HashMap<>();

        // Add name-surname pairs to the map
        cityCountryMap.put("Johannesburg", "South Africa");
        cityCountryMap.put("Pretoria", "South Africa");
        cityCountryMap.put("Bloemfontein", "South Africa");
        cityCountryMap.put("Munich", "Germany");
        cityCountryMap.put("London", "England");
        cityCountryMap.put("Beijing", "China");
        cityCountryMap.put("Harare", "Zimbabwe");

        // Retrieve the set of entries
        Set<Entry<String, String>> cityCountryEntrySet = cityCountryMap.entrySet();

        // Iterate over entries and print key-value pairs (city and Country)
        System.out.println("city Country pairs:");
        for (Entry<String, String> entry : cityCountryEntrySet) {
            String city = entry.getKey();
            String Country = entry.getValue();
            System.out.println(city + ": " + Country );
        }
    }
}