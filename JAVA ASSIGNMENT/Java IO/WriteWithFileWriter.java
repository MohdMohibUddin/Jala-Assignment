import java.io.*;

public class WriteWithFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello from FileWriter!");
        fw.close();
    }
}
