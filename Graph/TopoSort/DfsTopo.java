package Graph.TopoSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DfsTopo {
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

        Stack<Integer> stack = new Stack<>();
        int[] state = new int[V];
        for (int i = 0; i < V; i++) {
            if (dfs(i, stack, state, graph)) {
                stack.push(i);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

    private static boolean dfs(int i, Stack<Integer> stack, int[] state, List<List<Integer>> graph) {
        if (state[i] != 0) {
            return state[i] == 2;
        }

        state[i] = 1;
        for (int nigh : graph.get(i)) {
            if (!dfs(nigh, stack, state, graph)) {
                return false;
            }
        }

        state[i] = 2;
        return true;
    }
}
