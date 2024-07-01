package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatsService;

public class StatsServiceTest {

    @Test
    public void summOfAllSalesTest() {

        StatsService service = new StatsService();
        int expected = 180;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.summOfAllSales(sales);
        Assertions.assertEquals(expected, actuall);

    }

    @Test
    public void averageSummTest() {

        StatsService service = new StatsService();
        int expected = 15;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.averageSumm(sales);
        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void maxSalestest() {
        StatsService service = new StatsService();
        int expected = 8;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.maxSales(sales);
        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void minSalestest() {
        StatsService service = new StatsService();
        int expected = 9;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.minSales(sales);
        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void amountMonthsBelowtest() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.amountMonthsBelow(sales);
        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void amountMonthsUndertest() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.amountMonthsUnder(sales);
        Assertions.assertEquals(expected, actuall);
    }
}