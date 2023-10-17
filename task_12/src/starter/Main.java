package starter;

import entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("EFG", "Маша", 142));
        books.add(new Book("DEF", "Саша", 115));
        books.add(new Book("EFG", "Маша", 143));
        books.add(new Book("QWE", "Вася", 333));
        books.add(new Book("GHJ", "Петя", 231));
        Book book = books.get(0);
        System.out.println(book.toString());
        System.out.println(book.hashCode());
        System.out.println(book.equals(books.get(2)));
    }
}
