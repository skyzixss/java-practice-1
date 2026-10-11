package practice2.task07;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Автор", "Название", 2000);
        book.setAuthor("А. С. Пушкин");
        book.setTitle("Капитанская дочка");
        book.setYear(1836);
        System.out.println(book.getAuthor() + ": " + book.getTitle() + ", " + book.getYear());
        Bookshelf shelf = new Bookshelf();
        shelf.addBook(new Book("М. А. Булгаков", "Мастер и Маргарита", 1967));
        shelf.addBook(book);
        shelf.addBook(new Book("Л. Н. Толстой", "Война и мир", 1869));
        System.out.println("Книг на полке: " + shelf.getCount());
        System.out.println("Самая ранняя: " + shelf.getOldestBook());
        System.out.println("Самая поздняя: " + shelf.getNewestBook());
        shelf.sortByYear();
        System.out.println("После сортировки:");
        for (Book item : shelf.getBooks()) System.out.println(item);
    }
}
