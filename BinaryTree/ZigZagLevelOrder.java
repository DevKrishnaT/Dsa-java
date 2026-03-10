package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;

public class ZigZagLevelOrder {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<List<Integer>> ans = zigzagLevelOrder(root);
        System.out.println(ans);
    }

    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ansList = new ArrayList<>();
        if (root == null) return ansList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean rotate = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                list.add(current.val);
            }

            if (rotate) {
                Collections.reverse(list);
            }
            ansList.add(list);
            rotate = !rotate;
        }
        return ansList;

    }
}
