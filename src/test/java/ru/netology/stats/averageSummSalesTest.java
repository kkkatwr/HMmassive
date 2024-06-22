package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class averageSummSalesTest {
    @Test
    public void test() {
        averageSummSales service = new averageSummSales();
        int expected = 15;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.averageSumm(sales);
        Assertions.assertEquals(expected, actuall);
    }
}

