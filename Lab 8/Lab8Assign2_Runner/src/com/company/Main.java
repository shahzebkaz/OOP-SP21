package com.company;
import java.util.Scanner

public class Main {

    public static void main(String[] args) {
        Book b = new Book();
        tape t = new tape();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title of book: ");
        b.title = input.next();
        System.out.println("Enter Price of Book: ");
        b.price = input.nextInt();
        System.out.println("Enter number of Pages: ");
        b.pagecount = input.nextInt();
        System.out.println("Enter Playing time: ");
        t.playingtime = input.nextDouble();
        b.display();
        t.display();
    }
    }
}
