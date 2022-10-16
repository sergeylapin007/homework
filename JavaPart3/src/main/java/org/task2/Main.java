package org.task2;

public class Main {
    public static void main (String[] arr){
        Circle circle = new Circle(5);
        Oval oval = new Oval(5,10);
        Square quadrate = new Square(20);
        Rectangle rectangle = new Rectangle(10,20);

        System.out.println("The square of the circle: " + circle.getSquare());
        System.out.println("The square of the oval: " + oval.getSquare());
        System.out.println("The square of the quadrate: " + quadrate.getSquare());
        System.out.println("The square of the rectangle: " + rectangle.getSquare());
    }
}
