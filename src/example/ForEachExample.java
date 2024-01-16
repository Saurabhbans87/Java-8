/**
 * Create by saurabh
 * Date: 16/01/24
 * Project Name: Java-8
 */
package example;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("Noida");
        cityList.add("Delhi");
        cityList.add("Gurgaon");
        cityList.add("Gorakhpur");
        cityList.add("Bangalore");
        System.out.println("************Using forEach with a Consumer************");
        cityList.forEach(str->System.out.println(str));
        System.out.println("************Using forEach on a stream************");
        cityList.stream().forEach(str -> System.out.println(str));
        System.out.println("************Shorter syntax using method reference************");
        cityList.stream().forEach(System.out::println);

    }
}
