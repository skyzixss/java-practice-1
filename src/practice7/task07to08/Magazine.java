package practice7.task07to08;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) { this.title = title; }
    public String getTitle() { return title; }
    @Override public void print() { System.out.println(title); }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println(magazine.getTitle());
            }
        }
    }
}
