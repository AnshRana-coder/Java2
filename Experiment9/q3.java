
import java.io.*;

public class q3 {
    public static void main(String[] args) {
        try {
            
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is a test file.\nWelcome to File Handling in Java!");
            writer.close();

            
            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("File content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
