package Graph.SortestPath;

import java.util.*;

public class Sortestpath {
    static void main(String[] args) {
//        int[][] edges = {
//                {0, 1},
//                {0, 3},
//                {1, 2},
//                {3, 4},
//                {4, 5},
//                {2, 6},
//                {5, 6},
//                {6, 7},
//                {6, 8},
//                {7, 8}
//        };
        int[][] edges = {
                {0, 3},
                {1, 3},
        };

        int V = 4;
        int src = 3;
        int[] ans = shortestPath(V, edges, src);
        System.out.println(Arrays.toString(ans));
    }

    static class pair {
        int node;
        int distance;

        pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    private static int[] shortestPath(int V, int[][] edges, int src) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] num : edges) {
            graph.get(num[0]).add(num[1]);
            graph.get(num[1]).add(num[0]);
        }

        int[] distance = new int[V];
        Arrays.fill(distance, -1);

        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(src, 0));
        distance[src] = 0;
        while (!queue.isEmpty()) {
            pair curr = queue.poll();
            int node = curr.node;

            for (int neigh : graph.get(node)) {
                if (distance[neigh] == -1) {
                    distance[neigh] = distance[node] + 1;
                    queue.add(new pair(neigh, distance[neigh]));
                }
                ;
            }

        }
        return distance;
    }
}
