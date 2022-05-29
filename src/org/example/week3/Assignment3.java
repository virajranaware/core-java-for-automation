package org.example.week3;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter number to print multiplication table: ");
        int n1 = sc1.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(n1 * i);
    }
}

/*
3. Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number

n1

for
    int i = 1 to 10
    print n1 * i
 */