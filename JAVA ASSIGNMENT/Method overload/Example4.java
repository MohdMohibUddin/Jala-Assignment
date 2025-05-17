/*4. Write two methods with the same name and same number of parameters of different 
type and call from main method */
public class Example4 {

    void print(int a) {
        System.out.println("int: " + a);
    }

    void print(String b) {
        System.out.println("String: " + b);
    }

    public static void main(String[] args) {
        Example4 obj = new Example4();
        obj.print(100);
        obj.print("Java");
    }
}