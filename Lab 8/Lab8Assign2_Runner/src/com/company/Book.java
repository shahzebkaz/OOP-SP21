package com.company;

public class Book {
    protected int pagecount;

    public Book() {
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public int getPagecount() {
        return this.pagecount;
    }

    public void display() {
        super.display();
        System.out.println("Page count: " + this.pagecount);
    }
}
