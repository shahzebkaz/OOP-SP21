package com.company;

public class A2 {
    private static int obj = 0;

    A2() {
        obj++;
    }

    public static int getObj() {
        return obj;
    }

    public static void deleteObj(A2 o) {
        o = null;
        obj--;
    }
}
