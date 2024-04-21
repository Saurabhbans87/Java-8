/**
 * Create by saurabh
 * Date: 21/04/24
 * Project Name: Java-8
 */
package stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StramExample {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.empty();
        System.out.println(integerStream.count());

        Stream<Integer> integerStream1 = Stream.of(2,3,4,5);
        integerStream1.sorted().forEach(System.out::print);

        List<String> stringList = new ArrayList<>();
        stringList.add("Delhi");
        stringList.add("Mumbai");
        stringList.add("Chennai");
        stringList.add("Noida");
        stringList.stream().filter((x)->x.length()>5).forEach(System.out::println);

        List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Noida");
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Noida");
        cityList.stream().distinct().forEach(System.out::println);
    }
}
