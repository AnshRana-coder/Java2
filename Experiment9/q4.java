
import java.io.*;

public class q4{
    public static void main(String[] args) {
        String filename = "student.txt";

        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("Serial No: 1\n");
            bw.write("First Name: Ansh\n");
            bw.write("CGPA: 8.7\n");
            bw.write("Grade: A\n");
            bw.close();

            
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("ANSH RANA 24CSU275");

            System.out.println("File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } 
        catch (IOException e) {
            System.out.println("ANSH RANA 24CSU275");

            System.out.println("Error: " + e.getMessage());
        }
    }
}
