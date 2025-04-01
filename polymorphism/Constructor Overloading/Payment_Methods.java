class OrderProcessor {
    private String paymentMethod;
    private String details;
    private double amount;

    // Constructor Overloading
    public OrderProcessor(double amount) {
        this.paymentMethod = "Cash";
        this.amount = amount;
        this.details = "N/A";
    }

    public OrderProcessor(String cardNumber, double amount) {
        this.paymentMethod = "Credit Card";
        this.details = cardNumber;
        this.amount = amount;
    }

    public OrderProcessor(String voucherCode, double amount, boolean isVoucher) {
        this.paymentMethod = "Voucher";
        this.details = voucherCode;
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing payment of $" + amount + " via " + paymentMethod + " (" + details + ").");
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        
        OrderProcessor creditCardPayment = new OrderProcessor("1234-5678-9876", 150.75);
        creditCardPayment.processPayment();

      
        OrderProcessor cashPayment = new OrderProcessor(50.00);
        cashPayment.processPayment();

     
        OrderProcessor voucherPayment = new OrderProcessor("ABC123", 30.50, true);
        voucherPayment.processPayment();
    }
}
