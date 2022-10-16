package org.task2;

public abstract class Round implements Shape {
    final double p = 3.1415926535;
    double r;

    @Override
    public double getSquare(){
        double result = p * (r * r);
        return result;
    }
}
