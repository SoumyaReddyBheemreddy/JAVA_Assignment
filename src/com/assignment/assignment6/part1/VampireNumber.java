package com.assignment.assignment6.part1;

public class VampireNumber{
    boolean isVampireNumber;
    public boolean isEvenLength(int number){
        return ((int) (Math.log10(number)+1))%2==0;
    }
    public int[] splitNumbers(int number){
        int length=(int)(Math.log10(number)+1);
        int[] digits=new int[length];
        int index=0;
        while (number!=0) {
            digits[index]=number%10;
            number/=10;
            index++;
        }
        return digits;
    }
    public void allPermutations(int[] arr, int index, int number) {

        if (index==arr.length-1 && this.checkVampireNumber(arr,number)) {
                isVampireNumber=true;
        }
        for (int i=index;i<arr.length;i++) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
           allPermutations(arr,index+1,number);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
     public boolean checkVampireNumber(int[] arr, int number) {
        int firstPart=0;
        int secondPart=0;
        for (int index=0;index<(arr.length)/2;index++)
            firstPart+=arr[index]*Math.pow(10,(arr.length)/2-index-1);

        for (int index=(arr.length)/2;index<arr.length;index++)
            secondPart+=arr[index]*Math.pow(10,(arr.length-index-1));

        return (firstPart * secondPart) == number;
    }
}
