package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account a1 = new Account();
        System.out.println(a1.deposit());

        Account a2 = new Account(60000,15000);
        System.out.println(a2.withdraw());
    }
}
