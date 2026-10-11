package practice7.task07to08;

public class Book implements Printable {
    private final String title;

    public Book(String title) { this.title = title; }
    public String getTitle() { return title; }
    @Override public void print() { System.out.println(title); }

    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println(book.getTitle());
            }
        }
    }
}
