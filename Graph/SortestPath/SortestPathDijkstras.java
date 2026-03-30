package Graph.SortestPath;

import java.util.*;

public class SortestPathDijkstras {

    static class Pair implements Comparable<Pair> {
        int weight;
        int node;

        Pair(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }

        public int compareTo(Pair other) {
            return this.weight - other.weight;
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2, 2}, {2, 5, 5}, {2, 3, 4}, {1, 4, 1}, {4, 3, 3}, {3, 5, 1}};
        int n = 5;
        int m = 6;

        SortestPathDijkstras obj = new SortestPathDijkstras();
        List<Integer> ans = obj.shortestPath(edges, m, n);

        System.out.println(ans);
    }

    private List<Integer> shortestPath(int[][] edges, int m, int n) {
        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            graph.get(u).add(new Pair(weight, v));
            graph.get(v).add(new Pair(weight, u));
        }

        int[] dist = new int[n + 1];
        int[] prt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prt[i] = i;
        }
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> queue = new PriorityQueue<>();

        queue.add(new Pair(0, 1));
        dist[1] = 0;

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();

            int node = pair.node;
            int weight = pair.weight;

            if (weight > dist[node]) continue;

            for (Pair neigh : graph.get(node)) {
                int nextNode = neigh.node;
                int nextWeight = neigh.weight;

                if (weight + nextWeight < dist[nextNode]) {
                    dist[nextNode] = weight + nextWeight;
                    prt[nextNode] = node;
                    queue.add(new Pair(dist[nextNode], nextNode));
                }
            }
        }
        if (dist[n] == Integer.MAX_VALUE) {
            return Arrays.asList(-1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int curr = n;

        while (prt[curr] != curr) {
            list.add(curr);
            curr = prt[curr];
        }
        list.add(1);

        Collections.reverse(list);

        list.add(0, dist[n]);

        return list;
    }
}