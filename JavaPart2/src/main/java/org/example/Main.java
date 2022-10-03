package org.example;

public class Main {
    public static void main(String[] args) {
        //Task 1.	Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
        String first = "PHP Exercises and ";
        String second = "Python Exercises";

        String result = HomeworkMethods.main(first,second);
        System.out.println(result);

        //Task 2. Design such Java class with name Computer and such properties as: brand, screen size, number of cores, type.
        Computer comp1 = new Computer("HP", 13.3f,4,"laptop");
        Computer comp2 = new Computer("HP", 24.5f);

        /*Task 3.
        What's wrong with the following program? Fix the program called SomethingIsWrong.
        public class SomethingIsWrong {
            public static void main(String[] args) {
                Rectangle myRect;
                myRect.width = 40;
                myRect.height = 50;
                System.out.println("myRect's area is " + myRect.area());
            }
        }
        */

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(50);
        rectangle.setWidth(40);
        System.out.println("myRect's area is " + rectangle.area(rectangle.height,rectangle.width));

        /*
        Task 4
        Given the following class, called NumberHolder, write some code that creates an instance of the class, initializes its two member variables, and then displays the value of each member variable.
        public class NumberHolder {
             public int anInt;
             public float aFloat;
        }
         */

        NumberHolder holder  = new NumberHolder();
        holder.setAnInt(5);
        holder.setAFloat(15.5f);
        System.out.println("My first number is " + holder.anInt);
        System.out.println("My second number is " + holder.aFloat);
    }
}