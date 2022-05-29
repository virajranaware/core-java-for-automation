package org.example.week5;

public class ArithmaticOperationsTester {
    public static void main(String[] args) {
        ArithmaticOperations operations = new ArithmaticOperations();
        System.out.println(operations.add(10,11));
        System.out.println(operations.add(10.11,11.10));
        System.out.println(operations.add(1.2, 23.22, 100.11));
    }
}