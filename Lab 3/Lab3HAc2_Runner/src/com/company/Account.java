package com.company;

public class Account {
    public int balance;
    public int change;
    public Account(){
        balance = 18000;
        change = 6000;
    }
    public Account(int a, int b){
        balance = a;
        change = b;
    }
    public int deposit(){
        return(balance+change);
    }
    public int withdraw(){
        return(balance-change);
    }

}
