interface CryptoTransaction {
    void validateTransaction(double amount);
    void executeTransaction(String sender, String receiver);
    double calculateTransactionFee(double amount);
    void executeSmartContract(String contractDetails);
    boolean detectFraud(double amount);
}

class Bitcoin implements CryptoTransaction {
    public void validateTransaction(double amount) {
        System.out.println("Bitcoin: Validating transaction of " + amount + " BTC.");
    }

    public void executeTransaction(String sender, String receiver) {
        System.out.println("Bitcoin: Transferring " + sender + " → " + receiver + " on blockchain.");
    }

    public double calculateTransactionFee(double amount) {
        return amount * 0.0005; // 0.05% fee
    }

    public void executeSmartContract(String contractDetails) {
        System.out.println("Bitcoin: Executing smart contract - " + contractDetails);
    }

    public boolean detectFraud(double amount) {
        return amount > 100; // If the transaction is too large, flag as fraud
    }
}

class Ethereum implements CryptoTransaction {
    public void validateTransaction(double amount) {
        System.out.println(" Ethereum: Validating " + amount + " ETH.");
    }

    public void executeTransaction(String sender, String receiver) {
        System.out.println(" Ethereum: Processing transaction for " + sender + " → " + receiver);
    }

    public double calculateTransactionFee(double amount) {
        return amount * 0.002; // 0.2% fee
    }

    public void executeSmartContract(String contractDetails) {
        System.out.println(" Ethereum: Deploying smart contract - " + contractDetails);
    }

    public boolean detectFraud(double amount) {
        return amount > 500; // Higher fraud detection threshold for ethereum as its value is lesser than BTC
    }
}

public class CryptoSystem {
    public static void main(String[] args) {
        CryptoTransaction bitcoin = new Bitcoin();
        CryptoTransaction ethereum = new Ethereum();

        bitcoin.executeTransaction("Advaith", "Sanjay");
        System.out.println("Transaction Fee: " + bitcoin.calculateTransactionFee(10) + " BTC");
        bitcoin.executeSmartContract("NFT Marketplace");
        System.out.println("Fraud detected: " + bitcoin.detectFraud(200));

        ethereum.executeTransaction("Sahil", "Rohith");
        System.out.println("Transaction Fee: " + ethereum.calculateTransactionFee(5) + " ETH");
        ethereum.executeSmartContract("Decentralized Voting");
        System.out.println("Fraud detected: " + ethereum.detectFraud(600));
    }
}
