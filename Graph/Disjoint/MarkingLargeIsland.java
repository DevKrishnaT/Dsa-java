package Graph.Disjoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MarkingLargeIsland {
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
        int[][] grid = {{1, 1, 0, 1, 1}, {1, 1, 0, 1, 1}, {1, 1, 0, 1, 1}, {0, 0, 1, 0, 0}, {0, 0, 1, 1, 1}};
        for (int[] arr : grid) {
            System.out.println(Arrays.toString(arr));
        }
        int ans = largestIsland(grid);
        System.out.println(ans);
    }

    private static int largestIsland(int[][] grid) {
        int n = grid.length;
        unionDis dsu = new unionDis(n * n);
        int[][] dirs = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    for (int[] d : dirs) {
                        int nr = i + d[0];
                        int nc = j + d[1];
                        if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 1) {
                            int node = n * i + j;
                            int node1 = n * nr + nc;
                            dsu.union(node, node1);
                        }
                    }
                }

            }
        }
        int ans = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                if (grid[r][c] == 0) {
                    Set<Integer> seen = new HashSet<>();
                    int size = 1;

                    for (int[] dir : dirs) {
                        int nr = r + dir[0];
                        int nc = c + dir[1];
                        if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 1) {
                            int parent = dsu.findParent(nr * n + nc);

                            if (!seen.contains(parent)) {
                                size += dsu.size.get(parent);
                                seen.add(parent);
                            }

                        }
                    }
                    ans = Math.max(ans, size);
                }

            }

        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    ans = Math.max(ans,
                            dsu.size.get(r * n + c));
                }
            }

        }
        return ans;
    }
}
