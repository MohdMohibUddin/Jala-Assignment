public class Example4 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught");
        } catch (Exception e) {
            System.out.println("General Exception caught");
        }
    }
}
