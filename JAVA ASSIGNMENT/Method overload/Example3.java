/*3. Write two methods with the same name and same number of parameters of same type 
and call from main method**/
public class Example3 {
   
    void show(int a) {
        System.out.println("First method: " + a);
    }
    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.show(10);
    }
}
   

