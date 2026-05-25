package Dynamic_Programming;

import java.util.HashSet;

public class UnvisitedLeaves {
    static void main(String[] args) {
        int[] frogs = {3, 2, 4};
        int n = 3;
        int leaves = 4;
        int ans = unvisitedLeaves(n, frogs, leaves);
        System.out.println(ans);
    }

    private static int unvisitedLeaves(int n, int[] frogs, int leaves) {
        boolean[] visited = new boolean[leaves + 1];
        HashSet<Integer> set = new HashSet<>();

        for (int frog : frogs) {

            if (set.contains(frog))
                continue;

            set.add(frog);
            if (frog > leaves) {
                continue;
            }

            for (int i = frog; i <= leaves; i += frog) {
                visited[i] = true;

            }

        }

        int count = 0;

        for (int i = 1; i <= leaves; i++) {
            if (!visited[i]) count++;
        }

        return count;
    }
}
