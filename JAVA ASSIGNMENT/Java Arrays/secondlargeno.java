//13. Write a method to find the second largest number in an array
public class secondlargeno {
     public static void main(String[] args) {
        int[] arr = {10, 25, 40, 15, 5};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Number is: " + secondLargest);
    }
}

