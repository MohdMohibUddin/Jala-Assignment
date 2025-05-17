// 5. Programs on Logical AND,OR operator and Logical NOT.
public class Logicoperator {
     public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 2;
        // Logical AND
        System.out.println(a > b && a > c);
        System.out.println(a < b && a < c); 
        System.out.println(a > b && a < c); 
        
        // Logical OR 
        System.out.println(a > b || a > c);
        System.out.println(a < b || a < c); 
        System.out.println(a < b || a > c); 

        // Logical NOT
        System.out.println(!(a > b));      
        System.out.println(!(a < b));    
    }
}
