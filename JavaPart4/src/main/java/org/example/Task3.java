package org.example;

//3. Replace the keys and values in the Map with places
//   Problem: Write a method that takes a Map<K, V> and returns a Map where the keys and values are replaced by places.
//   Since the records may not be unique, the value type in Map will no longer be K, but Collection<K>:Map<V, Collection<K>>

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer,Integer> test = new HashMap<>();
        test.put(1,2);
        test.put(2,12);
        test.put(3,42);
        test.put(4,31);

        System.out.println(replace(test));
    }

    public static <T,G> Map replace (Map<T,G> input){
        Map<Integer, String> result = new HashMap<>();
        List<T> keys = new LinkedList<>(input.keySet());
        List<G> values = new LinkedList<>(input.values());
        List<String> replacedMap = new LinkedList<>();

        for (int i = 0; i < input.size(); i++){
            replacedMap.add(values.get(i) + "," + keys.get(i));
            result.put(i,replacedMap.get(i));
        }

        return result;
    }
}
