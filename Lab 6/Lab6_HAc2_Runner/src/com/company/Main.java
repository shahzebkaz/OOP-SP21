package com.company;

public class Main {

    public static void main(String[] args) {
        A2 h1 =  new A2();
        A2 h2 = new A2();
        System.out.println("obj: " + A2.getObj());
        A2.deleteObj(h2);
        System.out.println("obj: " + A2.getObj());
    }
}
