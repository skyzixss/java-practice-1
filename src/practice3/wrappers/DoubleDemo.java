package practice3.wrappers;

public class DoubleDemo {
    public static void main(String[] args) {
        Double first = Double.valueOf(65.75);
        Double second = Double.valueOf("12.5");
        double parsed = Double.parseDouble("3.14");
        System.out.println("valueOf(double): " + first);
        System.out.println("valueOf(String): " + second);
        System.out.println("parseDouble: " + parsed);
        System.out.println("byte: " + first.byteValue());
        System.out.println("short: " + first.shortValue());
        System.out.println("int: " + first.intValue());
        System.out.println("long: " + first.longValue());
        System.out.println("float: " + first.floatValue());
        System.out.println("double: " + first.doubleValue());
        char character = (char) first.doubleValue();
        System.out.println("char (явное приведение): " + character);
        // Прямое приведение Double/double к boolean в Java запрещено.
        boolean nonZero = first.doubleValue() != 0.0;
        System.out.println("boolean (результат сравнения с нулём): " + nonZero);
        System.out.println("Объект Double: " + first);
        String d = Double.toString(3.14);
        System.out.println("Double.toString(3.14): " + d);
    }
}
