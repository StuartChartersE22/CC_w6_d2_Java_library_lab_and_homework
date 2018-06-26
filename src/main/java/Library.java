import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return this.books.size();
    }
}
