package practice7.task05to06;

public class ProcessStrings implements StringOperations {
    @Override
    public int countCharacters(String text) {
        return text.codePointCount(0, text.length());
    }

    @Override
    public String oddCharacters(String text) {
        // Позиции 1, 3, 5 считаются с единицы; это индексы 0, 2, 4.
        int[] characters = text.codePoints().toArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < characters.length; i += 2) result.appendCodePoint(characters[i]);
        return result.toString();
    }

    @Override
    public String reverse(String text) { return new StringBuilder(text).reverse().toString(); }
}
