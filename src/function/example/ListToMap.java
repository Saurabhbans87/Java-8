/**
 * Create by saurabh
 * Date: 12/11/23
 * Project Name: Java-8
 */
package function.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ListToMap {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Bangalore","Noida","Delhi","Gorakhpur");
        Function<String,Integer> function = s -> s.length();
        convertListToMap(stringList,function);
    }

    private static void convertListToMap(List<String> stringList, Function<String, Integer> function) {
        Map<String,Integer> map = new HashMap<>();
        for (String str:stringList) {
            map.put(str, function.apply(str));
        }
        System.out.println(map);
    }
}
