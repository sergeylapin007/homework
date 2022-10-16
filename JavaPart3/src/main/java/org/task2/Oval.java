package org.task2;

public class Oval extends Round{
    // length of the major semiaxis of the ellipse
    double b;

    Oval(double x, double y){
        this.r = x;
        this.b = y;
    }

    @Override
    public double getSquare() {
        double result = r * b * p;
        return result;
    }
}
