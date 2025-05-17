import java.lang.reflect.*;

public class Example14 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<String> cls = String.class;
        Method m = cls.getMethod("noMethod");
    }
}
