package com.assignment.assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class KYC{
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public void getRange(String registerDate,String today) throws ParseException {
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(simpleDateFormat.parse(today));
        Calendar signUpDate = Calendar.getInstance();
        signUpDate.setTime(simpleDateFormat.parse(registerDate));
        // this condition is for when current date is falling before sing-up date.
        if(signUpDate.getTime().after(currentDate.getTime()))
            System.out.println("No range");
        else
            calculateRange(signUpDate,currentDate);
    }
    public  void calculateRange(Calendar signUpDate,Calendar currentDate){
        int currentYear = currentDate.get(Calendar.YEAR);
        //setting the singUpDate to the anniversary of the current year
        signUpDate.set(Calendar.YEAR,currentYear);
        signUpDate.add(Calendar.DATE,30);
        Date maximumDate = signUpDate.getTime();
        // added +30 days to anniversary to get -30 from anniversary subtracting -60
        signUpDate.add(Calendar.DATE,-60);
        Date minimumDate = signUpDate.getTime();
        if(maximumDate.compareTo(currentDate.getTime())<0)
            System.out.println(simpleDateFormat.format(minimumDate)+" "+simpleDateFormat.format(maximumDate));
        else
            System.out.println(simpleDateFormat.format(minimumDate)+" "+simpleDateFormat.format(currentDate.getTime()));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] formDates = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            formDates[i] = scanner.nextLine();
        }
        for (String dates : formDates) {
            String registerDate = dates.split(" ")[0];
            String today = dates.split(" ")[1];
            try {
                KYC kyc = new KYC();
                kyc.getRange(registerDate, today);
            }
            catch (ParseException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
