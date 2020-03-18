import org.junit.Before;

public class BorrowerTest {

    private Borrower borrower;
    private Book books;
    private BookCollection bookCollection;

    @Before
    public void before(){
        borrower = new Borrower("Aldo");
        books = new Book("Italo Calvino", "Invisible Cities", "Fiction");
        bookCollection = new BookCollection();
//        bookCollection.addBook(book);
    }


}
