package ru.netology.stats;

public class amountMonthsBelowAverage {
    public int AverageSales(int[] sales) {
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum = totalSum + sales[i];
        }
        return totalSum / 12;
    }

    public int amountMonths(int[] sales) {
        int amountMonths = AverageSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amountMonths) {
                month++;

            }
        }
        return month;
    }
}

