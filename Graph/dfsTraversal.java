package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class dfsTraversal {
    void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }


        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(2);
        adj.get(4).add(2);
        ArrayList<Integer> ans = dfsWithrecursion(adj);
        System.out.println(ans);
    }

    private ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[adj.size()];
        stack.add(0);
        visited[0] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            ans.add(node);
            for (int num : adj.get(node)) {
                if (!visited[num]) {
                    visited[num] = true;
                    stack.add(num);
                }
            }
        }


        return ans;
    }

    ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> dfsWithrecursion(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        dfsHelper(0, new boolean[n], adj);
        return ans;
    }

    private void dfsHelper(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        ans.add(node);

        for (int num : adj.get(node)) {
            if (!visited[num]) {
                dfsHelper(num, visited, adj);
            }
        }
    }

}
