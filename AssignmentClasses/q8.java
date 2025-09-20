abstract class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit = 10000;

    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount(101, 5000);
        BankAccount c = new CurrentAccount(102, 2000);

        s.deposit(2000);
        s.withdraw(3000);
        s.displayBalance();

        c.deposit(1000);
        c.withdraw(12000);
        c.displayBalance();
    }
}
