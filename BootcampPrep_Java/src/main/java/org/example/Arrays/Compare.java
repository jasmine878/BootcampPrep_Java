package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Compare {
    public static <K, V> boolean compareObjects(Map<K, V> obj1, Map<K, V> obj2) {
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        Map<String, String> obj1 = new HashMap<>();
        Map<String, String> obj2 = new HashMap<>();
        obj1.put("name", "nick");
        obj2.put("name", "nick");

        System.out.println(compareObjects(obj1, obj2));         //expect true

        obj2.put("name", "zeke");
        System.out.println(compareObjects(obj1, obj2));         //expect false

        //THESE HASHMAPS ARE IMMUTABLE DUE TO MAP.OF() METHOD
        Map<String, Integer> obj3 = Map.of("a", 1);
        Map<String, Integer> obj4 = Map.of("a", 1);
        Map<String, Integer> obj5 = Map.of("b", 1);
        Map<String, Integer> obj6 = Map.of("a", 2);

        System.out.println(compareObjects(obj3, obj4));         //expect true
        System.out.println(compareObjects(obj3, obj5));         //expect false
        System.out.println(compareObjects(obj3, obj5));         //expect false
    }
}
