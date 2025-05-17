/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map */
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Add 10 key-value pairs
        for (int i = 1; i <= 10; i++) {
            map.put(i, "Student" + i);
        }

        // Insert new key-value
        map.put(11, "NewStudent");

        // Fetch value
        System.out.println("Value for key 5: " + map.get(5));

        // Clone map
        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) map.clone();

        // Check key and value
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Student7'? " + map.containsValue("Student7"));

        // Check empty and size
        System.out.println("Is empty? " + map.isEmpty());
        System.out.println("Size: " + map.size());

        // Print keys and values
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        // Remove key-value pair
        map.remove(4);

        // Copy to another map
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(map);
        System.out.println("Copied map: " + newMap);
    }
}
