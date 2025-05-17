package otherpkg;
import mainpkg.ProtectedExample;

public class NotChildAccess {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
    
        System.out.println("Cannot access protected members from non-subclass in other package");
    }
}
