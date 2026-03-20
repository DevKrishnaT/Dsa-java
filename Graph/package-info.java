package Graph;

import java.util.ArrayList;
import java.util.List;

class graph {
    private int v;
    private List<List<Integer>> adj;

    graph(int v) {
        this.v = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v + 1; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printGraph() {
        for (int i = 0; i < v + 1; i++) {
            System.out.print(i + "-->");
            for (int num : adj.get(i)) {
                System.out.print(num + " ");
            }
            
            System.out.println();
        }

    }
}