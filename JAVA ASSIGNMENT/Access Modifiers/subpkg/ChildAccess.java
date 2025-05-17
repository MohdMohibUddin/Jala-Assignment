package subpkg;
import mainpkg.ProtectedExample;

public class ChildAccess extends ProtectedExample {
    public static void main(String[] args) {
        ChildAccess obj = new ChildAccess();
        obj.display();  // ✅ Allowed (inherited)
        System.out.println("Accessed in subclass from different package: " + obj.num); 
    }
}
