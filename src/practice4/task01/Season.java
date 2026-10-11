package practice4.task01;

public enum Season {
    WINTER("Зима", -10),
    SPRING("Весна", 10),
    SUMMER("Лето", 25) {
        @Override
        public String getDescription() { return "Теплое время года"; }
    },
    AUTUMN("Осень", 8);

    private final String title;
    private final double averageTemperature;

    Season(String title, double averageTemperature) {
        this.title = title;
        this.averageTemperature = averageTemperature;
    }

    public String getTitle() { return title; }
    public double getAverageTemperature() { return averageTemperature; }
    public String getDescription() { return "Холодное время года"; }
}
