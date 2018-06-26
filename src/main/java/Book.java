public class Book {
    private String name;
    private Genre genre;

    public Book(String name, Genre genre){
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }

    public Genre getGenre() {
        return this.genre;
    }
}
