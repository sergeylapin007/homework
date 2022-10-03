package org.example;

public class HomeworkMethods {
    public static String main (String string1, String string2){
        String first = string1;
        String second = string2;

        //Remove "P" and "p" from the first sentence
        String temp1 = first.replaceAll("P","");
        String firstSentenceWithoutP = temp1.replaceAll("p","");

        //Remove "P" and "p" from the second sentence
        String temp2 = second.replaceAll("P","");
        String secondSentenceWithoutP = temp2.replaceAll("p","");

        String result = firstSentenceWithoutP + secondSentenceWithoutP;

        return result;
    }
}
