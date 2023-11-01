import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }

// Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to add an author to the library
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Method to add a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Method to search for books by title
    public List<Book> searchBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    // Method to search for books by author
    public List<Book> searchBooksByAuthor(Author author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    // Method to search for books by ISBN
    public List<Book> searchBooksByISBN(String ISBN) {
        return books.stream()
                .filter(book -> book.getISBN().equalsIgnoreCase(ISBN))
                .collect(Collectors.toList());
    }

    // Method to allow a patron to borrow a book
    public void patronBorrowBook(Patron patron, Book book, int numCopies) {
        patron.borrowBook(book, numCopies);
    }

    // Method to allow a patron to return a book
    public void patronReturnBook(Patron patron, Book book, int numCopies) {
        patron.returnBook(book, numCopies);
    }
}