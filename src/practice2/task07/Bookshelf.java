package practice2.task07;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books = new Book[2];
    private int count;

    /** Композиция: полка владеет собственными экземплярами книг. */
    public void addBook(Book book) {
        if (count == books.length) books = Arrays.copyOf(books, count * 2);
        books[count++] = new Book(book);
    }
    public int getCount() { return count; }
    public Book[] getBooks() {
        Book[] result = new Book[count];
        for (int i = 0; i < count; i++) result[i] = new Book(books[i]);
        return result;
    }

    public Book getOldestBook() {
        if (count == 0) throw new IllegalStateException("Полка пуста.");
        Book oldest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < oldest.getYear()) oldest = books[i];
        }
        return new Book(oldest);
    }

    public Book getNewestBook() {
        if (count == 0) throw new IllegalStateException("Полка пуста.");
        Book newest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > newest.getYear()) newest = books[i];
        }
        return new Book(newest);
    }

    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temporary = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temporary;
                }
            }
        }
    }
}
