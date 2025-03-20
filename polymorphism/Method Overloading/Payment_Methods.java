class OrderProcessor {

    public void processPayment(String cardNumber, double amount) {
        System.out.println("Processing payment of $" + amount + " via credit card: " + cardNumber);
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via cash.");
    }

    public void processPayment(String voucherCode, double amount) {
        System.out.println("Processing payment of $" + amount + " via voucher code: " + voucherCode);
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        // Payment via credit card
        orderProcessor.processPayment("1234-5678-9876", 150.75);

        // Payment via cash
        orderProcessor.processPayment(50.00);

        // Payment via voucher
        orderProcessor.processPayment("ABC123", 30.50);
    }
}
