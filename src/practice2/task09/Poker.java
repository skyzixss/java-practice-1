package practice2.task09;

import common.ConsoleInput;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static String[] createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        String[] suits = {"пики", "червы", "бубны", "трефы"};
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) deck[index++] = rank + " " + suit;
        }
        return deck;
    }

    public static String[][] deal(int players, Random random) {
        if (players < 1 || players > 10) throw new IllegalArgumentException("Нужно от 1 до 10 игроков.");
        String[] deck = createDeck();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temporary = deck[i];
            deck[i] = deck[j];
            deck[j] = temporary;
        }
        String[][] hands = new String[players][5];
        int next = 0;
        for (int card = 0; card < 5; card++) {
            for (int player = 0; player < players; player++) hands[player][card] = deck[next++];
        }
        return hands;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            int n = new ConsoleInput(scanner).readInt("Количество игроков (1-10):", 1, 10);
            String[][] hands = deal(n, new Random());
            for (int player = 0; player < n; player++) {
                System.out.println("Игрок " + (player + 1) + ":");
                for (String card : hands[player]) System.out.println(card);
                System.out.println();
            }
        } catch (NoSuchElementException error) {
            System.out.println("Ввод завершён.");
        }
    }
}
