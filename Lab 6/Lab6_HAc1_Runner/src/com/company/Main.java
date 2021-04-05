package com.company;

public class Main {

    public static void main(String[] args) {
        ha1 savor1 = new ha1(2000.0D);
        ha1 savor2 = new ha1(3000.0D);
        ha1.setAnnualinterestRate(3.0D);
        savor1.monthlyInterestrate();
        System.out.println("Saving Balance 1: " + savor1.getSavingBalance());
        savor2.monthlyInterestrate();
        System.out.println("Saving Balance 2: " + savor2.getSavingBalance());
        ha1.setAnnualinterestRate(4.0D);
        savor1.monthlyInterestrate();
        System.out.println("Saving Balance 1: " + savor1.getSavingBalance());
        savor2.monthlyInterestrate();
        System.out.println("Saving Balance 2:" + savor2.getSavingBalance());
    }
}
