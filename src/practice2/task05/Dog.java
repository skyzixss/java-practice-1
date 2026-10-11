package practice2.task05;

public final class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) { setName(name); setAge(age); }
    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Нужна кличка.");
        this.name = name;
    }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        this.age = age;
    }
    public long getHumanAge() { return age * 7L; }

    @Override
    public String toString() {
        return "Dog[name=" + name + ", age=" + age + ", humanAge=" + getHumanAge() + "]";
    }
}
