//4. Write a function to test if array contains a specific value
public class specificvalue {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12};
        int value = 90;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Value found");
        else
            System.out.println("Value not found");
    }
}
