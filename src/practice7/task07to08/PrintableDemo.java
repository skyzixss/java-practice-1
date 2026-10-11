package practice7.task07to08;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] items = {
            new Book("Капитанская дочка"), new Magazine("Наука и жизнь"),
            new Book("Война и мир"), new Magazine("Вокруг света")
        };
        System.out.println("Все издания:");
        for (Printable item : items) item.print();
        System.out.println("Только журналы:");
        Magazine.printMagazines(items);
        System.out.println("Только книги:");
        Book.printBooks(items);
    }
}
