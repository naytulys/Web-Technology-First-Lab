package Comparator;

import entity.Book;

import java.util.Comparator;

public class BookComparatorByAuthor implements Comparator<Book> {

    public BookComparatorByAuthor() {

    }

    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getAuthor().compareTo(secondBook.getAuthor());
    }

    @Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return Comparator.super.thenComparing(other);
    }
}
