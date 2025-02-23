package main;

public class FictionBook extends Book implements Borrowable {
    protected int borrowedCopies;

    public FictionBook(String title, String author, int pages, int copies) {
        super(title, author, pages, copies);
        this.borrowedCopies = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public int getCopies() {
        return this.copies;
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
            this.borrowedCopies++;
            System.out.println("Kirja " + this.title + " on lainattu.");
        } else {
            System.out.println("Kirjaa " + this.title + " ei enään ole lainattavissa!");
        }
    }
    public void returnBook() {
        if(this.borrowedCopies > 0) {
            this.borrowedCopies--;
            this.copies++;
            System.out.println("Kirja " + this.title + " on palautettu.");
        } else {
            System.out.println("Kirja " + this.title + " ei ole lainassa.");
        }
    }
}
