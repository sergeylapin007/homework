package com.epam.rd.autotasks.triangle;


public class Main {
    public static void main(String[] args) {
        {
            double area = new Triangle(new Point(-1, -1), new Point(1, 1), new Point(3, 3)).area();
            System.out.println(area);
        }
        {
            Point centroid = new Triangle(new Point(-1, -1), new Point(1, 1), new Point(3, 3)).centroid();

            System.out.println(centroid.getX());
            System.out.println(centroid.getY());
        }
    }
}
