package com.company;

public class triangle implements Shape {
    private int b;
    private int h;

    triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }
    public double Area() {
        return 0.5 * b * h;
    }
}
