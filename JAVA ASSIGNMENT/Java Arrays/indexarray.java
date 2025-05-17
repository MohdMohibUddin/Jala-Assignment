// 3. Write a program to find the index of an array element
public class indexarray {
     public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int target = 15;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Index = " + i);  
                break;
            }
        }
    } 
}
