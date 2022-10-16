package org.task2;

public abstract class Rectangular implements Shape {
    double a;

    @Override
    public double getSquare() {
        double result = a * a;
        return result;
    }
}
