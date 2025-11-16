
class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Stored Message: " + message);
    }
}

public class q4 {
    public static void main(String[] args) {
        try {
            throw new MyException("ANSH RANA 24CSU275!");
        } 
        catch (MyException e) {
            System.out.println("ANSH RANA 24CSU275");
            e.printMessage();
        }
    }
}
