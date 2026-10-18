package BinaryTreeRevision.TreeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        List<List<Integer>> list = levelOrder(root);
        System.out.println(list);
    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int NodesInLevel = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < NodesInLevel; i++) {
                TreeNode curr = queue.poll();
                levelList.add(curr.value);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

            }
            list.add(levelList);
        }
        return list;
    }
}
