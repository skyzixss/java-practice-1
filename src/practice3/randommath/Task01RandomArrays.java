package practice3.randommath;

import java.util.Arrays;
import java.util.Random;

public class Task01RandomArrays {
    public static void main(String[] args) {
        double[] mathValues = new double[10];
        double[] randomValues = new double[10];
        Random random = new Random();
        for (int i = 0; i < mathValues.length; i++) {
            mathValues[i] = Math.random();
            randomValues[i] = random.nextDouble();
        }
        System.out.println("Math.random(), до: " + Arrays.toString(mathValues));
        Arrays.sort(mathValues);
        System.out.println("Math.random(), после: " + Arrays.toString(mathValues));
        System.out.println("Random, до: " + Arrays.toString(randomValues));
        Arrays.sort(randomValues);
        System.out.println("Random, после: " + Arrays.toString(randomValues));
    }
}
