import java.io.*;

public class WriteWithBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("Hello from BufferedWriter!");
        bw.close();
    }
}
