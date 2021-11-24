package com.assignment.assignment12;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        StreamCall streamCall = new StreamCall();
        System.out.println(" Print the name of all departments in the college");
        streamCall.printDepartment();
        System.out.println();
        System.out.println("the names of all students who have enrolled after 2018");
        streamCall.printEnrollAfter(2018);
        System.out.println();
        System.out.println("details of all male student in the computer sci department");
        streamCall.printAllMalesInCS();
        System.out.println();
        System.out.println("Total male and female student ");
        streamCall.printTotalNumberOfMaleAndFemale();
        System.out.println();
        System.out.println(" the average age of male and female students");
        streamCall.printAverageAge();
        System.out.println();
        System.out.println("the details of highest student having highest percentage ");
        streamCall.printHighestPercentage();
        System.out.println();
        System.out.println("Count the number of students in each department");
        streamCall.printNumberOfStudentsInEachDepartment();
        System.out.println();
        System.out.println("the average percentage achieved in each department");
        streamCall.printAveragePercentageInDepartments();
        System.out.println();
        System.out.println("the details of youngest male student in the Electronic department");
        streamCall.printYoungestMaleInElectronicDepartment();
        System.out.println();
        System.out.println("Total  male and female students are there in the computer science department");
        streamCall.printCountOfMaleAndFemaleInCS();

    }
}
