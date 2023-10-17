package entity;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book() {

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: Title = '" + title + '\'' + " Author = '" + author + '\'' + " Price = " + price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                this.price == book.price;
    }

    @Override
    public int hashCode() {
        int hash = 137;
        hash = 191 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 191 * hash + (this.author != null ? this.author.hashCode() : 0);
        hash = 191 * hash + this.price;
        return hash;
    }
}
