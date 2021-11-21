package com.assignment.assignment7.cycle;

import java.util.Scanner;

class Main{
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] object = new Cycle[3];
        object[0] = (Cycle) unicycle;
        object[1] = (Cycle) bicycle;
        object[2] = (Cycle) tricycle;
            /*Error
            Cannot find symbol
            symbol:   method balance()
            location: class com.assignment.assignment7.cycle.Cycle
             base class can't access derived class behaviour */
            /*
            object[0].balance();
            object[1].balance();
            object[2].balance();
             */
        ((Unicycle)object[0]).balance();
        ((Bicycle)object[1]).balance();
            /*Tricycle won't work because not method called balance
            ((Tricycle) object[2]).balance();

             */

    }
}