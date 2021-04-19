package com.company;

public class Laptop {
    int length;
    int width;
    int height;
    int weight;

    public Laptop() {
        this.length = 15;
        this.weight = 15;
        this.height = 25;
        this.width = 25;
    }

    public Laptop(int a, int b, int c, int d) {
        super(20, 30, 60, 90);
        this.length = a;
        this.weight = b;
        this.height = c;
        this.width = d;
    }

    public void display() {
        super.display();
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
    }
}
