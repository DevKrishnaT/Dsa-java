package Graph.Disjoint;

import java.util.ArrayList;

public class MakeConnection {
    static class unionDis {
        ArrayList<Integer> parent = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();

        public unionDis(int n) {
            for (int i = 0; i < n; i++) {
                parent.add(i);
                size.add(1);
            }
        }

        public int findParent(int Node) {
            if (Node == parent.get(Node)) {
                return Node;
            }

            int ultimetParent = findParent(parent.get(Node));

            parent.set(Node, ultimetParent);

            return parent.get(Node);
        }

        public void union(int u, int v) {
            int ulp_u = findParent(u);
            int ulp_v = findParent(v);


            if (ulp_u == ulp_v) {
                return;
            }

            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v));
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_v) + size.get(ulp_u));
            }
        }
    }

    static void main(String[] args) {
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}};
        int n = 6;
        int ans = makeConnected(n, connections);
    }

    static int makeConnected(int n, int[][] connections) {
        unionDis ds = new unionDis(n);
        int extraedge = 0;
        for (int[] edge : connections) {
            int u = edge[0];
            int v = edge[1];
            if (ds.findParent(u) == ds.findParent(v)) {
                extraedge++;
            } else {
                ds.union(u, v);
            }
        }
        int components = 0;
        for (int i = 0; i < n; i++) {

            if (ds.findParent(i) == i) {
                components++;
            }
        }

        int neededEdges = components - 1;

        if (extraedge >= neededEdges) {
            return neededEdges;
        }
        return -1;

    }
}
