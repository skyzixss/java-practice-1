package practice2.task05;

import java.util.Arrays;
import java.util.Objects;

public class ПитомникСобак {
    private Dog[] dogs = new Dog[2];
    private int count;

    public void addDog(Dog dog) {
        Objects.requireNonNull(dog);
        if (count == dogs.length) dogs = Arrays.copyOf(dogs, count * 2);
        dogs[count++] = dog;
    }
    public Dog[] getDogs() { return Arrays.copyOf(dogs, count); }

    public static void main(String[] args) {
        ПитомникСобак kennel = new ПитомникСобак();
        Dog dog = new Dog("Шарик", 2);
        dog.setName("Барсик");
        dog.setAge(3);
        kennel.addDog(dog);
        kennel.addDog(new Dog("Рекс", 5));
        kennel.addDog(new Dog("Луна", 1));
        for (Dog item : kennel.getDogs()) System.out.println(item);
        System.out.println(dog.getName() + ": " + dog.getAge() + " года, человеческий возраст " + dog.getHumanAge());
    }
}
