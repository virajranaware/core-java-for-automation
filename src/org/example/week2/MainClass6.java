package org.example.week2;

import java.util.Scanner;

public class MainClass6 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc1.next();

        System.out.print("Enter percentage: ");
        double percentage = sc1.nextDouble();

        if(percentage >= 35){
            System.out.println("Congratulations, "+ name + ". You have passed the exam..!");
        }else  {
            System.out.println("Sorry, "+ name + ". You have failed the exam..!");
        }
    }
}

//Assigment1: Take message from input, pass it to display method and print the message.
//Assigment2: Take age from user. If age > 60  (retired), else working