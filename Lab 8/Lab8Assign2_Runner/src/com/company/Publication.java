package com.company;

public class Publication {
    protected String title;
    protected int price;

    public Publication() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void display() {
        System.out.println("Title of Book: " + this.title);
        System.out.println("Price of Book: " + this.price);
    }
}
