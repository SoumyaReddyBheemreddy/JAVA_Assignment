package com.assignment.assignment3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, number of step to be executed :");
        int numberOfSteps = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, Enter URI or IP address");
        String host = scanner.nextLine();
        try {
            hostPing(numberOfSteps,host);
        }
       catch (IOException exception){
           System.out.println(exception.getMessage());
       }
    }
    public static void hostPing(int numberOfSteps,String host) throws IOException {
        Process process = Runtime.getRuntime().exec("ping "+host);
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String outputLine =  input.readLine();
        ArrayList<Double> times = new ArrayList<>();
        while (outputLine!=null && numberOfSteps>=0){
            System.out.println(outputLine);
            if(outputLine.contains("time")){
                String getTime = outputLine.substring(outputLine.lastIndexOf("=")+1,outputLine.length()-2);
                double time = Double.parseDouble(getTime);
                times.add(time);
            }
            outputLine = input.readLine();
            numberOfSteps--;
        }
        Collections.sort(times);
        if(times.size()%2!=0){
            System.out.println("Median is : "+times.get((times.size()-1)/2));
        }
        else{
            System.out.println("Median is : "+(times.get((times.size()-2)/2)+times.get(times.size()/2))/2);
        }
    }
}
