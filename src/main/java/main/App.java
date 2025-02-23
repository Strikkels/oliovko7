package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Boolean exit = false;
        while(!exit){
            System.out.println("1) Lisää kirja");
            System.out.println("2) Listaa kirjat");
            System.out.println("3) Lainaa fiktiokirja");
            System.out.println("4) Palauta fiktiokirja");
            System.out.println("0) Lopeta ohjelma");
            if(sc.hasNext()){
                int choise = sc.nextInt();
                sc.nextLine();
                switch(choise){
                    case 1:
                        System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
                        int bookType = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Anna kirjan nimi: ");
                        String title = sc.nextLine();
                        System.out.println("Anna kirjailijan nimi: ");
                        String author = sc.nextLine();
                        System.out.println("Anna sivumäärä: ");
                        int pages = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Anna kirjojen määrä: ");
                        int copies = sc.nextInt();
                        sc.nextLine();
                        if(bookType == 1){
                            library.addBook(new FictionBook(title, author, pages, copies));
                        } else if(bookType == 2){
                            library.addBook(new NonFictionBook(title, author, pages, copies));
                        } else {
                            System.out.println("Virheellinen kirjatyyppi.");
                        }
                        System.out.println("Kirja lisätty kirjastoon!");
                        break;
                    case 2:
                        library.listBooks();
                        break;
                    case 3:
                        Boolean bookBorrowed = false;
                        System.out.println("Anna lainattavan kirjan nimi: ");
                        String borrowTitle = sc.nextLine();
                        for(Book book : library.getBooks()){
                            if(book.getTitle().equals(borrowTitle)){
                                if(book instanceof Borrowable){
                                    ((Borrowable) book).borrow();
                                    bookBorrowed = true;
                                    break;
                                }
                            }
                        }
                        if(!bookBorrowed){
                            System.out.println("Kirjaa ei löytynyt tai sitä ei voi lainata.");
                        }
                        break;
                    case 4:
                        Boolean bookReturned = false;
                        System.out.println("Anna palautettavan kirjan nimi: ");
                        String returnTitle = sc.nextLine();
                        for(Book book : library.getBooks()){
                            if(book.getTitle().equals(returnTitle)){
                                if(book instanceof Borrowable){
                                    ((Borrowable) book).returnBook();
                                    bookReturned = true;
                                    break;
                                }
                            }
                        }
                        if(!bookReturned){
                            System.out.println("Kirjaa ei löytynyt tai sitä ei voi palauttaa.");
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Virheellinen valinta!");
                        break;
                }
            }
        }
        sc.close();
    }
}
