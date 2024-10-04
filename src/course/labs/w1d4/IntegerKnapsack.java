package course.labs.w1d4;

import java.util.ArrayList;
import java.util.List;

public class IntegerKnapsack {

    public static void knapsack(int[] values, int[] weights, int W_max) {
        int n = values.length;

        int[][] dp = new int[n + 1][W_max + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W_max; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        int maxValue = dp[n][W_max];
        System.out.println("Maximum value: " + maxValue);

        List<Integer> includedItems = new ArrayList<>();
        int w = W_max;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                includedItems.add(i);
                w -= weights[i - 1];
            }
        }

        System.out.println("Items included in the knapsack:");
        for (int item : includedItems) {
            System.out.println("Item " + item + " (value: " + values[item - 1] + ", weight: " + weights[item - 1] + ")");
        }
    }

    public static void main(String[] args) {
        int[] values = {25, 12, 24, 16, 28};
        int[] weights = {5, 6, 8, 2, 7};
        int W_max = 20;

        knapsack(values, weights, W_max);
    }

}
