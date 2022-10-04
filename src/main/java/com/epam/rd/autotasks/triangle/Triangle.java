package com.epam.rd.autotasks.triangle;

class Triangle {

    Point first;
    Point second;
    Point third;

    double xA;
    double yA;
    double xB;
    double yB;
    double xC;
    double yC;

    public Triangle(Point a, Point b, Point c) {
         this.first = a;
         this.second = b;
         this.third = c;
         this.xA = first.getX();
         this.yA = first.getY();
         this.xB = second.getX();
         this.yB = second.getY();
         this.xC = third.getX();
         this.yC = third.getY();
    }

    public double area() {
        double square = 0.5 * (xA * (yB - yC) - xB * (yA - yC) + xC *(yA - yB));
        return Math.abs(square);
    }

    public Point centroid(){
        double temp1 = (xA + xB + xC) / 3;
        double temp2 = (yA + yB + yC) / 3;
        Point centroid = new Point(temp1,temp2);
        return centroid;
    }

}