package Assisted_Practice_Projects;

import java.util.*;

public class Practice_Project6 {
    public static void main(String[] args) {
        // HashMap Example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);
        System.out.println("HashMap Example: " + hashMap);

        // TreeMap Example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("John", 25);
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 35);
        System.out.println("TreeMap Example: " + treeMap);

        // LinkedHashMap Example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 35);
        System.out.println("LinkedHashMap Example: " + linkedHashMap);

        // Iterating over a Map
        System.out.println("Iterating over the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
