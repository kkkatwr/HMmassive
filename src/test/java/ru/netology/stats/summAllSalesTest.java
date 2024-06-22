package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class summAllSalesTest {

    @Test
    public void test() {
        summAllSales service = new summAllSales();
        int expected = 180;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.summOfAllSales(sales);
        Assertions.assertEquals(expected, actuall);
    }


}
