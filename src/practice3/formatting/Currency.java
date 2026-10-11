package practice3.formatting;

import java.math.BigDecimal;

/** Условные учебные курсы: стоимость одной единицы валюты в рублях. */
public enum Currency {
    RUB("1"), USD("90"), EUR("100");

    private final BigDecimal rublesPerUnit;

    Currency(String rate) { this.rublesPerUnit = new BigDecimal(rate); }
    public BigDecimal getRublesPerUnit() { return rublesPerUnit; }
}
