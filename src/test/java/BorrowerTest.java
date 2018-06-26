import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(999);
        book = new Book("The Borrowers", Genre.CHILDRENS);
        borrower = new Borrower("Barry");
        library.addBook(book);
    }

    @Test
    public void testBorrowerHasNoBooks(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void testBarryBorrowsBook(){
        borrower.borrowsBook(library, book);
        assertEquals(1, borrower.getBookCount());
        assertEquals(0, library.bookCount());
    }


}
