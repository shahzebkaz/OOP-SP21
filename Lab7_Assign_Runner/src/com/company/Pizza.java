package com.company;

public class Pizza {
    private String size;
    private int cheeseTop;
    private int peppTop;
    private int hamTop;
    private int n; private int cost;

    public Pizza() {
        size= "Small";
        cheeseTop=1;
        n++;
    }

    public Pizza(String s, int a, int b, int c) {
        size=s;
        cheeseTop=a;
        peppTop=b;
        hamTop=c;
        n=cheeseTop+peppTop+hamTop;
    }

    public void setSize(String s){
        size=s;
    }

    public String getSize() {
        return size;
    }

    public void setcheeseTopp(int x) {
        cheeseTop=x;
        n++;
    }

    public int getcheeseTop() {
        return cheeseTop;
    }

    public void setpeppTop(int y) {
        peppTop=y;
        n++;
    }

    public int getpeppTop() {
        return peppTop;
    }

    public void sethamTop(int z) {
        hamTop=z;
        n++;
    }

    public int gethamTop() {
        return hamTop;
    }

    public double calcCost() {
        if (size=="Small") {
            cost= 10+(2*n);
        }
        else if (size=="Medium") {
            cost= 12+(2*n);
        }
        else if (size=="Large") {
            cost= 14+(2*n);
        }
        return cost;
    }

    public String getDescription() {
        return "Pizza SIZE: "+size+"\nNumber of Cheese Topping: "+cheeseTop+"\nNumber of Pepperoni Topping: "+
                peppTop+"\nNumber of Ham Topping: "+hamTop;
    }
}
