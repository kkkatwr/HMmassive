package ru.netology.stats;

public class amountMonthsUnderAverage {
    public int averageSales(int[] sales) {
        int totalSumm = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSumm = totalSumm + sales[i];

        }
        return totalSumm / 12;

    }

    public int amountMonths(int[] sales) {
        int amountMonths = averageSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amountMonths) {
                month++;
            }
        }
        return month;
    }
}
