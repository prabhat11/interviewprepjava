package com.prabhat.enums;

// Example: Use enums instead of int constants (Effective Java Practice)
//Ennum inteview questions
// This example demonstrates how to use enums to represent days of the week.
// Enums provide type safety and better readability compared to using int constants.
// Using enums allows for a more structured and maintainable way to handle fixed sets of constants.
// Enums can also be used in switch statements, making the code cleaner and less error-prone.
// The Day enum represents the days of the week.
// This code is a simple demonstration of using enums in Java.
// It is not meant to be a complete or production-ready implementation.
// It is meant to illustrate the concept of enums in Java.
// This code is for educational purposes only.
// Enums can also have methods, fields, and constructors, making them powerful for representing fixed sets of constants with additional behavior.
// Enums can also have methods, fields, and constructors, making them powerful for representing fixed sets of constants with additional behavior.
// Enums can also be used in switch statements, making the code cleaner and less error-prone.
// Enums can also be used in switch statements, making the code cleaner and less error-prone.
//Give interview questions on enums : 
// 1. What are enums in Java?
// 2. How do enums differ from regular classes?
// 3. Can you explain the benefits of using enums over constant integers?
// 4. How do you define an enum in Java?
// 5. Can you use enums in switch statements? Provide an example.
// 6. How can you add methods to an enum in Java?
// 7. Can enums implement interfaces? If so, how?
// 8. What is the purpose of the `values()` method in enums?
// 9. How can you iterate over all constants of an enum?
// 10. Can you explain the concept of enum constructors and how they work?
// 11. How do you handle enum constants with parameters?
// 12. What is the difference between `enum` and `@interface` in Java?
// 13. Can you explain the `ordinal()` method in enums?
// 14. How do you compare enum constants for equality?
// 15. Can you use enums in collections like `List` or `Map`? Provide an example.
// 16. How do you handle serialization and deserialization of enums?
// 17. Can you explain the concept of enum singleton and how it works?
// 18. How do you handle enum constants with different behaviors?
// 19. Can you provide an example of using enums in a real-world application?
// 20. What are some common pitfalls or best practices when using enums in Java?
// 21. How do you handle enum constants with different properties or attributes?
// 22. Can you explain the concept of enum inheritance and how it works?
// 23. How do you handle enum constants with different methods or behaviors?
// 24. Can you explain the concept of enum switch expressions introduced in Java 12?
// 25. How do you handle enum constants with different states or conditions?
// 26. Can you explain the concept of enum type safety and how it prevents errors?
// 27. How do you handle enum constants with different representations or formats?
// 28. Can you explain the concept of enum reflection and how it works?
// 29. How do you handle enum constants with different validation rules or constraints?
// 30. Can you explain the concept of enum serialization and how it works in Java?
// 31. How do you handle enum constants with different localization or internationalization requirements?
// 32. Can you explain the concept of enum performance and how it affects application efficiency?
//
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of work week");
                break;
            case FRIDAY:
                System.out.println("End of work week");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek");
        }
    }
}
