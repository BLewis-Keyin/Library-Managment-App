import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String dateOfBirth;
    private List<Book> booksWritten;

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.booksWritten = new ArrayList<>();
    }

    // Getters and setters

    public void addBook(Book book) {
        booksWritten.add(book);
    }
}