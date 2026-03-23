package Graph;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
    static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        int V = 4;
        boolean ans = isCycle(edges, V);
        System.out.println(ans);
    }

    private static boolean isCycle(int[][] edges, int V) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int v = edge[1];
            int u = edge[0];
            graph.get(v).add(u);
            graph.get(u).add(v);
        }
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {

                if (dfs(i, -1, graph, visited)) {
                    return true;
                }

            }
        }
        return false;

    }


    private static boolean dfs(int node, int parent, List<List<Integer>> graph, boolean[] visited) {

        visited[node] = true;

        for (int neighber : graph.get(node)) {
            if (!visited[neighber]) {
                if (dfs(neighber, node, graph, visited)) {
                    return true;
                }
            } else if (neighber != parent) {
                return true;
            }
        }
        return false;
    }


}
