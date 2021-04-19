package com.company;

public class Computer {
    protected int wordsize;
    protected int memorysize;
    protected int storagesize;
    protected int speed;

    public Computer() {
        this.wordsize = 0;
        this.memorysize = 0;
    }

    public Computer(int a, int b, int c, int d) {
        this.wordsize = a;
        this.memorysize = b;
        this.storagesize = c;
        this.speed = d;
    }

    public void display() {
        System.out.println("Wordsize: " + this.wordsize);
        System.out.println("Memory Size: " + this.memorysize);
        System.out.println("Strorage size: " + this.storagesize);
        System.out.println("Speed: " + this.speed);
    }

}
