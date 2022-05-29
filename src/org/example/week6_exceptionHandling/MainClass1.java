package org.example.week6_exceptionHandling;

public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] arr = {1, 23, 11, 2, 45};

        System.out.println(arr[5]);           //  -->  new Exception()

        System.out.println("More Code..!");
        System.out.println("Finish");

    }
}

/*
Array index starts from 0
If length = 5
Index -> 0 to 4

System.out.println(arr[arr.length - 1]);                // index  =>    0 to length-1

Scenario:
Open file -> Write something.

Database:
Trying to access database programatically.
Access database connection - link bw java & DB
then you perform operations
finally you should close the link

ATM:


 */