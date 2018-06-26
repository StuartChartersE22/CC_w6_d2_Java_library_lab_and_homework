import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Five Children and It");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, library.getCapacity());
    }
//    @Test
//    public void libraryContainsBooks(){
//        assertEquals(1,library.bookCount())
//    }

}
