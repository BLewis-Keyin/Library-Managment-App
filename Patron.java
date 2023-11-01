import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters

    public void borrowBook(Book book, int numCopies) {
        book.borrow(numCopies);
        borrowedBooks.add(book);
    }

    public void returnBook(Book book, int numCopies) {
        book.returnBook(numCopies);
        borrowedBooks.remove(book);
    }
}