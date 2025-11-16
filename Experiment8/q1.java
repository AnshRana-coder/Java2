
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class q1{
    public static void main(String[] args) {
        try {

            if (args.length < 5) {
                throw new CheckArgumentException("Less than five arguments provided!");
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("Sum of 5 numbers = " + sum);
        } 
        catch (CheckArgumentException e) {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("Error: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.out.println("ANSH RANA 24CSU275");
            System.out.println("Please enter only integers!");
        }
    }
}
