package org.example.week7;

public class MainClass8 {
    public static void main(String[] args) {

        int i = 10;
        double d = 11.12;

        int k = (int) 11.12;     // 11.12 -> 11   :- Narrowing, needs to be done explicitly
        double l = 10;          // 10 -> 10.0   :- Widening, happens implicitly

        System.out.println("k value is: " + k);
        System.out.println("l value is: " + l);
    }
}

/*
Box size 5 * 5 Feet
Item to be place of size 6 * 6 feet     -> cut to make it 5 * 5


Box size 5 * 5 Feet
Item to be place of size 1 * 1 feet


 */