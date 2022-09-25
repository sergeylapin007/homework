package com.epam;

import java.util.ArrayList;

public class HometaskMethods {
    public static int sumOfTwoNumbers (int first, int second){
        int result = first +second;
        return result;
    }

    public static int calculation2a (int a, int b, int c){
        int result = a + b * c;
        return  result;
    }

    public static int calculation2b (int a, int b, int c) {
        int result = (a + b) % c;
        return result;
    }

    public static int calculation2c (int a, int b, int c, int d){
        int result = a + b * c / d;
        return result;
    }

    public static int calculation2d (int a, int b, int c, int d, int e, int f){
        int result = a + b / c * d - e % f;
        return result;
    }

    public static void calculation3 (int a, int b){
        int resultOfSum = HometaskMethods.sum(a,b);
        int resultOfSubtraction = HometaskMethods.subtraction(a,b);
        int resultOfMultiplication = HometaskMethods.multiplication(a,b);
        int resultOfDividing = HometaskMethods.dividing(a,b);
        int remainderOfTwoNumbers = HometaskMethods.remainderOfTwoNumbers(a,b);

        System.out.println("Addition result: " + resultOfSum);
        System.out.println("Subtraction result: " + resultOfSubtraction);
        System.out.println("Multiplication result: " + resultOfMultiplication);
        System.out.println("Dividing result: " + resultOfDividing);
        System.out.println("Remainder of two numbers after dividing: " + remainderOfTwoNumbers);
    }

    private static int sum (int a, int b){
        int result = a + b;
        return result;
    }

    private static int subtraction (int a, int b){
        int result = a - b;
        return result;
    }

    private static int multiplication (int a, int b){
        int result = a * b;
        return result;
    }

    private static int dividing (int a, int b){
        int result = a / b;
        return result;
    }

    private static int remainderOfTwoNumbers (int a, int b){
        int result = a % b;
        return result;
    }

    public static int sumOfArray (int [] arr) {
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }

    public static ArrayList<Integer> findDuplicate (int [] arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j] && i != j && temp.indexOf(arr[i]) == -1){
                    temp.add(arr[i]);
                }
            }
        }

        return temp;
    }
}
