package com.company;

public class Main {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalance(34000);
        System.out.println("Current Balance in 1st Account is:  "+a1.getBalance());


        Account a2 = new Account (a1.getBalance());
        System.out.println("Current Balance in 2nd Account is: "+a2.getBalance());

        System.out.println("After Withdrawal");

        a1.withdraw(12000);
        System.out.println("Current Balance in 1st Account is:  "+a1.getBalance());
        System.out.println("Current Balance in 2nd Account is:  "+a1.getBalance());
    }
}
