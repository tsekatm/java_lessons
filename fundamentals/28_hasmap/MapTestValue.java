import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class MapTestValue {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        
        hashMap.put("12", "Number 1");
        hashMap.put("13", "Number 2");
        hashMap.put("24", "Number 3");
        hashMap.put("33", "Number 4");
        hashMap.put("rr", "Number 5");
        hashMap.put("gt", "Number 6");
        hashMap.put("qq", "Number 7");
        
        // Retrieve the set of entries
        Set<Entry<String, String>> entrySet = hashMap.entrySet();

        
        for (Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
       
        
    }   
}