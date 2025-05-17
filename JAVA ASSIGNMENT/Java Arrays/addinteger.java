// 1. Write a function to add integer values of an array
public class addinteger{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}