/**
 * Create by saurabh
 * Date: 03/04/24
 * Project Name: Java-8
 */
package example;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableExample {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap = new TreeMap();
        navigableMap.put(1,"One");
        navigableMap.put(2,"Two");
        navigableMap.put(3,"Three");
        navigableMap.put(4,"Four");
        navigableMap.put(5,"Five");
        navigableMap.put(6,"Six");
        navigableMap.put(7,"Seven");
        navigableMap.put(8,"Eight");
        navigableMap.put(9,"Nine");

        System.out.println("descendingMap" + navigableMap.descendingMap());

        System.out.println("descendingKeyMap" + navigableMap.descendingKeySet());

        System.out.println("ceilingEntry" + navigableMap.ceilingEntry(3));
        System.out.println("ceilingKey" + navigableMap.ceilingKey(4));

        System.out.println("floorEntry" + navigableMap.floorEntry(3));
        System.out.println("floorKey" + navigableMap.floorKey(4));

        System.out.println("higherEntry" + navigableMap.higherEntry(3));
        System.out.println("higherKey" + navigableMap.higherKey(4));

        System.out.println("lowerEntry" + navigableMap.lowerEntry(3));
        System.out.println("lowerKey" + navigableMap.lowerKey(4));

        System.out.println("firstEntry" + navigableMap.firstEntry());
        System.out.println("lastEntry" + navigableMap.lastEntry());

        System.out.println("pollFirstEntry" + navigableMap.pollFirstEntry());
        System.out.println("pollLastEntry" + navigableMap.pollLastEntry());

    }
}
