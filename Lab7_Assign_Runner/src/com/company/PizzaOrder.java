package com.company;

public class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3;
    private double cost;

    public PizzaOrder(Pizza p) {
        p1=p;
    }

    public PizzaOrder(Pizza p, Pizza pp) {
        p1=p; p2=pp;
    }

    public PizzaOrder(Pizza p, Pizza pp, Pizza ppp) {
        p1=p; p2=pp; p3=ppp;
    }

    public double calcTotal() {
        if (p2==null && p3==null) {
            cost =p1.calcCost();
        }
        else if (p3==null) {
            cost =p1.calcCost()+p2.calcCost();
        }
        else cost= p1.calcCost()+p2.calcCost()+p3.calcCost();

        return cost;
    }
}
