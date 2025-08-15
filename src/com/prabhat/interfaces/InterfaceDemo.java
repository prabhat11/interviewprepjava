package com.prabhat.interfaces;

// Example: Prefer interfaces over abstract classes (Effective Java Practice)
//Interviw Prep Java - Interfaces
//Interview Questions on Interfaces in Java :
// 1. What is an interface in Java?
// 2. How do you define an interface in Java?
// 3. What are the key differences between an interface and an abstract class?
// 4. Can an interface extend another interface? If so, how?
// 5. How do you implement an interface in a class?
// 6. Can a class implement multiple interfaces? Provide an example.
// 7. What is the purpose of the `default` keyword in interfaces?
// 8. How do you define a method in an interface with a default implementation?
// 9. Can you explain the concept of functional interfaces in Java?
// 10. How do you create a functional interface in Java?
// 11. What is the purpose of the `@FunctionalInterface` annotation?
// 12. Can you provide an example of using a functional interface with a lambda expression?
// 13. How do you handle method conflicts when a class implements multiple interfaces with the same method signature?
// 14. Can you explain the concept of marker interfaces in Java?
// 15. How do you use interfaces to achieve polymorphism in Java?
// 16. Can you explain the concept of multiple inheritance in Java interfaces?
// 17. How do you handle method overloading in interfaces?
// 18. Can you explain the concept of static methods in interfaces introduced in Java 8?
// 19. How do you define a static method in an interface?
// 20. Can you explain the concept of private methods in interfaces introduced in Java 9?
// 21. How do you define a private method in an interface?
// 22. Can you explain the concept of nested interfaces in Java?
// 23. How do you define a nested interface in a class?
// 24. Can you explain the concept of interface segregation principle in software design?
// 25. How do you apply the interface segregation principle in Java?
// 26. Can you explain the concept of dependency inversion principle in software design?
// 27. How do you apply the dependency inversion principle using interfaces in Java?
// 28. Can you explain the concept of interface-based design in software development?
// 29. How do you use interfaces to achieve loose coupling in Java?
// 30. Can you provide an example of using interfaces to define a contract for a service?
// 31. How do you handle versioning of interfaces in Java?
// 32. Can you explain the concept of interface evolution in Java?
// 33. How do you handle backward compatibility when modifying an interface?
// 34. Can you explain the concept of interface documentation and its importance?
// 35. How do you document an interface in Java?
// 36. Can you explain the concept of interface testing and its best practices?
// 37. How do you test an interface in Java?
// 38. Can you explain the concept of interface design patterns in software development?
// 39. How do you use interfaces to implement design patterns like Strategy, Observer, or Factory?
// 40. Can you provide an example of using interfaces in a real-world application?
// 41. How do you handle interface conflicts when integrating third-party libraries?
// 42. Can you explain the concept of interface refactoring and its best practices?
// 43. How do you refactor an interface to improve its design or usability?
// 44. Can you explain the concept of interface performance and its impact on application efficiency?
// 45. How do you handle performance considerations when designing interfaces in Java?
// 46. Can you explain the concept of interface security and its best practices?
// 47. How do you handle security concerns when designing interfaces in Java?
// 48. Can you explain the concept of interface scalability and its importance in software development?
// 49. How do you design interfaces to ensure scalability in Java applications?
// 50. Can you explain the concept of interface maintainability and its best practices?
// 51. How do you design interfaces to ensure maintainability in Java applications?
// 52. Can you explain the concept of interface usability and its importance in software design?
// 53. How do you design interfaces to ensure usability for developers and users?
// 54. Can you explain the concept of interface extensibility and its importance in software design?
// 55. How do you design interfaces to ensure extensibility for future requirements?
// 56. Can you explain the concept of interface interoperability and its importance in software development?
// 57. How do you design interfaces to ensure interoperability with other systems or languages?
// 58. Can you explain the concept of interface abstraction and its importance in software design?
// 59. How do you design interfaces to achieve abstraction in Java applications?
// 60. Can you explain the concept of interface encapsulation and its importance in software design?
// This code demonstrates the use of interfaces in Java.
// It defines a Shape interface with methods for calculating area and perimeter.

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private final double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Circle area: " + circle.area() + ", perimeter: " + circle.perimeter());
        System.out.println("Rectangle area: " + rectangle.area() + ", perimeter: " + rectangle.perimeter());
    }
}
