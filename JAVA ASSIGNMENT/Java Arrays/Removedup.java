//18. Write a program to remove the duplicate elements and return the new array
public class Removedup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                temp[count] = arr[i];
                count++;
            }
        }

        System.out.print("New array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
