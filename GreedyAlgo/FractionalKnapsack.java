package GreedyAlgo;

import java.util.*;

class Item {
    int value;
    int weight;
    double ratio;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        ;
        this.ratio = (double) value / weight;


    }

    static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;
        double result = fractionalKnapsack(val, wt, capacity);
        System.out.println(result);
    }

    private static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);

        }
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double result = 0;

        for (Item item : items) {
            if (capacity == 0) break;
            if (item.weight <= capacity) {
                result += item.value;
                capacity -= item.weight;
            } else {
                result += item.value * ((double) capacity / item.weight);
                capacity = 0;
            }
        }
        return Math.round(result * 1_000_000.0) / 1_000_000.0;

    }
}
