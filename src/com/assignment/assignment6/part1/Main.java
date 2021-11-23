package com.assignment.assignment6.part1;

public class Main {
    public static void main(String[] args){
        VampireNumber vampireNumber = new VampireNumber();
        int number = 1000;
        int count = 0;
        while (count<=100){
            if(vampireNumber.isEvenLength(number)){
                int[] digits = vampireNumber.splitNumbers(number);
                vampireNumber.allPermutations(digits,0,number);
                if(vampireNumber.isVampireNumber){
                    System.out.println(number);
                    count++;
                    vampireNumber.isVampireNumber=false;
                }
            }
            number++;
        }
    }
}
