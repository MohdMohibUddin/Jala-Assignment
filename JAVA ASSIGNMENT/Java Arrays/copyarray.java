//6. Write a function to copy an array to another array
public class copyarray {
    public static void main(String[] args) {
        int[] original = {5, 10, 15};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        for (int value : copy) {
            System.out.print(value + " "); 
        }
    }
    
}
