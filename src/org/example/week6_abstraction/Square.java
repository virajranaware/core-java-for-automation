package org.example.week6_abstraction;

public class Square extends TwoDShapes{
    int r;

    Square(int r) {
        this.r = r;
    }
    @Override
    public void draw() {
        System.out.println("Drawing square..!");
    }

    @Override
    public void computeArea(int side) {
        System.out.println("Area of square is: " + side * side );
    }
}
