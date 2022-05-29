package org.example.week2;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc1.nextInt();

        int sum = 0;

        for (int i = 1; i<=number; i++ ){
            sum = sum + i;
        }

   /*
Factorial:
    5! = 5 * 4 * 3 * 2 * 1
    fact = fact * i
 */





        for (int i = number; i>= 1; i-- ){
            sum = sum + i;
        }

        System.out.println("Sum is: "+ sum);
    }
}

// Assignment
// we want to find addition of first n numbers
// e.g n = 5,     5+4+3+2+1,
// 1+2+3+4+5  if n =2, 2+1
// sum = sum + i

