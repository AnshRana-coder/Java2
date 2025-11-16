
import java.io.File;

public class q2 {
    public static void main(String[] args) {
        File f = new File("example.txt.txt");

        if (f.exists()) {
            f.setReadable(true);
            f.setWritable(false);
            f.setExecutable(true);
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("File permissions updated:");
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Executable: " + f.canExecute());
        } else {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("File does not exist.");
        }
    }
}
