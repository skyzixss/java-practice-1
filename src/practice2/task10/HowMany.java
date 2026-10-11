package practice2.task10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowMany {
    public static int countWords(String text) {
        // Слово в этом задании - непустая последовательность непробельных символов.
        Matcher words = Pattern.compile("\\S+", Pattern.UNICODE_CHARACTER_CLASS).matcher(text);
        int count = 0;
        while (words.find()) count++;
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.println("Введите строку:");
            String text = scanner.hasNextLine() ? scanner.nextLine() : "";
            System.out.println("Количество слов: " + countWords(text));
        }
    }
}
