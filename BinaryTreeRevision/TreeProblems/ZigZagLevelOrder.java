package BinaryTreeRevision.TreeProblems;

import java.util.*;

public class ZigZagLevelOrder {
    static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> ans = zigzagLevelOrder(root);
        System.out.println(ans);
    }

    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean zigzag = false;
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode curr = queue.poll();
                levelList.add(curr.value);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            if (zigzag) {
                Collections.reverse(levelList);
                zigzag = false;
            } else {
                zigzag = true;
            }

            list.add(levelList);
        }
        return list;
    }
}
