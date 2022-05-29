package org.example.week2;

import java.util.Scanner;

public class MainClass7 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc1.next();

        System.out.print("Enter percentage: ");
        double percentage = sc1.nextDouble();

        if ((percentage>=0) && (percentage <= 34)) {
            System.out.println("Fail");
        } else if ((percentage >= 35) && (percentage <= 50)) {
            System.out.println("Second Class");
        } else if ((percentage >= 51 && percentage <= 74)) {
            System.out.println("First Class");
        } else if((percentage >= 75) && (percentage <= 100)){
            System.out.println("Distinction");
       } else {
         System.out.println("Invalid input, please enter value between 0 - 100");
        }
    }
}

/*
AND -> true if both conditions are true, else false     -> &&
OR  -> true if either condition is true                 ->  ||
NOT -> opposite                                         -> !
*/

/* Assignment - Calculate tax
<= 500000           -> 0%
500001 - 750000     -> 10%
750001 - 1000000    -> 20%
>1000000            -> 30%
 */