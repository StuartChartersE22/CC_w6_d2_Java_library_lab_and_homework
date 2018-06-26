import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Five Children and It", Genre.CHILDRENS);
        book2 = new Book("It", Genre.HORROR);
        book3 = new Book("Itch 'ikers guide to t' galaxe", Genre.SCIFI);
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

    @Test
    public void cantAddBookIfAtCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canGetBookByIndex(){
        library.addBook(book1);
        library.addBook(book2);
        library.takeBook(1);
        assertEquals(1, library.bookCount());
    }


//    @Test
//    public void libraryContainsBooks(){
//        assertEquals(1,library.bookCount())
//    }

}
