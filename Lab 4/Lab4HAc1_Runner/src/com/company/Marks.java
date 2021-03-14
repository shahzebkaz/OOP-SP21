package com.company;

public class Marks {
    private int mark1 , mark2 , mark3;


    public Marks() {

        mark1 = 76; mark2 = 89; mark3 = 91;

    }
    public Marks ( int m1, int m2 , int m3 ) {
        mark1 = m1; mark2 = m3; mark3 = m3;
    }

    public void setM1(int m1) {
        mark1 = m1;
    }

    public void setM2(int m2) {
        mark2 = m2;
    }

    public void setM3(int m3) {
        mark3 = m3;
    }

    public int getM1() {
        return mark1;
    }

    public int getM2() {
        return mark2;
    }

    public int getM3() {
        return mark3;
    }
}
