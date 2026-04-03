package Graph.SortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkastrasAlgo {
    void main(String[] args) {
        int[] arr = new int[6];
        int[][] edges = {{1, 2, 2}, {2, 5, 5}, {2, 3, 4}, {1, 4, 1}, {4, 3, 3}, {3, 5, 1}};
        int v = 6;
        int s = 1;


        System.out.println(Arrays.toString(arr));
        int[] ans = dijkstra(v, edges, s);
        System.out.println(Arrays.toString(ans));
    }

    private int[] dijkstra(int V, int[][] edges, int s) {
        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            graph.get(u).add(new Pair(weight, v));
            graph.get(v).add(new Pair(weight, u));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);

        dist[s] = 0;
        pq.add(new Pair(0, s));

        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int distance = pq.peek().distance;
            pq.poll();
            if (distance > dist[node]) continue;
            for (Pair neigh : graph.get(node)) {
                int adjNode = neigh.node;
                int edgeWeight = neigh.distance;
                if (distance + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = distance + adjNode;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }

        }

        return Arrays.copyOfRange(dist, 1, dist.length);
    }

    class Pair {
        int node, distance;

        Pair(int distance, int node) {
            this.node = node;
            this.distance = distance;
        }
    }
}
