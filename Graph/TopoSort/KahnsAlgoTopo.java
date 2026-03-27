package Graph.TopoSort;

import java.util.*;

public class KahnsAlgoTopo {
    static void main(String[] args) {
        int[][] edges = {{3, 0}, {1, 0}, {2, 0}};
        int V = 4;
        ArrayList<Integer> Topo = kahnsTopoSort(V, edges);
    }

    private static ArrayList<Integer> kahnsTopoSort(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[V];


        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo.add(node);
            for (int neigh : graph.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0) {
                    queue.add(neigh);
                }
            }
        }

        if (topo.size() != V) {
            return new ArrayList<>();
        }

        return topo;
    }
}
