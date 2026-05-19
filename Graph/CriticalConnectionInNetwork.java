package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnectionInNetwork {
    static List<List<Integer>> bridges = new ArrayList<>();
    static int time = 0;

    static void main(String[] args) {
        List<List<Integer>> connections = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2), Arrays.asList(2, 0), Arrays.asList(1, 3));
        int n = 4;
        List<List<Integer>> ans = criticalConnections(n, connections);
        System.out.println(ans);

    }

    private static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();

        }

        for (List<Integer> edge : connections) {
            int u = edge.get(0);
            int v = edge.get(1);
            adj[u].add(v);
            adj[v].add(u);
        }

        int[] tin = new int[n];
        int[] low = new int[n];
        boolean[] visited = new boolean[n];

        dfs(0, -1, tin, low, visited, adj);

        return bridges;
    }

    private static void dfs(int u, int parent, int[] tin, int[] low, boolean[] visited, List<Integer>[] adj) {
        visited[u] = true;
        tin[u] = low[u] = time++;
        for (int v : adj[u]) {


            if (v == parent) {
                continue;
            }


            if (visited[v]) {

                low[u] = Math.min(low[u], tin[v]);

            } else {

                dfs(v, u, tin, low, visited, adj);

                low[u] = Math.min(low[u], low[v]);


                if (low[v] > tin[u]) {

                    bridges.add(Arrays.asList(u, v));
                }
            }
        }
    }
}
