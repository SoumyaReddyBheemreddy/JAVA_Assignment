package com.assignment.assignment7.factory;

public class Tricycle implements Cycle{
    @Override
    public void numberOfWheels() {
        System.out.println("I have 3 wheel");
    }

    @Override
    public void price() {
        System.out.println("Price of tricycle is "+ 600);
    }
}
