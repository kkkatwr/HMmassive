package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class amountMonthsBelowAverageTest {

    @Test
    public void test() {
        amountMonthsBelowAverage service = new amountMonthsBelowAverage();
        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.amountMonths(sales);
        Assertions.assertEquals(expected, actuall);
    }
}
