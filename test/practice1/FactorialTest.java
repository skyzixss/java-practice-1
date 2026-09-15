package practice1;

/** Проверка метода factorial без сторонних библиотек. */
public class FactorialTest {
    public static void main(String[] args) {
        int[] inputs = {0, 1, 2, 5, 10, 20};
        long[] expected = {1, 1, 2, 120, 3628800, 2432902008176640000L};
        for (int i = 0; i < inputs.length; i++) {
            long actual = Task07Factorial.factorial(inputs[i]);
            if (actual != expected[i]) {
                throw new AssertionError("Неверный факториал для " + inputs[i]);
            }
        }
        int[] invalid = {-1, 21};
        for (int n : invalid) {
            try {
                Task07Factorial.factorial(n);
                throw new AssertionError("Ожидалась ошибка для " + n);
            } catch (IllegalArgumentException expectedError) {
                // Метод правильно отклонил недопустимое значение.
            }
        }
        System.out.println("Пройдено 8 проверок метода factorial.");
    }
}
