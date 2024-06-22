package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class amountMonthsUnderAverageTest {
    @Test
    public void test() {
        amountMonthsUnderAverage service = new amountMonthsUnderAverage();
        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.amountMonths(sales);
        Assertions.assertEquals(expected, actuall);
    }
}
