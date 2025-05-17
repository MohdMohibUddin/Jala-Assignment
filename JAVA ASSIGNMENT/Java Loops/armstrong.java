// 8. Write a program to find Armstrong number or not
public class armstrong{
    public static void main(String[] args) {
        int num = 153, original = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number :" + sum);
        else
            System.out.println("Not an Armstrong Number :" + sum);
    }
}

