package com;
class Books{
    public void displayInfo(String name){
        System.out.println(" Book is " + name);
    }
}
class Reference_Book extends Books{
    public void displayInfo(String name){
        System.out.println(" Reference Book is " + name);
    }
}
class Magazine extends Books{
    public void displayInfo(String name){
        System.out.println("Magazine is " + name);
    }
}

public class Lab_6_Books {
    public static void main(String[] args) {
        Books books = new Books();
        books.displayInfo("Harry Potter");
        Reference_Book referenceBook = new Reference_Book();
        referenceBook.displayInfo("Rowling");
        Magazine magazine = new Magazine();
        magazine.displayInfo("Good Day");
    }
}
