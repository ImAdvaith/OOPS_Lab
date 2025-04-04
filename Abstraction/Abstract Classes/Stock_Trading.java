import java.util.Random;

abstract class StockTrading {
    protected String traderName;

    StockTrading(String traderName) {
        this.traderName = traderName;
    }

    abstract void analyzeMarket();
    abstract void buyStock(String stock, double amount);
    abstract void sellStock(String stock, double amount);

    public void marketStatus() {
        System.out.println("AI Stock Trading activated for " + traderName);
    }
}


class AIStockBot extends StockTrading {
    private double balance;
    private double stockPrice;

    AIStockBot(String traderName, double initialBalance) {
        super(traderName);
        this.balance = initialBalance;
        this.stockPrice = 100 + new Random().nextInt(100); 
    }

    public void analyzeMarket() {
        stockPrice += (Math.random() * 20 - 10);
        System.out.println("AI Market Analysis: Current stock price is $" + String.format("%.2f", stockPrice));
    }

    public void buyStock(String stock, double amount) {
        if (balance >= amount) {
            System.out.println("Buying " + stock + " worth $" + amount);
            balance -= amount;
        } else {
            System.out.println("Insufficient balance to buy " + stock);
        }
    }

    public void sellStock(String stock, double amount) {
        balance += amount;
        System.out.println("Selling " + stock + " for $" + amount);
    }

    public void showBalance() {
        System.out.println(" Current Balance: $" + balance);
    }
}


public class AIStockTrading {
    public static void main(String[] args) {
        AIStockBot trader = new AIStockBot("Elon Trader", 5000);

        trader.marketStatus();
        trader.analyzeMarket();
        trader.buyStock("Tesla", 1200);
        trader.analyzeMarket();
        trader.sellStock("Tesla", 1500);
        trader.showBalance();
    }
}
