import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<Genre, Integer> inventory;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
        this.inventory = new HashMap<>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(capacity > books.size()) {
            this.books.add(book);
            int numberOfBooks = this.inventory.getOrDefault(book.getGenre(),0);
            numberOfBooks += 1;
            this.inventory.put(book.getGenre(), numberOfBooks);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public Book takeBook(int index) {
        return this.books.remove(index);
    }

    public Boolean takeBookObject(Book book) {
        return this.books.remove(book);
    }


    public int numberOfBooksByGenre(Genre genre) {
        return this.inventory.get(genre);
    }
}
