
package ru.netology.stats;

public class averageSummSales {
    public int averageSumm(int[] sales) {
        int totalSumm = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSumm = totalSumm + sales[i];

        }
        return totalSumm / 12;
    }
}
