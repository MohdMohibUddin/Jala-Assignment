package mainpkg;

public class SamePackageAccess {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.display();  // ✅ Allowed
        System.out.println("Accessed in same package: " + obj.num);  // ✅ Allowed
    }
}
