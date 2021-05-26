package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] Shapes=new Shape[3];
        Shapes[0]=new circle(3.8);
        Shapes[1]=new rectangle(19,15);
        Shapes[2]=new triangle(15,8);

        double arr_Area[] = CalculateArea.Array_Area(Shapes);
        for(double Area: arr_Area) {
            System.out.println(Area);
        }
    }
}
