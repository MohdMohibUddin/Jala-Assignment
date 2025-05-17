import java.io.*;
import java.util.Properties;

public class ReadFromPropertiesFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println("username: " + prop.getProperty("username"));
        System.out.println("password: " + prop.getProperty("password"));
        fis.close();
    }
}
