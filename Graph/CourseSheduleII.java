package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CourseSheduleII {
    static void main(String[] args) {
        int[][] prerequisites = {{1, 0}};
        int numCourses = 2;
        int[] ans = findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findOrder(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) {
            int[] res = new int[numCourses];
            for (int i = 0; i < numCourses; i++) res[i] = i;
            return res;
        }
        List<List<Integer>> graph = new ArrayList<>();
        int n = prerequisites.length;
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            int v = edge[1];
            int u = edge[0];
            graph.get(v).add(u);
        }

        int[] state = new int[numCourses];
        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {
            if (state[i] == 0) {
                if (dfs(i, graph, state, order)) {
                    return new int[]{};
                }
            }
        }
        Collections.reverse(order);

        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = order.get(i);
        }

        return res;
    }

    private static boolean dfs(int node, List<List<Integer>> graph, int[] state, List<Integer> order) {
        if (state[node] == 1) return true;
        if (state[node] == 2) return false;

        state[node] = 1;
        for (int neigh : graph.get(node)) {
            if (dfs(neigh, graph, state, order)) {
                return true;
            }
        }

        state[node] = 2;
        order.add(node);
        return false;
    }


}
