import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("It", Genre.HORROR);
    }

    @Test
    public void canGetBookName(){
        assertEquals("It", book.getName());
    }

}
