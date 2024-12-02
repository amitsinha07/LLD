package payment_processing_system;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        CreditCardPayment creditcard = new CreditCardPayment("1234-5678-9012-3456", "Jyto Doe");
        context.setPaymentStrategy(creditcard);
        context.executePayment(1000);

        // Switch to UPI
        UpiPayment upi = new UpiPayment("joh.doe@upi");
        context.setPaymentStrategy(upi);
        context.executePayment(500);

        // Switch to PayPal
        PayPalPayment paypal = new PayPalPayment("john.doe@example.com");
        context.setPaymentStrategy(paypal);
        context.executePayment(750);
    }
}

