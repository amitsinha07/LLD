# Stategy Pattern

## Payment Proceessing System

+-------------------+        +-------------------------+
| PaymentStrategy   |<-------| +---------------------+ |
|-------------------|        | | CreditCardPayment   | |
| + pay(amount)     |        | +---------------------+ |
+-------------------+        | | UpiPayment          | |
                            | +---------------------+ |
                            | | PayPalPayment       | |
                            | +---------------------+ |
                            +-------------------------+
                                      ^
                                      |
                                      |
                            +-------------------------+
                            | PaymentContext          |
                            |-------------------------|
                            | - paymentStrategy: PaymentStrategy |
                            | + setPaymentStrategy(strategy: PaymentStrategy) |
                            | + executePayment(amount: int) |
                            +-------------------------+
