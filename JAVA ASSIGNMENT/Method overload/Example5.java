/*5. Write two methods with the same name, number of parameters and data type but 
different return Type */
public class Example5 {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example5 obj = new Example5();
        System.out.println("Sum: " + obj.sum(5, 10));
    }
}