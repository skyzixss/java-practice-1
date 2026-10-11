package practice2.task04;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Shop {
    private Computer[] computers = new Computer[4];
    private int count;

    public void addComputer(Computer computer) {
        Objects.requireNonNull(computer);
        if (findById(computer.getId()) != null) {
            throw new IllegalArgumentException("Компьютер с таким номером уже есть.");
        }
        if (count == computers.length) computers = Arrays.copyOf(computers, count * 2);
        computers[count++] = computer;
    }

    public boolean removeComputer(int id) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getId() == id) {
                System.arraycopy(computers, i + 1, computers, i, count - i - 1);
                computers[--count] = null;
                return true;
            }
        }
        return false;
    }

    public Computer findById(int id) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getId() == id) return computers[i];
        }
        return null;
    }

    public Computer[] search(String query) {
        String key = query.toLowerCase(Locale.ROOT);
        Computer[] found = new Computer[count];
        int size = 0;
        for (int i = 0; i < count; i++) {
            String name = computers[i].getBrand() + " " + computers[i].getModel();
            if (name.toLowerCase(Locale.ROOT).contains(key)) found[size++] = computers[i];
        }
        return Arrays.copyOf(found, size);
    }

    public Computer[] getComputers() { return Arrays.copyOf(computers, count); }
    public int getCount() { return count; }
}
