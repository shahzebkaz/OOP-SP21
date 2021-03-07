package com.company;

public class Marks {
    public int m1,m2,m3;



    public Marks() {
        m1 = 50; m2 =100; m3 = 100;

    }

    public Marks (int M1, int M2, int M3) {

        M1 = m1;  M2 = m2; M3= m3;


    }

    public int calcaulatesum() {

        return (m1 + m2 + m3);
    }
}
