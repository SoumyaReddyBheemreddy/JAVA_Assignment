package com.assignment.assignment2;



public class ContainsAllAlphabets {
    public boolean checkAllCharacters(String text){
        String textToLowerCase = text.toLowerCase();
        char[] characters = textToLowerCase.toCharArray();
        boolean[] visitedCharacters = new boolean[26];
        for(char character : characters){
            if(character>='a' && character<='z') {
                int indexOfCharacter = character-'a';
                visitedCharacters[indexOfCharacter] = true;
            }
        }
        for(boolean visitedCharacter : visitedCharacters){
            if(!visitedCharacter)
                return false;
        }
        return  true;
    }
}
