package starter;

import entity.ProgrammerBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProgrammerBook> programmerBooks = new ArrayList<>();
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Jav", "Herbert Schildt", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildta", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 201, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "english", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 101));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 100));
        ProgrammerBook comparisonProgBook = programmerBooks.get(0);
        for (ProgrammerBook programmerBook : programmerBooks) {
            System.out.println(comparisonProgBook.equals(programmerBook));
            System.out.println(comparisonProgBook.hashCode() == programmerBook.hashCode());
            System.out.println(programmerBook);
        }
    }
}
