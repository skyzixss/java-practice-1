package practice3.randommath;

import java.util.Arrays;
import java.util.Random;

public class Task03IncreasingArray {
    public static boolean isStrictlyIncreasing(int[] values) {
        for (int i = 1; i < values.length; i++) {
            if (values[i] <= values[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] values = new int[4];
        for (int i = 0; i < values.length; i++) values[i] = 10 + random.nextInt(90);
        System.out.println(Arrays.toString(values));
        System.out.println(isStrictlyIncreasing(values)
                ? "Массив строго возрастает." : "Массив не является строго возрастающим.");
    }
}
