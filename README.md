# Java-8
Java 8 introduced a lot of powerful new features that revolutionized the way Java programs are written. I'll guide you through the basic to advanced concepts in Java 8, along with practical examples. Here’s an outline of the topics we’ll cover:

* Lambda Expressions
* Functional Interfaces
* Method References
* Stream API
* Optional Class
* Default and Static Methods in Interfaces
* New Date and Time API
* Collectors in Stream API
* Parallel Streams

# Lambda Expressions
Lambda expressions are a core feature of Java 8, enabling you to create anonymous methods with a concise syntax. They’re commonly used with functional interfaces, making code more readable and reducing boilerplate.
> They’re primarily used to implement functional interfaces in a concise way.

## Basic Syntax:
```java
(parameters) -> expression
or
(parameters) -> { statements; }
```
# Basic Structure of Lambda Expressions
### Single Parameter
When there’s a single parameter, parentheses around the parameter are optional.
```java
x -> x * x
```
### Multiple Parameters
For multiple parameters, you must enclose them in parentheses.
```java
(x, y) -> x + y
```
### No Parameters
For no-parameter lambda expressions, use empty parentheses.
```java
() -> System.out.println("Hello, World!")
```
### Example with Multiple Statements
```java
(x, y) -> {
    int sum = x + y;
    int square = sum * sum;
    return square;
}
```

