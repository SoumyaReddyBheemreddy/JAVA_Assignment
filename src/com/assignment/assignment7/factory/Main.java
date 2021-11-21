package com.assignment.assignment7.factory;


public class Main {
    public static void main(String[] args){
        Factory factory = new Factory();
        Unicycle unicycle = factory.getCycleUnicycle();
        Bicycle bicycle = factory.getCycleBiCycle();
        Tricycle tricycle = factory.getCycleTricycle();
        unicycle.numberOfWheels();
        unicycle.price();
        bicycle.numberOfWheels();
        bicycle.price();
        tricycle.numberOfWheels();
        tricycle.price();
    }
}
