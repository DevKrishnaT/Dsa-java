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
        System.out.println(ans);
    }

    static class Pair {
        int node;
        long cost;

        Pair(int node, long cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static final int MOD = 1_000_000_007;

    private static int countPaths(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }


        for (int[] r : roads) {

            int u = r[0];
            int v = r[1];
            int w = r[2];

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        int[] ways = new int[n];

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));

        dist[0] = 0;
        ways[0] = 1;

        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.node;
            long d = curr.cost;

            if (d > dist[node]) {
                continue;
            }

            for (Pair neigh : adj.get(node)) {

                int nextNode = neigh.node;
                long newDist = d + neigh.cost;


                if (newDist < dist[nextNode]) {

                    dist[nextNode] = newDist;

                    ways[nextNode] = ways[node];

                    pq.offer(new Pair(nextNode, newDist));
                } else if (newDist == dist[nextNode]) {

                    ways[nextNode] += ways[node] % MOD;
                }
            }
        }

        return ways[n - 1];

    }
}
