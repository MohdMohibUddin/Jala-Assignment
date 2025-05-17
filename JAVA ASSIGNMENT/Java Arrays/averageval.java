// 2. Write a function to calculate the average value of an array of integers
public class averageval {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 30};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("Average = " + average); 
    }   
}
