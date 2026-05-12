package Graph.SortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class networkDelay {
    static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        int ans = networkDelayTime(times, n, k);
        System.out.println(ans);
    }

    static class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    private static int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] t : times) {

            int u = t[0];
            int v = t[1];
            int w = t[2];

            list.get(u).add(new Pair(v, w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        int[] dist = new int[n + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        pq.offer(new Pair(k, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            int time = curr.cost;

            if (time > dist[node]) {
                continue;
            }
            for (Pair nei : list.get(node)) {

                int newTime = time + nei.cost;

                if (newTime < dist[nei.node]) {

                    dist[nei.node] = newTime;

                    pq.offer(
                            new Pair(nei.node, newTime)
                    );
                }
            }

        }
        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            ans = Math.max(ans, dist[i]);
        }

        return ans;

    }
}
