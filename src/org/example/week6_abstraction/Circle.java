package org.example.week6_abstraction;

public class Circle extends TwoDShapes{
    int r;

    Circle(int r){
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Cirle..!");
    }

    @Override
    public void computeArea(int radius) {
        System.out.println("Area is : "+ PI * radius * radius);
    }
}
