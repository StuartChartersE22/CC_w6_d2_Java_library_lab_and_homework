import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void borrowsBook(Library library, Book book) {
        if(library.takeBookObject(book)){
            this.books.add(book);
        }
    }

}
