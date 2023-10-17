package Comparator;

import entity.Book;

import java.util.Comparator;

public class BookComparatorByPrice  implements Comparator<Book> {

    public BookComparatorByPrice() {

    }

    @Override
    public int compare(Book first, Book second) {
        return Integer.compare(first.getPrice(), second.getPrice());
    }

    @Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return Comparator.super.thenComparing(other);
    }
}
