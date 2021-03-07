package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1 = new Circle();
        System.out.println(c1.circumference());

        Circle c2 = new Circle(16,3.14);
        System.out.println(c2.circumference());
    }
}
