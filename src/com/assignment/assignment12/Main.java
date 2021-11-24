package com.assignment.assignment12;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Stream<Student> students = StudentDetails.getStudentsList();
        StreamCall streamCall = new StreamCall(students);
       // streamCall.printDepartment();
       // streamCall.printEnrollAfter(2018);
       // streamCall.printAllMalesInCS();
        //streamCall.printTotalNumberOfMaleAndFemale();
        streamCall.printAverageAge("Male");
        streamCall.printAverageAge("Female");
        streamCall.printHighestPercentage();
        streamCall.printNumberOfStudentsInEachDepartment();
        streamCall.printAveragePercentageInDepartments();
        streamCall.printYoungestMaleInElectronicDepartment();

    }
}
