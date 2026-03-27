package Graph.TopoSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseQUsingKahnsAlgo {
    static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {0, 1}};
        int numCourses = 2;
        boolean ans = course(numCourses, prerequisites);
    }

    private static boolean course(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for (int[] num : prerequisites) {
            int u = num[0];
            int v = num[1];
            graph.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo.add(node);
            for (int neigh : graph.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0) {
                    queue.add(neigh);
                }
            }

        }
        return topo.size() == numCourses;
    }
}
