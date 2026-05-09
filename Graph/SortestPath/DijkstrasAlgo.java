package Graph.SortestPath;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgo {

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    static void main(String[] args) {

        int V = 3;
        int S = 0;

        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }


        ArrayList<Integer> edge1 = new ArrayList<>();
        edge1.add(1);
        edge1.add(1);
        adj.get(0).add(edge1);


        ArrayList<Integer> edge2 = new ArrayList<>();
        edge2.add(2);
        edge2.add(6);
        adj.get(0).add(edge2);


        ArrayList<Integer> edge3 = new ArrayList<>();
        edge3.add(2);
        edge3.add(3);
        adj.get(1).add(edge3);

        int[] ans = shortestPath(V, adj, S);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    private static int[] shortestPath(
            int V,
            ArrayList<ArrayList<ArrayList<Integer>>> adj,
            int s
    ) {

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((x, y) -> x.distance - y.distance);

        int[] dist = new int[V];

        for (int i = 0; i < V; i++) {
            dist[i] = (int) 1e9;
        }

        dist[s] = 0;

        pq.add(new Pair(s, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            int node = current.node;
            int dis = current.distance;

            for (int i = 0; i < adj.get(node).size(); i++) {

                int adjNode = adj.get(node).get(i).get(0);
                int edgeWeight = adj.get(node).get(i).get(1);

                if (dis + edgeWeight < dist[adjNode]) {

                    dist[adjNode] = dis + edgeWeight;

                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        return dist;
    }
}