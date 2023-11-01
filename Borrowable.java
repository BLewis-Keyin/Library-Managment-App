public interface Borrowable {
    void borrow(int numCopiesToBorrow);

    void returnBook(int numCopiesToReturn);
}