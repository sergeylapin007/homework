package com.epam;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1: Write a Java program to print the sum of two numbers.
        int result = HometaskMethods.sumOfTwoNumbers(4,5);
        System.out.println("Task 1: " + result);

        //Task 2:	Write a Java program to print the result of the following operations:
        //Task 2.a: -5 + 8 * 6
        int result2a = HometaskMethods.calculation2a(-5,8,6);
        System.out.println("Task 2a: " + result2a);

        //Task 2.b: (55+9) % 9
        int result2b = HometaskMethods.calculation2b(55,9,9);
        System.out.println("Task 2b: " + result2b);

        //Task 2c: 20 + -3*5 / 8
        int result2c = HometaskMethods.calculation2c(20,-3,5,8);
        System.out.println("Task 2c: " + result2c);

        //Task 2d: 5 + 15 / 3 * 2 - 8 % 3
        int result2d = HometaskMethods.calculation2d(5, 15,3,2,8,3);
        System.out.println("Task 2d: " + result2d);

        //Task 3: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
        System.out.println("Task 3:");
        HometaskMethods.calculation3(125,24);

        //Task 4: Write a Java program to sum values of an array
        int [] arr4 = new int[]{5,6,7,12,-5,32,43};
        int result4 = HometaskMethods.sumOfArray(arr4);
        System.out.println("Task 4: " + result4);

        //Task 5: Write a Java program to find the duplicate values of an array of integer values
        int [] arr5 = new int[]{5,6,7,12,-5,32,43,6,12};
        ArrayList<Integer> result5 = HometaskMethods.findDuplicate(arr5);
        System.out.println("Task 5: " + result5);
    }
}