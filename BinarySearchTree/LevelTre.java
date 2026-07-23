package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelTre {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(6);
        root.right.right.left.right = new TreeNode(4);
        levelOrder(root);
    }

    private static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {

            TreeNode curr = queue.poll();
            System.out.print(curr.val + " ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }


        }
    }

}
