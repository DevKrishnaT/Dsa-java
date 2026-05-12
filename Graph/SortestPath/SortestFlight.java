package Graph.SortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortestFlight {


    static void main(String[] args) {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int n = 4;
        int src = 0;
        int dst = 3;
        int k = 1;
        int ans = findCheapestPrice(n, flights, src, dst, k);
        System.out.println(ans);
    }


    private static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {


        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] temp = dist.clone();
            for (int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int cost = flight[2];

                if (dist[u] != Integer.MAX_VALUE && cost + dist[u] < temp[v]) {
                    temp[v] = dist[u] + cost;
                }
            }

            dist = temp;
        }
        

        return dist[dst] == Integer.MAX_VALUE
                ? -1
                : dist[dst];

    }
}
