package main;

public abstract class Book {
    protected String title;
    protected String author;
    protected int pages;
    protected int copies;

    public Book(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }
    
    public abstract int getCopies();
    public abstract String getTitle();
    public abstract void displayInfo();
    public abstract String categorize();
}
