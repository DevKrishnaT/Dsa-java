package BinaryTreeRevision.TreeProblems;

import BinaryTreeRevision.Treversal.AllOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {
    static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode inverted = invertTree(root);

    }

    private static TreeNode invertTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null && curr.right != null) {
                q.add(curr.left);
                q.add(curr.right);
                TreeNode left = curr.left;
                curr.left = curr.right;
                curr.right = left;
            } else if (curr.left != null) {
                q.add(curr.left);
                curr.right = curr.left;
                curr.left = null;
            } else if (curr.right != null) {
                q.add(curr.right);
                curr.left = curr.right;
                curr.right = null;
            }
        }
        return root;
    }
}
