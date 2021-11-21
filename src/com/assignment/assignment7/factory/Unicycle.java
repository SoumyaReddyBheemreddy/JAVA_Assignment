package com.assignment.assignment7.factory;

class Unicycle implements Cycle{

    @Override
    public void numberOfWheels() {
        System.out.println("I have 1 wheel");
    }

    @Override
    public void price() {
        System.out.println("Price of Unicycle is "+200);
    }
}