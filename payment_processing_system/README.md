# Strategy Pattern - Payment Processing System

This repository demonstrates the implementation of the Strategy Pattern in a payment processing system.

## UML Diagram

```mermaid
classDiagram
    class PaymentStrategy {
        <<interface>>
        +pay(amount: int)
    }
    class CreditCardPayment {
        +pay(amount: int)
    }
    class UpiPayment {
        +pay(amount: int)
    }
    class PayPalPayment {
        +pay(amount: int)
    }
    class PaymentContext {
        -paymentStrategy: PaymentStrategy
        +setPaymentStrategy(strategy: PaymentStrategy)
        +executePayment(amount: int)
    }

    PaymentStrategy <|-- CreditCardPayment
    PaymentStrategy <|-- UpiPayment
    PaymentStrategy <|-- PayPalPayment
    PaymentContext --> PaymentStrategy
