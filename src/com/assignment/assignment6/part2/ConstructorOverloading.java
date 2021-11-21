package com.assignment.assignment6.part2;

public class ConstructorOverloading {
    ConstructorOverloading(){
        this(20);
    }
    ConstructorOverloading(int number){
        System.out.println("number is "+number);
    }
}
class Main{
    public static void main(String[] args){
        ConstructorOverloading constructorOverloading = new ConstructorOverloading();

    }
}