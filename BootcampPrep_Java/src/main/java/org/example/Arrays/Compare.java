package org.example.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Compare {
    public static boolean compareObjects(Map<String, String> obj1, Map<String, String> obj2) {
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
    }
}
