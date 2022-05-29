package org.example.week6_exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass4 {
    public static void main(String[] args) {
        File fileObj = new File("hello.txt");
        try {
            Scanner sc1 = new Scanner(fileObj);
        } catch (FileNotFoundException e) {
            System.out.println("File Not found");
        }
    }
}
