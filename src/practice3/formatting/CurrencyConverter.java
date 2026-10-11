package practice3.formatting;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {
    public BigDecimal convert(BigDecimal amount, Currency from, Currency to) {
        if (amount.signum() < 0) throw new IllegalArgumentException("Сумма не может быть отрицательной.");
        return amount.multiply(from.getRublesPerUnit())
                .divide(to.getRublesPerUnit(), 2, RoundingMode.HALF_UP);
    }
}
