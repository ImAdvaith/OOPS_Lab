import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) System.out.println("Insufficient balance!");
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder + " | Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Advaith", 5000);
        sa.deposit(2000);
        sa.withdraw(3000);
        sa.displayAccount();
    }
}
