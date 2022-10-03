package org.example;

public class Computer {
    String brand;
    float screenSize;
    int numberOfCores;
    String type;

    Computer(String brand, float screenSize){
        this.brand = brand;
        this.screenSize = screenSize;
    }

    Computer(String brand, float screenSize, int numberOfCores, String type){
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
        this.type = type;
    }
}
