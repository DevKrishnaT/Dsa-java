package BinaryTree;

import java.util.*;

public class VerticalTraversal {


    static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        List<List<Integer>> ans = verticalTraversal(root);
        System.out.println(ans);
    }

    private static List<List<Integer>> verticalTraversal(TreeNode root) {


        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        dfs(map, 0, 0, root);

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {

                while (!pq.isEmpty()) {
                    ans.add(pq.poll());
                }
            }
            result.add(ans);

        }
        return result;
    }

    private static void dfs(TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map, int row, int col, TreeNode root) {
        if (root == null) return;

        map.putIfAbsent(col, new TreeMap<>());
        map.get(col).putIfAbsent(row, new PriorityQueue<>());
        map.get(col).get(row).offer(root.val);

        dfs(map, row + 1, col - 1, root.left);
        dfs(map, row + 1, col + 1, root.right);

    }


}
