//8. Write a function to find the minimum and maximum value of an array

public class minmax {  
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max); 
    }
}