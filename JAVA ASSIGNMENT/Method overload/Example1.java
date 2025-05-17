//1. Write two methods with the same name but different number of parameters of same type and call the methods from main method
public class Example1 {

    void show(int a) {
        System.out.println("One parameter: " + a);
    }

    void show(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.show(10);
        obj.show(10, 20);
    }
}