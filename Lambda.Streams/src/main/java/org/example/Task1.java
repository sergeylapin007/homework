package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] arrOfWords = input.split(" ");
        Set<String> listOfWords = new TreeSet<>(Arrays.asList(arrOfWords));

        Predicate<String> wordContainsO = (x) -> x.toLowerCase().contains("o");

        List<String> containWordsWithO = listOfWords
                .stream()
                .filter(wordContainsO)
                .toList();

        System.out.println(containWordsWithO);
    }
}