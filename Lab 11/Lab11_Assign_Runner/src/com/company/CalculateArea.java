package com.company;

public class CalculateArea {
    public static double[] Array_Area(Shape[] Shapes) {
        double[] n = new double[Shapes.length];
        for (int i = 0; i < Shapes.length; i++) {
            if (Shapes[i] != null) {
                n[i] = Shapes[i].Area();
            }
        }
        return n;
    }
}
