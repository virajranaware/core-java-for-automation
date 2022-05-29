package org.example.week7;

public class Test {
    public static void main(String[] args) {
        System.out.println(scoresIncreasing(new int[]{1, 3, 2}));
    }
    static boolean scoresIncreasing(int[] scores) {
        for(int i=0; i<=scores.length-2; i++){
            if(scores[i] <= scores[i+1]){

            }else
                return false;
        }
        return true;
    }
}