//11. Write a program to find the common values between two arrays
public class commanno {
    public static void main(String[] args) {
        int[] a = {2, 10, 3, 4};
        int[] b = {3, 4, 5, 2};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println("Common: " + a[i]);
                }
            }
        }
    }  
}
