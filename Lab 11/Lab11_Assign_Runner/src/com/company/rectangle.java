package com.company;

public class rectangle implements Shape {
    private int l;
    private int w;
    rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    public double Area() {
        return l * w;
    }

}
