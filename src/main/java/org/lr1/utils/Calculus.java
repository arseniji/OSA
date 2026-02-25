package org.lr1.utils;

public class Calculus {

    public static String estimate(int[] sizes, long[] operations) {

        int count = 0;
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;

        for (int i = 0; i < sizes.length; i++) {

            if (operations[i] <= 0) continue; // защита от log(0)

            double x = Math.log(sizes[i]);
            double y = Math.log(operations[i]);

            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;

            count++;
        }

        if (count < 2) {
            return "Недостаточно данных";
        }

        double k = (count * sumXY - sumX * sumY) /
                (count * sumX2 - sumX * sumX);

        if (!Double.isFinite(k)) {
            return "Не определяется";
        }

        return classify(k);
    }

    private static String classify(double k) {

        if (k < 0.2) return "O(1)";
        if (k < 1.3) return "O(n)";
        if (k < 1.7) return "O(n log n)";
        if (k < 2.3) return "O(n^2)";
        if (k < 3.3) return "O(n^3)";

        return String.format("O(n^%.2f)", k);
    }
}
