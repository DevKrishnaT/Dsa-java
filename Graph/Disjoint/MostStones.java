package Graph.Disjoint;

public class MostStones {
    static void main(String[] args) {
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        int ans = removeStoens(stones);
        System.out.println(ans);
    }

    private static int removeStoens(int[][] stones) {
        int n = stones.length;
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;
        for (int[] edge : stones) {
            maxRow = Math.max(maxRow, edge[0]);
            maxCol = Math.max(maxCol, edge[1]);

        }
        unionDisjoint.DisjointSet uf = new unionDisjoint.DisjointSet(maxRow + maxCol + 2);

        for (int[] edge : stones) {
            int u = edge[0];
            int v = edge[1] + maxRow + 1;
            uf.unionBySize(u, v);
        }
        int components = 0;
        for (int i = 0; i <= maxRow + maxCol + 1; i++) {
            if (uf.findParent(i) == i && uf.size.get(i) > 1) {
                components++;
            }
        }
        return n - components;
    }
}
