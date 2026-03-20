package Graph;

public class FindCircleNum {
    static void main(String[] args) {
        int[][] isConnected = {{0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}};

        int ans = findCircleNum(isConnected);
        System.out.println(ans);
    }

    private static int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int node, int[][] isConnected, boolean[] visited) {
        visited[node] = true;


        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[node][i] == 1 && !visited[i]) {
                dfs(i, isConnected, visited);
            }
        }
    }
}
