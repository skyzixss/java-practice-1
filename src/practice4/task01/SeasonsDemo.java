package practice4.task01;

import java.util.Locale;

public class SeasonsDemo {
    public static void printLove(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
            default: throw new IllegalArgumentException("Неизвестное время года.");
        }
    }

    private static void printSeason(Season season) {
        System.out.printf(Locale.US, "%s: средняя температура %.1f °C; %s%n",
                season.getTitle(), season.getAverageTemperature(), season.getDescription());
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года:");
        printSeason(favorite);
        printLove(favorite);
        System.out.println("Все времена года (температуры заданы для примера):");
        for (Season season : Season.values()) printSeason(season);
    }
}
