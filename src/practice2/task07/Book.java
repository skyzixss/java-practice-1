package practice2.task07;

public final class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) { setAuthor(author); setTitle(title); setYear(year); }
    public Book(Book other) { this(other.author, other.title, other.year); }
    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author == null || author.isBlank()) throw new IllegalArgumentException("Нужен автор.");
        this.author = author;
    }
    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("Нужно название.");
        this.title = title;
    }
    public int getYear() { return year; }
    public void setYear(int year) {
        if (year <= 0) throw new IllegalArgumentException("Год должен быть положительным.");
        this.year = year;
    }

    @Override
    public String toString() { return author + ", «" + title + "», " + year; }
}
