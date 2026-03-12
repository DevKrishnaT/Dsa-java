package BinaryTree;

import java.util.*;

public class RightView {

    static int maxLevel = -1;

    static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);

        root.left.left.left = new TreeNode(5);
        ArrayList<Integer> result = new ArrayList<>();
        maxLevel = -1;
        rightSideView(root, 0, result);

        System.out.println(result);
    }

    private static void rightSideView(TreeNode root, int max, ArrayList<Integer> list) {

        if (root == null) return;

        if (max > maxLevel) {
            list.add(root.val);
            maxLevel = max;
        }
        rightSideView(root.right, max + 1, list);
        rightSideView(root.left, max + 1, list);

    }


    private static List<Integer> rightSideViewBfs(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == size - 1) {
                    result.add(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return result;


    }

}
