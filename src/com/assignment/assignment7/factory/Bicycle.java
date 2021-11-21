package com.assignment.assignment7.factory;

class Bicycle implements Cycle{

    @Override
    public void numberOfWheels() {
        System.out.println("I have 2 wheel");
    }

    @Override
    public void price() {
        System.out.println("Price of Bicycle is "+400);
    }
}