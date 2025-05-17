//5. Write a function to remove a specific element from an array
public class removespecificele {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        int valueToRemove = 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != valueToRemove) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}