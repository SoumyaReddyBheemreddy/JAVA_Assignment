package com.assignment.assignment8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Sam");
        studentNames.add("John");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student name");
        String studentName = scanner.nextLine();
        String designation = scanner.nextLine().toLowerCase();
        try{
            if(!designation.equals("student")){
                throw new NotAStudentException("Not a Student");
            }
            Matcher matcher = pattern.matcher(studentName);
            if(!matcher.matches()){
                throw  new InvalidNameFormat("Invalid Name Format");
            }
            if(!studentNames.contains(studentName)){
                throw new UnregisterStudent("Name is not found");
            }
        }
        catch (NotAStudentException exception){
            System.out.println(exception.getMessage());
        }
        catch (InvalidNameFormat exception){
            System.out.println(exception.getMessage());
        }
        catch (UnregisterStudent exception){
            System.out.println(exception.getMessage());
        }
    }
}
