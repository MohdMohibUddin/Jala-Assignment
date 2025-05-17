/*2. Create a class with DEFAULT fields and methods. Access these fields and methods 
from any other class in the same package */
public class defaultdieldmethod {
    
    int num = 50; // default access
    void display() {
        System.out.println("Default method called, num = " + num);
    }
}
