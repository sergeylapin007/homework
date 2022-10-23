package org.example;

//4. Placing orders.
//   Problem: Create a String array with orders (with duplicate orders) that came to the online store.
//   Create two types of collections, HashSet and TreeSet, to which we need to add our orders. Display a list of HashSet and TreeSet separately from each other.
//   Make at least 5 orders.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        String [] orders = new String[] {"Order№1", "Order№2", "Order№3", "Order№4", "Order№5", "Order№1", "Order№1", "Order№1", "Order№1", "Order№1"};
        Set<String> hashSetOfOrders = new HashSet<>(Arrays.asList(orders));
        Set<String> treeSetOfOrders = new TreeSet<>(Arrays.asList(orders));

        System.out.println(hashSetOfOrders);
        System.out.println(treeSetOfOrders);

    }

}
