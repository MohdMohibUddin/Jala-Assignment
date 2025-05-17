//19. Write a function to find the missing number of sorted array of 1 to 100
public class missingnosorted {
  public static void main(String[] args) {
        
        int[] arr = new int[99];
        int index = 0;

        for (int i = 1; i <= 100; i++) {
            if (i != 77) {
                arr[index++] = i;
            }
        }

        // Call the function to find missing number
        int missing = findMissingNumber(arr);
        System.out.println("Missing number is: " + missing);
    }

    // Function to find the missing number
    static int findMissingNumber(int[] arr) {
        int expectedSum = 100 * (100 + 1) / 2; // Sum from 1 to 100
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; 
    }
}
