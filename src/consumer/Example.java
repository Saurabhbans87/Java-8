/**
 * Create by saurabh
 * Date: 12/11/23
 * Project Name: Java-8
 */
package consumer;

import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Noida");
        stringConsumer.accept("Bangalore");
    }
}
