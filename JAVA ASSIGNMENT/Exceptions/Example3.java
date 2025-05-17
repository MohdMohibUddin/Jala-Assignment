public class Example3 {
    static void throwException() throws Exception {
        throw new Exception("Exception from method");
    }

    public static void main(String[] args) throws Exception {
        throwException(); // Not handled, declared using throws
    }
}
