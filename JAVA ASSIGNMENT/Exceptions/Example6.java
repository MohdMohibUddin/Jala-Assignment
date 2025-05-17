class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class Example6 {
    public static void main(String[] args) throws MyException {
        throw new MyException("This is my custom exception");
    }
}
