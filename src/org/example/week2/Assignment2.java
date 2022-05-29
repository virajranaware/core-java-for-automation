package org.example.week2;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner sc1 = new Scanner(System.in);
        int number = sc1.nextInt();

        int fact = 1;

        for (int i = 1; i <= number; i++){
            fact = fact * i;
        }
        System.out.println("Factorial is : "+ fact);
    }
}
