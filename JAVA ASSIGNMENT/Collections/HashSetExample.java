/*3. Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet */
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add 10 elements
        for (int i = 1; i <= 10; i++) {
            set.add("Element" + i);
        }

        // Add duplicate
        set.add("Element5");

        // Iterate
        System.out.println("HashSet elements:");
        for (String s : set) {
            System.out.println(s);
        }

        // Check contains
        System.out.println("Contains Element3? " + set.contains("Element3"));

        // Remove element
        set.remove("Element4");

        // Size
        System.out.println("Set size: " + set.size());

        // isEmpty
        System.out.println("Is empty? " + set.isEmpty());

        // Clear
        set.clear();
        System.out.println("Cleared set. Size: " + set.size());
    }
}
