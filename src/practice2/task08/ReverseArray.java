package practice2.task08;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(String[] values) {
        for (int left = 0, right = values.length - 1; left < right; left++, right--) {
            String temporary = values[left];
            values[left] = values[right];
            values[right] = temporary;
        }
    }

    public static void main(String[] args) {
        String[] words = {"один", "два", "три", "четыре", "пять"};
        System.out.println("До: " + Arrays.toString(words));
        reverse(words);
        System.out.println("После: " + Arrays.toString(words));
    }
}
