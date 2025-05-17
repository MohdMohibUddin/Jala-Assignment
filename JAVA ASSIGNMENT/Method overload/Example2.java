/*2. Write two methods with the same name but different number of parameters of different 
data type and call the methods from main method */
public class Example2 {

    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(int a, String b) {
        System.out.println("Integer and String: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.display(5);
        obj.display(10, "Hello");
    }
}