package org.example;


// Frequency dictionary of letters of the alphabet. Problem:
// Build a frequency dictionary of letters of the alphabet.
// Create a method that accepts text and returns a dictionary containing the character and its count.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        char [] inputChar = new char[inputString.length()];
        inputChar = inputString.toLowerCase().toCharArray();
        Arrays.sort(inputChar);

        Set<Character> setOfUniqueChar = new LinkedHashSet<>();
        for (char c : inputChar) {
            setOfUniqueChar.add(c);
        }
        setOfUniqueChar.remove(' ');

        Map<Character,Integer> dictionary = new LinkedHashMap<>();
        for (Character character : setOfUniqueChar) {
            dictionary.put(character, 0);
        }

        List<Integer> buffer = new LinkedList<>();
        List<Character> listOfUniqueChar = new ArrayList<>(setOfUniqueChar);

        for (int i = 0; i < dictionary.size(); i++){
            char letter = listOfUniqueChar.get(i);
            int counter = 0;
            while (Arrays.binarySearch(inputChar, letter) >= 0){
                int index = Arrays.binarySearch(inputChar, letter);
                buffer.add(counter++);
                inputChar[index] = ' ';
                Arrays.sort(inputChar);
            }
            dictionary.put(letter,buffer.size());
            buffer.clear();
        }

        System.out.println(dictionary);
    }
}
