package ru.netology;

public class StatsService {
    public int summOfAllSales(int[] sales) {
        int summSales = 0;
        for (int i = 0; i < sales.length; i++) {
            summSales = summSales + sales[i];
        }
        return summSales;
    }

    public int averageSumm(int[] sales) {
        int totalSumm = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSumm = totalSumm + sales[i];

        }
        return totalSumm / 12;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth + 1;
    }


    public int amountMonthsBelow(int[] sales) {
        int amountMonthsBelow = averageSumm(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amountMonthsBelow) {
                month++;

            }
        }
        return month;
    }

        public int amountMonthsUnder ( int[] sales){
            int amountMonthsUnder = averageSumm(sales);
            int month = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > amountMonthsUnder) {
                    month++;
                }
            }
            return month;
        }
    }



