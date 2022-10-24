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
            double square = 0.5 * (xA * (yB - yC) - xB * (yA - yC) + xC * (yA - yB));
            return Math.abs(square);
    }

    public Point centroid() {
//            if (area() == 0){
//                throw new IllegalArgumentException();
        Point centroid = null;
            try
            {
                double temp1 = (xA + xB + xC) / 3;
                double temp2 = (yA + yB + yC) / 3;
                centroid = new Point(temp1,temp2);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            if (area() == 0.0){
                throw new IllegalArgumentException();
            }
        return centroid;
    }

    public static void main (String[] args) {
        Triangle test = new Triangle(new Point(1, 3), new Point(2, 6), new Point(3, 9));
        double result = test.area();
        Point centroid = test.centroid();
        System.out.println(result);
        System.out.println("x= " + centroid.getX() + "," + "y= " + centroid.getY());

    };
}