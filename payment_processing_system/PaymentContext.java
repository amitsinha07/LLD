package payment_processing_system;

// Context
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Allows dynamic setting of the strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        paymentStrategy.pay(amount);
    }
}

