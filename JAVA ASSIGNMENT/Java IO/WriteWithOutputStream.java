import java.io.*;

public class WriteWithOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        String data = "Hello from OutputStream!";
        fos.write(data.getBytes());
        fos.close();
    }
}
