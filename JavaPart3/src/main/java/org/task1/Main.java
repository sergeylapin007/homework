package org.task1;

public  class  Main {

   public static void main (String[] args){
       //Create a several vectors
       Vector ab = new Vector(1,4,5);
       Vector cd = new Vector(-1,18,-9);

       //Find the length for each vector
       System.out.println("The first vector length: " + ab.getLength());
       System.out.println("The second vector length: " + cd.getLength());

       //Find the dot product (scalar multiplication)
       System.out.println("Dot product: " + Vector.getDotProduct(ab,cd));

       //Create an array with random vectors
       Vector[] arr = Vector.createVectors();
       Vector first = arr[0];
       Vector second = arr[1];
       System.out.println("Coordinates of the first vector: x=" + first.x + " y=" + first.y + " z=" + first.z);
       System.out.println("Coordinates of the first vector: x=" + second.x + " y=" + second.y + " z=" + second.z);

       //Find the dot product by using overloaded method
       System.out.println("Dot product of random vectors: " + Vector.getDotProduct(arr));

    }
}