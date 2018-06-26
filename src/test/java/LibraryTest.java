import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book("Five Children and It", Genre.CHILDRENS);
        book2 = new Book("It", Genre.HORROR);
        book3 = new Book("Itch 'ikers guide to t' galaxe", Genre.SCIFI);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

//    @Test
//    public void libraryStartsEmpty(){
//        assertEquals(0, library.bookCount());
//    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void cantAddBookIfAtCapacity(){
        library.addBook(book3);
        library.addBook(book3);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canGetBookByIndex(){
        library.takeBook(1);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canGetBookObject(){
        assertEquals(true, library.takeBookObject(book1));
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canCountBooksByGenre(){
        assertEquals(1, library.numberOfBooksByGenre(Genre.SCIFI));
    }

    @Test
    public void canGetInventoryMethodProduced(){
        HashMap<Genre, Integer> inventory = library.getInventoryNotAttr();
        int numberOfBooks = inventory.get(Genre.SCIFI);
        assertEquals(1, numberOfBooks);
    }

    @Test
    public void canGetBooksByGenre(){
        ArrayList<Book> booksInGenre = library.getBooksByGenre(Genre.HORROR);
        assertEquals(1, booksInGenre.size());
    }
}
