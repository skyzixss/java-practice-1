package practice7.task05to06;

public class StringsDemo {
    public static void main(String[] args) {
        StringOperations processor = new ProcessStrings();
        String text = args.length == 0 ? "Привет, Java!" : String.join(" ", args);
        System.out.println("Строка: " + text);
        System.out.println("Количество символов: " + processor.countCharacters(text));
        System.out.println("Символы на позициях 1, 3, 5...: " + processor.oddCharacters(text));
        System.out.println("Обратная строка: " + processor.reverse(text));
    }
}
