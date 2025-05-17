public class Example2 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e.getMessage());
        }
    }
}
