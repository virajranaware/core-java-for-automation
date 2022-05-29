package org.example.week2;

import java.util.Scanner;  // take functionality which is pre-written

public class MainClass5 {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);  // Step 1: Create Scanner object & import Scanner from java.util

        System.out.print("Enter your age: ");
        int age = scanner1.nextInt();               // Step 2: Capture value using appropriate method

        if(age < 18){
            System.out.println("Not allowed to drive");
        }else{
            System.out.println("Allowed to drive");
        }

    }
}
