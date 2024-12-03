# Factory Pattern

The Factory Pattern provides a way to create objects without specifying their exact class, delegating the instantiation logic to a factory class.

## Mermaid Diagram

```mermaid
classDiagram
    direction LR

    class Shape {
        <<interface>>
        +draw() void
    }

    class Circle {
        +draw() void
    }

    class Rectangle {
        +draw() void
    }

    class Square {
        +draw() void
    }

    class ShapeFactory {
        +getShape(shapeType: String) Shape
    }

    Shape <|.. Circle
    Shape <|.. Rectangle
    Shape <|.. Square
    ShapeFactory --> Shape : creates
