package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class peakSalesTest {
    @Test
    public void test (){
        peakSales service = new peakSales();
        int expected = 8;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.maxSales(sales);
        Assertions.assertEquals(expected, actuall);
    }
}
