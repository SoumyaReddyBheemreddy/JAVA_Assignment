package com.assignment.assignment7.factory;

public class Factory {
    public Unicycle getCycleUnicycle(){
        return new Unicycle();
    }
    public  Bicycle getCycleBiCycle(){
        return new Bicycle();
    }
    public Tricycle getCycleTricycle(){
        return new Tricycle();
    }

}
