package org.example.week3;

public class MainClass8 {

    public static void main(String[] args) {
        System.out.println("Program started..");
        int[] arr3 = {12, 23, 5, 11, 34, 56, 21};
        int sum1 = calculateSum(arr3);
        System.out.println("The sum of all elements is : " + sum1);
        System.out.println("Program finished..");
    }

    static int calculateSum(int[] arr){
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];              // -> sum = sum + arr[i]
        }
        return sum;
    }
}

/*

Assignment 1:
Write a program to find the multiplication of all elements

Assignment 2
Method to accept array, reverse its elements, return modified array
I/P to method -> int[] arr3 = {12, 23, 5, 11, 34, 56, 21};
O/P of method -> arrReversed = {21, 56, 34, 11, 5, 23, 12}
print reversed array in main method

 */