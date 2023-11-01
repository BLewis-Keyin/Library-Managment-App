public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numCopies;
    private Status status;

    public Book(String title, Author author, String ISBN, String publisher, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numCopies = numCopies;
        this.status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }
    
      public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
    // Getters and setters for all properties

    @Override
    public void borrow(int numCopiesToBorrow) {
        if (status == Status.AVAILABLE && numCopies >= numCopiesToBorrow) {
            numCopies -= numCopiesToBorrow;
            status = numCopies > 0 ? Status.CHECKED_OUT : Status.AVAILABLE;
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    @Override
    public void returnBook(int numCopiesToReturn) {
        if (status == Status.CHECKED_OUT) {
            numCopies += numCopiesToReturn;
            status = numCopies > 0 ? Status.CHECKED_OUT : Status.AVAILABLE;
        } else {
            System.out.println("Invalid return operation. The book is not checked out.");
        }
    }
}