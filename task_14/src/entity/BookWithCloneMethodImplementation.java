package entity;


public class BookWithCloneMethodImplementation extends Book {

    public BookWithCloneMethodImplementation(String title, String author, int price) {
        super(title, author, price);
    }

    public BookWithCloneMethodImplementation() {

    }

    @Override
    public BookWithCloneMethodImplementation clone() {
        BookWithCloneMethodImplementation book = new BookWithCloneMethodImplementation();
        book.setTitle(this.getTitle());
        book.setAuthor(this.getAuthor());
        book.setPrice(this.getPrice());
        return book;
    }
}
