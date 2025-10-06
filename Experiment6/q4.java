import java.util.*;
abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    void getBalance() {
        System.out.println("Balance in BankA: $100");
    }
}
class BankB extends Bank {
    void getBalance() {
        System.out.println("Balance in BankB: $150");
    }
}
class BankC extends Bank {
    void getBalance() {
        System.out.println("Balance in BankC: $200");
    }
}

public class q4 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
