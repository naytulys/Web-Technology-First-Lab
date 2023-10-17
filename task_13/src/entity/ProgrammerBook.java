package entity;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result = result  + " Language = " + language
                + " Level = " + level;
       return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) object;
        return this.language.equals(programmerBook.language) &&
                this.level == programmerBook.level;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 191 * hash + (this.language != null ? this.language.hashCode() : 0);
        hash = 191 * hash + this.level;
        return hash;
    }
}
