/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;


import java.util.*;

public class Fraction 
{
    private int numerator;
    private int denominator;

    public Fraction(int n, int d) 
    {
        numerator = n;
	denominator = d;
    }

    public void setNumerator(int n) 
    {
	numerator = n;
    }
    public void setDenominator(int d)
    {
        denominator = d;
    }

    public void displayFraction()
    {
	System.out.print(numerator + "/" + denominator);
    }

    public boolean equals(Fraction other)
    {
	int num1, num2;
	int num3, num4;
	int num5 = 1;
        for (int i = 2; i <= Math.min(numerator, denominator); i++) 
	{

            if (numerator % i == 0 && denominator % i == 0)
            num5 = i;
	}

	num1 = numerator / num5;
	num2 = denominator / num5;

	int otherGcf = 1;
	for (int i = 2; i <= Math.min(other.numerator, other.denominator); i++) 
	{
			
            if (other.numerator % i == 0 && other.denominator % i == 0)
            otherGcf = i;
	}

	num3 = other.numerator / otherGcf;
	num4 = other.denominator / otherGcf;

	return (num1 == num3 && num2 == num4);

	}

}
