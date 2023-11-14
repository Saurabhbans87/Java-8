/**
 * Create by saurabh
 * Date: 14/11/23
 * Project Name: Java-8
 */
package stream.create;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        String newLine = System.lineSeparator();
        Stream<Employee> employeeStream = Stream.empty();
        System.out.println(employeeStream.count());

        Stream<Object> objectStream = Stream.empty();
        System.out.println(objectStream.count());

        System.out.println(newLine);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerStream.filter(integer -> integer%2==0).forEach(System.out::println);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Harry","Singh"));
        employeeList.add(new Employee("Gurmeet","Kaur"));
        employeeList.add(new Employee("Raju","Gupta"));
        employeeList.add(new Employee("Vikram","Singh"));
        employeeList.add(new Employee("Vivek","Pandit"));
        employeeList.add(new Employee("Ranjeet","Mishra"));
        employeeList.stream().forEach(System.out::println);
        System.out.println("***********************************************************");
        List<Employee> employees = employeeList.stream().limit(2).collect(Collectors.toList());
        System.out.println(employees);
        List<Employee> employees1 = employeeList.stream().skip(2).collect(Collectors.toList());
        System.out.println("***********************************************************");
        System.out.println(employees1);
        long count = employeeList.stream().count();
        System.out.println("***********************************************************");
        System.out.println(count);
        List<Employee> employees2 = employeeList.stream().filter(employee -> employee.firstName.length() > 5).collect(Collectors.toList());
        System.out.println("***********************************************************");
        System.out.println(employees2);
    }
}
