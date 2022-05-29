package org.example.week6_exceptionHandling;

public class MainClass10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        addDelay(3000);
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