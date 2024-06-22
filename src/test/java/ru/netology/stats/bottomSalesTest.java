
package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class bottomSalesTest {
    @Test
    public void test() {
        bottomSales service = new bottomSales();
        int expected = 9;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.minSales(sales);
        Assertions.assertEquals(expected, actuall);
    }
}

