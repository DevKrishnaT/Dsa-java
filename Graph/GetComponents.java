package Graph;

import java.util.ArrayList;

public class GetComponents {
    static void main(String[] args) {
        int[][] edges = {{0, 1}, {2, 1}, {3, 4}};
        int v = 7;
        ArrayList<ArrayList<Integer>> ans = getComponents(v, edges);
        System.out.println(ans);

    }

    private static ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> grapgh = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            grapgh.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int v = edge[1];
            int u = edge[0];
            grapgh.get(v).add(u);
            grapgh.get(u).add(v);
        }
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {
                ArrayList<Integer> com = new ArrayList<>();
                dfs(i, grapgh, com, visited);
                components.add(com);
            }
        }


        return components;


    }

    private static void dfs(int i, ArrayList<ArrayList<Integer>> grapgh, ArrayList<Integer> com, boolean[] visited) {
        visited[i] = true;
        com.add(i);

        for (int neighbor : grapgh.get(i)) {
            if (!visited[neighbor]) {
                dfs(neighbor, grapgh, com, visited);
            }
        }
    }


}
