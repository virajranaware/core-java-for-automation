package org.example.week3;

public class Assignment5 {
    public static void main(String[] args) {

        int[] arr = {12, 23, 5, 11, 34, 56, 21};
        int[] reversedArray = reverseArray(arr);

        for (int i=0; i< reversedArray.length; i++){
            System.out.println(reversedArray[i]);
        }
    }

    static int[] reverseArray(int[] original){
        int[] reversed = new int[original.length];
        int i = 0;
        for (int j = original.length-1; j >= 0; j-- ){
            reversed[i] = original[j];   // i -> 0 to L-1 and j -> L-1 to 0
            i++;
        }
        return reversed;
    }
}
/*
itr1 -> i=0, j=6
itr2 -> i=1, j=5
itr3 -> i=2, j=4
 */