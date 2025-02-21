package main;

public class FictionBook extends Book implements Borrowable {
    
    public FictionBook(String title, String author, int pages, int copies) {
        super(title, author, pages, copies);
    }

    public String getTitle() {
        return this.title;
    }

    public String categorize() {
        return "Fiktiokirja";
    }
    public void displayInfo() {
        System.out.println("Nimi: " + this.title + ", Kirjailija: " + this.author + ", Sivut: " + this.pages + ", Määrä: " + this.copies);
    }
    public void borrow() {
        if (this.copies > 0) {
            this.copies--;
            System.out.println("Kirja " + this.title + " on nyt lainattu.");
        } else {
            System.out.println("Kirjaa " + this.title + " ei enään ole lainattavissa!");
        }
    }
    public void returnBook() {
        if(this.copies < 0) {
            this.copies++;
            System.out.println("Kirja " + this.title + " on nyt palautettu.");
        } else {
            System.out.println("Kirja " + this.title + " ei ole lainassa.");
        }
    }
}
