/**
 * Create by saurabh
 * Date: 15/01/24
 * Project Name: Java-8
 */
package spliterator;

import java.util.Arrays;
import java.util.List;

public class Spliterator {
    public static void main(String[] args) {
        String[] city = {"Noida","Gorakhpur","Lucknow","Delhi","Bangalore"};
        List<String> list = Arrays.asList(city);

        java.util.Spliterator<String> spliterator = list.spliterator();
        System.out.println("Iterating spliterator using forEachRemaining");
        spliterator.forEachRemaining(System.out::println);

        System.out.println("Iterating spliterator using tryAdvance");
        java.util.Spliterator<String> spliterator1 = list.spliterator();
        spliterator1.tryAdvance(System.out::println);

        System.out.println("Iterating spliterator using tryAdvance");
        java.util.Spliterator<String> spliterator2 = list.spliterator();
        while (spliterator2.tryAdvance(System.out::println));

        System.out.println("Iterating spliterator using trySplit");
        java.util.Spliterator<String> spliterator3 = list.spliterator();
        java.util.Spliterator<String> splitSpliterator = spliterator3.trySplit();
        System.out.println("Original spliterator");
        spliterator3.forEachRemaining(System.out::println);
        System.out.println("Split spliterator");
        splitSpliterator.forEachRemaining(System.out::println);

        System.out.println("Spliterator estimateSize");
        java.util.Spliterator<String> spliterator4 = list.spliterator();
        long estimateSize = spliterator4.estimateSize();
        System.out.println(estimateSize);
        spliterator4.tryAdvance(System.out::println);
        long estimateSize1 = spliterator4.estimateSize();
        System.out.println(estimateSize1);

    }
}
