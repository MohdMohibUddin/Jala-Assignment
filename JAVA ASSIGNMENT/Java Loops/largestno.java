// 5. Write a program to print largest number among three numbers.
public class largestno {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if(a > b && a > c)
            System.out.println("Largest is: " + a);
        else if (b > c)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Largest is: " + c);
    }
}


