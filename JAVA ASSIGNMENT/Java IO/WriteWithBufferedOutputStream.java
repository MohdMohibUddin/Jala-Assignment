import java.io.*;

public class WriteWithBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
        String data = "Hello from BufferedOutputStream!";
        bos.write(data.getBytes());
        bos.flush();
        bos.close();
    }
}
