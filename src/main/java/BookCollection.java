import java.awt.print.Book;
import java.util.ArrayList;

public class BookCollection {

    private ArrayList<Book> book;

    public BookCollection(){
        this.book = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.book.add(book);
    }

    public int bookCount(){
        return this.book.size();
    }

    public String checkIfLibraryIsFull(){
       if(this.book.size()>10);
    return "The Library is full?";
}
}
