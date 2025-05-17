public class multiifelse {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a > b && a > c)
            System.out.println("Largest is: " + a);
        else if (b > c)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Largest is: " + c);
    }
    
}
