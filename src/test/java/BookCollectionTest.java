import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BookCollectionTest {



        private BookCollection bookCollection;
        private Book book;

        @Before
        public void before(){
            bookCollection = new BookCollection();
            book = new Book();
        }

        @Test
        public void canAddBook(){
            bookCollection.addBook(book);
            assertEquals(1, bookCollection.bookCount());
        }

        @Test
        public void canCheckIfLibraryFull(){
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            bookCollection.addBook(book);
            assertEquals("The Library is full?", bookCollection.checkIfLibraryIsFull());
        }


}
