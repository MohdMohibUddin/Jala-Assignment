/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList */
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add 10 elements
        for (int i = 1; i <= 10; i++) {
            list.add("Item" + i);
        }

        // Add an element
        list.add("NewItem");

        // Iterate using Iterator
        Iterator<String> it = list.iterator();
        System.out.println("Iterating:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Add at specific index
        list.add(2, "InsertedItem");

        // Remove by value
        list.remove("Item5");

        // Remove at index
        list.remove(3);

        // Update element at index
        list.set(1, "UpdatedItem");

        // Check element at index
        System.out.println("Element at index 1: " + list.get(1));

        // Get element
        System.out.println("Element at index 4: " + list.get(4));

        // Size of list
        System.out.println("Size: " + list.size());

        // Contains
        System.out.println("Contains 'Item3'? " + list.contains("Item3"));

        // Clear all
        list.clear();
        System.out.println("Cleared list, size now: " + list.size());
    }
}
