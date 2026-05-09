package Graph.SortestPath;

import java.util.ArrayList;
import java.util.TreeSet;

public class usingSet {
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

    private static int[] shortestPath(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        TreeSet<DijkstrasAlgo.Pair> set = new TreeSet<>();
        int[] dist = new int[V];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = (int) (1e9);
        }

        dist[S] = 0;
        set.add(new DijkstrasAlgo.Pair(S, 0));
        while (!set.isEmpty()) {
            DijkstrasAlgo.Pair current = set.pollFirst();
            int dis = current.distance;
            int node = current.node;

            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjNode = adj.get(node).get(i).get(0);
                int adjNodeDis = adj.get(node).get(i).get(1);

                if (dis + adjNodeDis < dist[adjNode]) {
                    if (dist[adjNode] != (int) (1e9)) {
                        set.remove(new DijkstrasAlgo.Pair(dist[adjNode], adjNode));
                    }

                    dist[adjNode] = dis + adjNodeDis;

                    set.add(new DijkstrasAlgo.Pair(dist[adjNode], adjNode));
                }
            }

        }
        return dist;
    }
}
