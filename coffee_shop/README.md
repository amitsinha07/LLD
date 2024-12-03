# Decorator Pattern

The Decorator Pattern dynamically adds behavior to an object without altering its structure, following the principle of composition over inheritance.

## Mermaid Diagram

```mermaid
classDiagram
    direction LR

    class Coffee {
        <<interface>>
        +getDescription() String
        +getCost() double
    }

    class BasicCoffee {
        +getDescription() String
        +getCost() double
    }

    class CoffeeDecorator {
        <<abstract>>
        -coffee: Coffee
        +getDescription() String
        +getCost() double
    }

    class MilkDecorator {
        +getDescription() String
        +getCost() double
    }

    class SugarDecorator {
        +getDescription() String
        +getCost() double
    }

    Coffee <|-- BasicCoffee
    Coffee <|-- CoffeeDecorator
    CoffeeDecorator <|-- MilkDecorator
    CoffeeDecorator <|-- SugarDecorator
    CoffeeDecorator o-- Coffee : "has a"
