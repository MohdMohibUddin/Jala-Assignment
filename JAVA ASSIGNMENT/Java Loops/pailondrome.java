// 10. Write a program to palindrome or not.
public class pailondrome {
    public static void main(String[] args) {
        int num = 992, original = num, rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (rev == original)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    
}
