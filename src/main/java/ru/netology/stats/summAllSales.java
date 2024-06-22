package ru.netology.stats;

public class summAllSales {
    public int summOfAllSales(int[] sales) {
        int summSales = 0;
        for (int i = 0; i < sales.length; i++) {
            summSales = summSales + sales[i];
        }
        return summSales;
    }
}
