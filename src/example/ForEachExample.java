/**
 * Create by saurabh
 * Date: 16/01/24
 * Project Name: Java-8
 */
package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.println("************Iterate a Map************");
        Map<Integer,String> stringMap = new HashMap<>();
        stringMap.put(1,"IIT");
        stringMap.put(2,"IIT");
        stringMap.put(3,"NIT");

        stringMap.forEach((rank,collegeName) -> System.out.println(rank +"--" +collegeName));
        System.out.println("************Iterate a Map with college name************");
        stringMap.forEach((rank,collgeName) -> {
            if(collgeName == "NIT"){
                System.out.println(rank +" "+collgeName);
            }
        });
        System.out.println("************Iterate a Map with rank************");
        stringMap.forEach((rank,collegeName) -> {
            if(rank == 1){
                System.out.println(rank + " "+collegeName);
            }
        });

    }
}
