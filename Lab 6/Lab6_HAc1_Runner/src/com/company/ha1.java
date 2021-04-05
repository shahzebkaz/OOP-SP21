package com.company;

public class ha1 {
    static double annualinterestRate;
    private double savingBalance;

    ha1(double b) {
        this.savingBalance = b;
    }

    void monthlyInterestrate() {
        double temp = this.savingBalance + this.savingBalance * annualinterestRate / 12.0D;
        this.savingBalance = temp;
    }

    public static void setAnnualinterestRate(double annualinterestRate) {
        ha1.annualinterestRate = annualinterestRate;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }
}
