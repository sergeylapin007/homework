package org.example;

import java.security.Key;
import java.util.*;

//Write a method that accepts as input a collection of objects V (Generic), which contains duplicate objects, and returns a collection V without duplicates.
public class Task2 {
    public static void main(String[] args) {
        List<Integer> test = new LinkedList<>();
        test.add(16);
        test.add(16);
        test.add(15);
        test.add(16);

        System.out.println(deleteDuplicates(test));
    }

    public static <T extends Collection> HashSet<T> deleteDuplicates (T input) {
        return new HashSet<T>(input);
    }
}



