/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields 
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class. */
public class privatefieldandmethod {
    private final int number = 10;

    private void show() {
        System.out.println("Private method called");
    }

    public static void main(String[] args) {
        privatefieldandmethod obj = new privatefieldandmethod();
        System.out.println("Number: " + obj.number);  
        obj.show();  
    }
}

// Subclass in same file (can't access private members)
@SuppressWarnings("unused")
class SubClass extends privatefieldandmethod {
    void accessTest() {
      
        System.out.println("Private members are not accessible in subclass");
    }
}
