package com.assignment.assignment12;

import java.util.Comparator;
import java.util.Map;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCall {
    private  Supplier<Stream<Student>> supplierStreamStudent ;
    StreamCall(){
        this.supplierStreamStudent=()->StudentDetails.getStudentsList();
    }
    public void printDepartment(){
        Stream<String> departments = supplierStreamStudent.get().map(Student::getEngDepartment).distinct();
        departments.forEach(System.out::println);
    }
    public void printEnrollAfter(int year){
        Stream<String> studentName = supplierStreamStudent.get().filter(student ->
             student.getYearOfEnrollment()>year
        ).map(Student::getName);
        studentName.forEach(System.out::println);
    }
    public void printAllMalesInCS(){
        Stream<String> maleStudentInCS = supplierStreamStudent.get().filter(student ->
            student.getGender().equals("Male") && student.getEngDepartment().equals("Computer Science")
        ).map(Student::getName);
        maleStudentInCS.forEach(System.out::println);
    }
    public void printTotalNumberOfMaleAndFemale(){
        Map<String,Long> maleAndFemaleCount = supplierStreamStudent.get().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(maleAndFemaleCount);
    }

    public void printAverageAge(){


        OptionalDouble averageAgeOfMale = supplierStreamStudent.get().filter(student ->
             student.getGender().equals("Male")
        ).map(Student::getAge).mapToInt(age->age).average();
       if(averageAgeOfMale.isPresent())
           System.out.println(averageAgeOfMale.getAsDouble());


        OptionalDouble averageAgeOfFemale = supplierStreamStudent.get().filter(student ->
               student.getGender().equals("Female")
       ).map(Student::getAge).mapToInt(age->age).average();

       if(averageAgeOfFemale.isPresent())
           System.out.println(averageAgeOfFemale.getAsDouble());


    }
    public void printHighestPercentage(){
       double highestPercentage = supplierStreamStudent.get().map(Student::getPerTillDate).max(Double::compare).get();
        System.out.println(highestPercentage);
    }
    public void printNumberOfStudentsInEachDepartment(){
        Map<String,Long> groupByDepartment = supplierStreamStudent.get().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting()));
        System.out.println(groupByDepartment);
    }
    public void printAveragePercentageInDepartments(){
        Map<String,Double> averagePercentageInDepartments = supplierStreamStudent.get().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(averagePercentageInDepartments);
    }
    public void printYoungestMaleInElectronicDepartment(){
        Student youngest =supplierStreamStudent.get()
                .filter(student -> student.getEngDepartment().equals("Electronic") && student.getGender().equals("Male"))
                .min(Comparator.comparing(Student::getAge)).get();
        System.out.println(youngest.getName());
    }
    public void printCountOfMaleAndFemaleInCS(){
        Map<String,Long> totalMaleAndFemaleInCS  =supplierStreamStudent.get().filter(student -> student.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(totalMaleAndFemaleInCS);
    }
}
