import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Barry");
    }

    @Test
    public void testBorrowerHasNoBooks(){
        assertEquals(0, borrower.getBookCount());
    }
}
a