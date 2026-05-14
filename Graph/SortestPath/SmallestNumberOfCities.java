package Graph.SortestPath;

import java.util.Arrays;

public class SmallestNumberOfCities {
    static void main(String[] args) {
        int[][] edges = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        int distanceThreshold = 4;
        int n = 4;
        int ans = findTheCity(edges, distanceThreshold, n);
        System.out.println(ans);
    }

    public static int findTheCity(int[][] edges, int distanceThreshold, int n) {
        int INF = (int) 1e9;

        int[][] dist = new int[n][n];


        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }


        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            dist[u][v] = wt;
            dist[v][u] = wt;
        }


        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {

                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        int minReachable = Integer.MAX_VALUE;
        int answerCity = -1;


        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }


            if (count <= minReachable) {
                minReachable = count;
                answerCity = i;
            }
        }

        return answerCity;
    }
}
