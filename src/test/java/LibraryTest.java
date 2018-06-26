import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Five Children and It");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

//    @Test
//    public void libraryContainsBooks(){
//        assertEquals(1,library.bookCount())
//    }

}
