package Graph.SortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class CountDestination {
    static void main(String[] args) {
        int[][] roads = {{0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}};
        int n = 7;
        int ans = countPaths(n, roads);
    }

    static class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    private static int countPaths(int n, int[][] roads) {
        List<List<Pair>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] t : roads) {

            int u = t[0];
            int v = t[1];
            int w = t[2];

            list.get(u).add(new Pair(v, w));
        }

        PriorityQueue<networkDelay.Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);


        pq.offer(new networkDelay.Pair(0, 0));


    }
}
