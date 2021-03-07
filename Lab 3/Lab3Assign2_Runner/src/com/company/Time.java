package com.company;

public class Time {
    public int hr,min, seconds;

    public Time() {

        hr = 12; min = 5; seconds = 14;
    }

    public Time(int h, int m, int s ) {


    }

    public void hour(int h ) {

        h = hr;
    }

    public void min(int m ) {

        m = min;
    }

    public void seconds(int s ) {

        s = seconds;
    }

    public void displayTime() {
        System.out.println( + hr + ":"+ min +":"+ seconds);

    }
}
