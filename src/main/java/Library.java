import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(capacity > books.size()) {
            this.books.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Book takeBook(int index) {
        return this.books.remove(index);
    }


}
