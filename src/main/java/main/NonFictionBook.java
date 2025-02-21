package main;

public class NonFictionBook extends Book {
    public NonFictionBook (String title, String author, int pages, int copies) {
        super(title, author, pages, copies);
    }

    public String getTitle() {
        return this.title;
    }
    public void displayInfo() {
        System.out.println("Nimi: " + this.title + ", Kirjailija: " + this.author + ", Sivut: " + this.pages + ", Määrä: " + this.copies);
    }
    public String categorize() {
        return "Tietokirja";
    }
}
