// 15. Write a method to find number of even number and odd numbers in an array
public class noevenodd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 10};

        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers: " + even); // 3
        System.out.println("Odd numbers: " + odd);   // 2
    }
}
