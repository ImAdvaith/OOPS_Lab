class BankAccount {
    private String accountHolder;
    private double balance;
    private String pin;

    public BankAccount(String accountHolder, double balance, String pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance(String enteredPin) {
        if (this.pin.equals(enteredPin)) {
            return balance;
        } else {
            System.out.println(" Incorrect PIN. Access denied.");
            return -1;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

   
    public void changePin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
            System.out.println(" PIN changed successfully.");
        } else {
            System.out.println(" Incorrect old PIN. PIN change failed.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }
   
    public void withdraw(double amount, String enteredPin) {
        if (!this.pin.equals(enteredPin)) {
            System.out.println(" Incorrect PIN. Withdrawal denied.");
            return;
        }

        if (amount > balance) {
            System.out.println(" Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn $" + amount + ". New Balance: $" + balance);
        }
    }
}


public class SecureBankingSystem {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Advaith", 5000, "1234");
        System.out.println("🏦 Welcome, " + myAccount.getAccountHolder());

        
        myAccount.deposit(1500);
        myAccount.withdraw(1000, "1234");
        System.out.println(" Checking balance: $" + myAccount.getBalance("1234"));
        myAccount.withdraw(500, "0000");
        myAccount.changePin("1234", "5678");
    }
}
