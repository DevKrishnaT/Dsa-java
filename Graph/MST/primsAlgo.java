package Graph.MST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class primsAlgo {
   

    static class QueuePair {
        int wight;
        int Parent;
        int node;

        QueuePair(int wight, int node, int parent) {
            this.wight = wight;
            this.node = node;
            this.Parent = parent;
        }
    }

    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static void main(String[] args) {
        int[][] Edges = {{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};
        int V = 3;
        int E = 3;
        int ans = spanningTree(V, E, Edges);
    }

    private static int spanningTree(int V, int E, int[][] edges) {
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new Edge(v, w));
            adj.get(v).add(new Edge(u, w));
        }

        PriorityQueue<QueuePair> pq = new PriorityQueue<>((a, b) -> a.wight - b.wight);
        boolean[] visited = new boolean[V];


        int mstWeight = 0;
        pq.offer(new QueuePair(0, 0, -1));

        while (!pq.isEmpty()) {
            QueuePair curr = pq.poll();
            int wight = curr.wight;
            int node = curr.node;

            if (visited[node]) {
                continue;
            }

            visited[node] = true;
            mstWeight += wight;


            for (Edge pair : adj.get(node)) {
                int adjNode = pair.node;
                int adjWeight = pair.weight;

                if (!visited[adjNode]) {
                    pq.offer(new QueuePair(adjWeight, adjNode, node));
                }
            }
        }


        return mstWeight;

    }
}
