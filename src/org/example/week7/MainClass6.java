package org.example.week7;

import java.util.HashSet;

public class MainClass6 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(23);
        numbers.add(21);
        numbers.add(2);
        numbers.add(5);

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);

//        numbers.removeAll(primeNumbers);// Difference
        primeNumbers.removeAll(numbers);
        for (Integer i : primeNumbers){
            System.out.print(i + " ");
        }

    }
}
/*
2, 3, 5, 7, 21, 23
 */