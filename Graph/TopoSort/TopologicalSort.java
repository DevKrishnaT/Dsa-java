package Graph.TopoSort;

import java.util.*;

public class TopologicalSort {
    static void main(String[] args) {
        int[][] edges = {{3, 0}, {1, 0}, {2, 0}};
        int V = 4;
        ArrayList<Integer> topo = topoSort(V, edges);
        System.out.println(topo);
    }

    private static ArrayList<Integer> topoSort(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] num : edges) {
            int v = num[1];
            int u = num[0];
            graph.get(u).add(v);
        }


        int[] state = new int[V];
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < V; i++) {
            if (state[i] == 0) {
                if (dfs(state, stack, i, graph)) return new ArrayList<>();
            }
        }
        ArrayList<Integer> topoSorted = new ArrayList<>();

        while (!stack.isEmpty()) {
            topoSorted.add(stack.pop());
        }

        return topoSorted;
    }

    private static boolean dfs(int[] state, Stack<Integer> stack, int node, List<List<Integer>> graph) {
        if (state[node] == 1) return true;
        if (state[node] == 2) return false;


        state[node] = 1;

        for (int neigh : graph.get(node)) {
            if (state[neigh] == 1) return true;
            if (state[neigh] == 0) {
                if (dfs(state, stack, neigh, graph)) return true;
            }


        }

        state[node] = 2;
        stack.push(node);

        return false;
    }


}
