package entity;

public class ComparableBook extends Book implements Comparable<ComparableBook> {
    private int isbn;

    public ComparableBook(String title, String author, int price, int isbn) {
        super(title, author, price);
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(ComparableBook comparableBook) {
        return Integer.compare(this.isbn, comparableBook.isbn);
    }

    @Override
    public String toString() {
        return super.toString() + "isbn = " + this.isbn;
    }
}
