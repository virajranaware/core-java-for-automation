package org.example.week6_abstraction;

public interface Shape {
    public static final double PI = 3.142;
    void draw();
    void computeArea(int r);
}

/*
Info Available:

public interface Shape {
    public static final double PI = 3.142;
    void draw();   // It draws given shape
    void computeArea(int r);        // It computes area of a given shape
}

Circle implements Shape
Square implements Shape
 */