
import java.io.File;

public class q1{
    public static void main(String[] args) {
        File f = new File("example.txt.txt"); // change path if needed

        if (!f.exists()) {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("File/Directory does not exist.");
        } else if (f.isFile()) {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println(f.getName() + " is a file.");
        } else if (f.isDirectory()) {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println(f.getName() + " is a directory.");
        }
    }
}
