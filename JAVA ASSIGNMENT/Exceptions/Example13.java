import java.lang.reflect.*;

public class Example13 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<String> cls = String.class;
        Field f = cls.getField("noField");
    }
}
