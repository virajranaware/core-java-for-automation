package org.example.week6_exceptionHandling;

public class MainClass9 {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            addDelay(3000);         //3 seconds, 1sec = 1000 milli seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Stop");
    }

    static void addDelay(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

}
/*

&&  AND
||  OR
!   NOT

 */