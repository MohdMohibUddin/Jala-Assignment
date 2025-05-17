// 11. Program to check whether a number is EVEN or ODD using switch
import java.util.InputMismatchException;
import java.util.Scanner;

public class evenoddswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter a number: ");
        try {
            int num = sc.nextInt();

            switch(num % 2) {
                case 0 -> System.out.println(num + " is Even.");
                case 1 -> System.out.println(num + " is Odd.");
                default -> System.out.println("Invalid input.");  
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();  
        }
    }
}
