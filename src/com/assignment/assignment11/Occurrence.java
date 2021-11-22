package com.assignment.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Occurrence{
    public void saveCharacterOccurrence(String inputFile,String outputFile){
        try {
            Scanner input = new Scanner(new File(inputFile));
            PrintWriter writer = new PrintWriter(outputFile);
            Map<Character,Integer> characterOccurrence = new HashMap<>();
            while (input.hasNext()){
                char[] characters = input.next().toCharArray();
                for (char character:characters){
                    characterOccurrence.put(character,characterOccurrence.getOrDefault(character,0)+1);
                }
            }
            for(Map.Entry<Character,Integer> entry:characterOccurrence.entrySet()){
                writer.println("Total number of occurrence of "+entry.getKey()+" is "+entry.getValue());
            }
            input.close();
            writer.close();

        }
        catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
}