package Graph;

import java.util.Arrays;

public class IsBipartite {
    void main(String[] args) {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        boolean ans = isBipartite(graph);
        System.out.println(ans);
    }

    private boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!dfs(graph, color, i, 0)) return false;
            }
        }
        return true;
    }

    private boolean dfs(int[][] graph, int[] color, int node, int col) {
        color[node] = col;

        for (int nei : graph[node]) {
            if (color[nei] == -1) {
                if (!dfs(graph, color, nei, 1 - col)) return false;
            } else if (color[nei] == col) {
                return false;
            }
        }
        return true;
    }
}
