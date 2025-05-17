//17. Write a method to verify if the array contains two specified elements(12,23)
public class verifytwono {
     public static void main(String[] args) {
        int[] arr = {10, 12, 5, 23, 7};

        boolean has12 = false, has23 = false;

        for (int num : arr) {
            if (num == 12) has12 = true;
            if (num == 23) has23 = true;
        }

        if (has12 && has23)
            System.out.println("Both 12 and 23 are present.");
        else
            System.out.println("One or both are missing.");
    } 
}
