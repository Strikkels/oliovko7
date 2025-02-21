package main;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void listBooks() {
        int n = this.books.size();
        
        for (Book book : this.books) {
            book.displayInfo();
            System.out.println("Kirjan kategoria: " + book.categorize());
        }
        System.out.println("Kirjojen määrä kirjastossa on: " + n);
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

}
