// 9. Write a program to find the prime or not.
public class prime {
    public static void main(String[] args) {
        int num = 21;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                isPrime = false;
        }

        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}

    
