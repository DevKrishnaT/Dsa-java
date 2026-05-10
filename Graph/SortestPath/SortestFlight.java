package Graph.SortestPath;

import java.util.PriorityQueue;

public class SortestFlight {
    class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static void main(String[] args) {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int n = 4;
        int src = 0;
        int dst = 3;
        int k = 1;
        int ans = findCheapestPrice(n, flights, src, dst, k);
    }

    private static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if (dst == src) return 0;

        if (n == 1) return -1;

        return -1;

    }
}
