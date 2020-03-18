import java.awt.print.Book;
import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> booksBag;

    public Borrower(String name){
        this.booksBag = new ArrayList<Book>();
        this.name = name;
    }

    public int bookCount(){
        return booksBag.size();
    }
}
