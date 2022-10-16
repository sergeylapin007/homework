package org.task1;

public class Vector {
    double x;
    double y;
    double z;

    Vector(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    double getLength(){
        double result = Math.abs(Math.sqrt(x * x + y * y + z * z));
        return result;
    }

    static double getDotProduct(Vector a, Vector b){
        double result = a.x * b.x + a.y * b.y + a.z * b.z;
        return result;
    }

    static double getDotProduct(Vector[] arr){
        Vector first = arr[0];
        Vector second = arr[1];
        double result = first.x * second.x + first.y * second.y + first.z * second.z;
        return result;
    }

    static Vector [] createVectors () {
        double a = Math.random() * 101;
        double b = Math.random() * 101;
        double c = Math.random() * 101;
        double d = Math.random() * 101;
        double e = Math.random() * 101;
        double f = Math.random() * 101;
        Vector firstVector = new Vector(a,b,c);
        Vector secondVector = new Vector(d,e,f);
        Vector [] result = new Vector[2];
        result[0] = firstVector;
        result[1] = secondVector;
        return result;
    }
}
