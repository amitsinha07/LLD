# Observer Pattern

The Observer Pattern establishes a one-to-many dependency between objects so that when one object (the Subject) changes state, all its dependents (Observers) are notified and updated automatically.

## Mermaid Diagram

```mermaid
classDiagram
    direction LR

    class Subject {
        +attach(observer: Observer)
        +detach(observer: Observer)
        +notifyObservers()
    }

    class Observer {
        <<interface>>
        +update(state: String)
    }

    class ConcreteSubject {
        -observers: List~Observer~
        -state: String
        +publishNews(news: String)
    }

    class ConcreteObserver {
        -name: String
        +update(state: String)
    }

    Subject <|-- ConcreteSubject
    Observer <|-- ConcreteObserver
    ConcreteSubject --> Observer : notifies
