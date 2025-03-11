
class Bank {
    double getInterestRate() {
        return 0;  
    }
}

// Child class 1 - SBI Bank
class SBI extends Bank {
    double getInterestRate() {
        return 5.4;  
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 6.2;  
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 5.9;  
    }
}


public class BankInterestExample {
    public static void main(String[] args) {
        Bank myBank;  

        myBank = new SBI();  
        System.out.println("SBI Interest Rate: " + myBank.getInterestRate() + "%");

        myBank = new HDFC();
        System.out.println("HDFC Interest Rate: " + myBank.getInterestRate() + "%");

        myBank = new ICICI();
        System.out.println("ICICI Interest Rate: " + myBank.getInterestRate() + "%");
    }
}
