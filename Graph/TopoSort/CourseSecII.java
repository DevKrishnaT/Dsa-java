package Graph.TopoSort;

import java.lang.reflect.Array;
import java.util.*;

public class CourseSecII {
    static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int numCourses = 4;
        int[] order_ans = findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(order_ans));
    }

    private static int[] findOrder(int numCourses, int[][] prerequisites) {
        

        List<List<Integer>> topo = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            topo.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for (int[] num : prerequisites) {
            int u = num[0];
            int v = num[1];
            topo.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        List<Integer> courses = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            courses.add(node);

            for (int nigh : topo.get(node)) {
                indegree[nigh]--;
                if (indegree[nigh] == 0) {
                    queue.add(nigh);
                }
            }
        }
        if (courses.size() != numCourses) {
            return new int[]{};
        }

        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = courses.get(i);
        }

        return res;
    }
}
