package org.task2;

public class Rectangle extends Rectangular {
    double b;

    Rectangle(double x, double y){
        this.a = x;
        this.b = y;
    }

    @Override
    public double getSquare() {
        double result = a * b;
        return result;
    }
}
