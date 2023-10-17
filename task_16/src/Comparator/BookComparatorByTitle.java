package Comparator;

import entity.Book;

import java.util.Comparator;

public class BookComparatorByTitle implements Comparator<Book> {

    public BookComparatorByTitle() {

    }

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getTitle().compareTo(secondBook.getTitle());
    }

    @Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return Comparator.super.thenComparing(other);
    }
}
