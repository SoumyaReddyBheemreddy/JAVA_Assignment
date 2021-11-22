package com.assignment.assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        File directory = new File("/home/soumbr/Documents/");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file to search (or) enter end to exit");
        String input = sc.nextLine();
        while (!input.equals("end")){
                search(directory,input);
                System.out.println("Enter file to search (or) enter end to exit");
                input = sc.nextLine();
        }
    }
    public static void search(File path,String regex){
        Pattern patter = Pattern.compile(regex);
        File[] filesList = path.listFiles();
        for(File file:filesList){
            //System.out.println(file.getName());
            Matcher matcher = patter.matcher(file.getName());
            if(file.isDirectory()){
                search(file,regex);
            }
            else if(matcher.matches()){
                System.out.println("Matched path's are "+file.getAbsolutePath());
            }
        }

    }
}
