package spliterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Creating a Spliterator from a List
        Spliterator<String> spliterator = fruits.spliterator();

        // Using forEachRemaining to iterate over the elements
        System.out.println("Using forEachRemaining:");
        spliterator.forEachRemaining(System.out::println);

        // Creating a new Spliterator for demonstration purposes
        Spliterator<String> spliterator2 = fruits.spliterator();

        // Using tryAdvance to iterate with a consumer
        System.out.println("\nUsing tryAdvance:");
        while (spliterator2.tryAdvance(System.out::println)) ;

        // Creating a new Spliterator for demonstration purposes
        Spliterator<String> spliterator3 = fruits.spliterator();

        // Using trySplit to split the Spliterator
        Spliterator<String> splitSpliterator = spliterator3.trySplit();

        System.out.println("\nOriginal Spliterator:");
        spliterator3.forEachRemaining(System.out::println);

        System.out.println("\nSplit Spliterator:");
        splitSpliterator.forEachRemaining(System.out::println);

        // Checking characteristics of the Spliterator
        System.out.println("\nCharacteristics:");
        System.out.println("ORDERED: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.ORDERED));
        System.out.println("DISTINCT: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.DISTINCT));
        System.out.println("SIZED: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.SIZED));
        System.out.println("SORTED: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.SORTED));
        System.out.println("CONCURRENT: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.CONCURRENT));
        System.out.println("IMMUTABLE: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.IMMUTABLE));
        System.out.println("NONNULL: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.NONNULL));
        System.out.println("SUBSIZED: " + spliterator.characteristics() + " = " + (spliterator.characteristics() & Spliterator.SUBSIZED));
    }
}
