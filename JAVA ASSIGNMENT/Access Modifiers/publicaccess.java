public class publicaccess {
    public static void main(String[] args) {
        publicfm obj = new publicfm();
        obj.greet();  // allowed
        System.out.println("Age: " + obj.age);
    }
    
}
