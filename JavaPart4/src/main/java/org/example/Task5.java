package org.example;

//5. Conversion of two collections into Map.
//   Problem: Write a method that accepts two arrays/lists of elements of type K, V (Generic) with different number of elements and returns a sorted Map<K, V>.
//   Option 1. If the array K > V - then write in the value null, if the array K < V - do not process the extra values
//   Option 2. If the array K > V - intercept the error and display the message "Value is not enough for map", if the array K < V - intercept the error and display the message "Key is not enough for map"

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> keys = new LinkedList<>();
        List<String> values = new LinkedList<>();

        keys.add(1);
        keys.add(11);
        keys.add(3);
        keys.add(12);
        keys.add(16);
        keys.add(8);
        keys.add(2);


        values.add("String1");
        values.add("String2");
        values.add("String3");
        values.add("String4");
        values.add("String5");


        System.out.println(createSortedMap(keys,values));
    }

    public static <K, V> Map<K, V> createSortedMap (List <? extends K> a, List <? extends V> b) {
        Set<K> sortedKeys = new TreeSet<>(a);
        LinkedList<K> keys = new LinkedList<>(sortedKeys);
        LinkedList<V> values = new LinkedList<>(b);
        Map<K, V> result = new TreeMap<>();

        int numberOfPairs = Math.min(keys.size(), values.size());

        for (int i = 0; i < numberOfPairs; i++) {
            result.put(keys.get(i), values.get(i));
        }

        if (keys.size() > values.size()) {
            for (int i = numberOfPairs; i < keys.size(); i++) {
                result.put(keys.get(i), null);
            }
        }
        return result;
    }
}
