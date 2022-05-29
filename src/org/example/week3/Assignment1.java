package org.example.week3;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int n1 = sc1.nextInt();

        System.out.print("Enter number2: ");
        int n2 = sc1.nextInt();

        if(n1 > n2){
            System.out.println("n1 is greater");
        }else {
            System.out.println("n2 is greater");
        }

    }
}

/*
1. Take two int values from the user and print the greatest among them

        1 ->
        Scanner to take values - 2 values(int)
        n1 n2
        If (n1 > n2)  -> n1 is greater
        Else -> n2 is greater
 */
