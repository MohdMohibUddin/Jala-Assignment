//16. Write a function to get the difference of largest and smallest value
public class difflargesmall {
      public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30};

        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        int diff = max - min;
        System.out.println("Difference = " + diff);
    }
}
