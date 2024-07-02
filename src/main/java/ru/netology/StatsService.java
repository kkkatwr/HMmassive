package ru.netology;

public class StatsService {
    public long summOfAllSales(long[] sales) {
        long summSales = 0;
        for (int i = 0; i < sales.length; i++) {
            summSales = summSales + sales[i];
        }
        return summSales;
    }

    public long averageSumm(long[] sales) {
        long totalSumm = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSumm = totalSumm + sales[i];

        }
        return totalSumm / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth + 1;
    }


    public int amountMonthsBelow(long[] sales) {
        long amountMonthsBelow = averageSumm(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amountMonthsBelow) {
                month++;

            }
        }
        return month;
    }

    public int amountMonthsUnder(long[] sales) {
        long amountMonthsUnder = averageSumm(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amountMonthsUnder) {
                month++;
            }
        }
        return month;
    }
}



