package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    static void main(String[] args) {
        TreeNode root = new TreeNode(20);

        root.left = new TreeNode(8);
        root.right = new TreeNode(22);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);

        root.right.right.left = new TreeNode(28);
        int ans = find(root);
        System.out.println(ans);
    }

    private static int find(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();


            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left == null && curr.right == null)
                    return depth;

                if (curr.left != null)
                    queue.offer(curr.left);

                if (curr.right != null)
                    queue.offer(curr.right);
            }
            depth++;
        }

        return depth;

    }

}
