package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Large",0,1,2);
        Pizza p2 = new Pizza();

        PizzaOrder o1 = new PizzaOrder(p1, p2);

        System.out.println(p1.getDescription());
        System.out.println("Cost: "+p1.calcCost()+"\n");
        System.out.println(p2.getDescription());
        System.out.println("Cost: "+p2.calcCost()+"\n");

        System.out.println("Total Amount: "+o1.calcTotal()+"\n");

    }
}
