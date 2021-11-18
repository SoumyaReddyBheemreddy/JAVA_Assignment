package com.assignment.assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        //String text = "The quick brown fox jumps over the lazy dog";
        String text = scanner.nextLine();
        ContainsAllAlphabets containsAllAlphabets = new ContainsAllAlphabets();
        if(containsAllAlphabets.checkAllCharacters(text)){
            System.out.println("contains all the letters of the alphabet a-z ");
        }
        else{
            System.out.println("Doesn't contains all the letters of the alphabet a-z ");
        }
    }
}
