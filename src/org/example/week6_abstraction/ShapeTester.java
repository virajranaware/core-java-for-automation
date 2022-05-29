package org.example.week6_abstraction;

public class ShapeTester {
    public static void main(String[] args) {

        Shape s2 = new Circle(10);
        s2.draw();
        s2.computeArea(10);

        Shape s3 = new Square(20);
        s3.draw();
        s3.computeArea(20);
    }
}
