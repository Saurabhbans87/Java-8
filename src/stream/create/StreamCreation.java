/**
 * Create by saurabh
 * Date: 14/11/23
 * Project Name: Java-8
 */
package stream.create;

import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        String newLine = System.lineSeparator();
        Stream<Employee> employeeStream = Stream.empty();
        System.out.println(employeeStream.count());

        Stream<Object> objectStream = Stream.empty();
        System.out.println(objectStream.count());

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(integerStream.count()+newLine);
    }
}
