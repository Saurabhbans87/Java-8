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
# Functional iInterfaces
A functional interface is an interface with a single abstract method (SAM), often referred to as a SAM interface. 
## Example of a Simple Functional Interface:
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void display(String message);
}
```
With this interface, we can create a lambda expression that provides an implementation for the display method:
```java
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface func = message -> System.out.println("Message: " + message);
        func.display("Hello, Functional Interface!");
    }
}
```
# Rules for Functional Interfaces
1. Single Abstract Method: A functional interface can have only one abstract method.
2. Object Class Methods: It can have other methods if they are default, static, or methods from Object (like toString, equals, hashCode), as they don’t count as abstract methods.
3. @FunctionalInterface Annotation: This is optional but highly recommended, as it helps prevent accidental addition of extra abstract methods.

## Common Functional Interfaces in Java 8 (java.util.function Package)
Java 8 provides several built-in functional interfaces in the java.util.function package. Here are some of the most commonly used ones:
### Predicate<T>
Represents a condition (boolean-valued function) that takes one argument.

* Method: boolean test(T t)
* Usage: Often used for filtering in collections.
```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4));  // true
        System.out.println(isEven.test(3));  // false
    }
}
```
### Consumer<T>
Represents an operation that takes a single argument and returns no result.

* Method: void accept(T t)
* Usage: Commonly used in scenarios where an action is performed, such as printing or updating a value.
```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, Consumer!");  // Output: Message: Hello, Consumer!
    }
}
```
### Function<T, R>
Represents a function that takes one argument and produces a result.

* Method: R apply(T t)
* Usage: Used for transforming data.
```java
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthCalculator = str -> str.length();
        System.out.println(lengthCalculator.apply("Hello"));  // Output: 5
    }
}
```
### Supplier<T>
Represents a supplier of results with no input argument.

* Method: T get()
* Usage: Often used to delay the creation of expensive objects or to generate new values.
```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());  // Output: Random value like 0.453432
    }
}
```
### BiFunction<T, U, R>
Represents a function that takes two arguments and produces a result.

* Method: R apply(T t, U u)
* Usage: Useful when two parameters are needed for computation.
```java
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5, 3));  // Output: 15
    }
}
```
### UnaryOperator<T>
A specialization of Function that takes a single parameter and returns a result of the same type.

* Method: T apply(T t)
* Usage: Often used for transformations that don't change the type.
```java
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));  // Output: 25
    }
}
```
### BinaryOperator<T>
A specialization of BiFunction for cases where both parameters and the return type are the same.

* Method: T apply(T t1, T t2)
* Usage: Often used in reduction operations like summing or comparing two values of the same type.
```java
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(5, 3));  // Output: 8
    }
}
```
### BiConsumer<T, U>
Represents an operation that takes two arguments and returns no result.

* Method: void accept(T t, U u)
* Usage: Useful when performing actions involving two objects, like updating or printing.
```java
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printMessageWithCount = (message, count) ->
            System.out.println(message + " printed " + count + " times.");

        printMessageWithCount.accept("Hello", 3);  // Output: Hello printed 3 times.
    }
}
```
# Method References
Method references are a shorthand representation lambda expressions.
## Types of Method References
There are four main types of method references:

* Reference to a static method — ClassName::staticMethodName
* Reference to an instance method of a particular object — instance::instanceMethodName
* Reference to an instance method of an arbitrary object of a particular type — ClassName::instanceMethodName
* Reference to a constructor — ClassName::new
### Reference to a Static Method
Let’s say we have a utility class with a static method for printing a string:
```java
class Utility {
    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}

public class StaticMethodReference {
    public static void main(String[] args) {
        Consumer<String> consumer = Utility::printMessage;
        consumer.accept("Hello, Static Method Reference!");
    }
}
```
### Reference to an Instance Method of a Particular Object
This type is used when you want to refer to an instance method of a specific, known object. It replaces a lambda expression where the lambda’s body calls an instance method on that particular object.
```java
public class InstanceMethodReference {
    public void print(String message) {
        System.out.println("Instance message: " + message);
    }

    public static void main(String[] args) {
        InstanceMethodReference instance = new InstanceMethodReference();
        Consumer<String> consumer = instance::print;
        consumer.accept("Hello, Instance Method Reference!");
    }
}
```
### Reference to an Instance Method of an Arbitrary Object of a Particular Type
This type of method reference is used when we have a lambda expression that calls an instance method on the parameter passed to it. This is useful in scenarios where you want to call a method on each element of a stream.
```java
import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference to call `toUpperCase` on each element
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
```
### Reference to a Constructor
This type of method reference is used when you want to refer to a constructor, often for creating new instances of a class. It replaces a lambda expression where the lambda’s body calls a constructor.
```java
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
        System.out.println(person);  // Output: Person{name='null'}
    }
}
```






