package Graph.TopoSort;

import java.util.*;

public class EventualSafeNodes {
    static void main(String[] args) {

        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        ArrayList<Integer> ans = eventualSafeNodes(graph);
        System.out.println(ans);
    }

    private static ArrayList<Integer> eventualSafeNodes(int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        int n = graph.length;
        int[] outDegree = new int[n];
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int[] num = graph[i];
            outDegree[i] = num.length;
            for (int nWord : num) {
                list.get(nWord).add(i);
            }
        }

        for (int i = 0; i < n; i++) {
            if (outDegree[i] == 0) {
                queue.add(i);
            }
        }
      

        ArrayList<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);
            for (int num : list.get(node)) {
                outDegree[num]--;
                if (outDegree[num] == 0) {
                    queue.add(num);
                }
            }

        }
        Collections.sort(order);

        return order;
    }
}
