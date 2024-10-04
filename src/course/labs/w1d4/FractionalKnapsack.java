package course.labs.w1d4;

import java.util.Arrays;

public class FractionalKnapsack {
    // A class to represent an item with its value, weight, and value-to-weight ratio
    static class Item {
        int value, weight;
        double ratio;

        // Constructor
        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    // Function to solve the fractional knapsack problem
    public static double fractionalKnapsack(Item[] items, int W_max) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (i1, i2) -> Double.compare(i2.ratio, i1.ratio));

        double totalValue = 0.0;
        int remainingWeight = W_max;

        // Loop through the sorted items
        for (Item item : items) {
            if (remainingWeight >= item.weight) {
                // Take the entire item if possible
                totalValue += item.value;
                remainingWeight -= item.weight;
                System.out.println("Taking full item with value: " + item.value + " and weight: " + item.weight);
            } else {
                // Take the fractional part of the item
                double fraction = (double) remainingWeight / item.weight;
                totalValue += item.value * fraction;
                System.out.println("Taking " + (fraction * 100) + "% of item with value: " + item.value + " and weight: " + item.weight);
                break; // Knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        // Given values and weights of items
        int[] values = {25, 12, 24, 16, 28};
        int[] weights = {5, 6, 8, 2, 7};
        int W_max = 20;  // Maximum weight of the knapsack

        // Create array of Item objects
        Item[] items = new Item[values.length];
        for (int i = 0; i < values.length; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // Solve the fractional knapsack problem
        double maxValue = fractionalKnapsack(items, W_max);

        // Print the maximum value
        System.out.println("Maximum value in the knapsack = " + maxValue);
    }
}
