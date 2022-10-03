package org.example;

public class Rectangle {
    double height;
    double width;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(double height, double width){
        double result = height * width;
        return result;
    }
}
