package com.assignment.assignment11;


public class Main {
    public static void main(String[] args){
            String inputFilePath = "inputText.txt";
            String outputFilePath = "CharacterOccurrence.txt";
            Occurrence occurrence = new Occurrence();
            occurrence.saveCharacterOccurrence(inputFilePath,outputFilePath);
    }
}
