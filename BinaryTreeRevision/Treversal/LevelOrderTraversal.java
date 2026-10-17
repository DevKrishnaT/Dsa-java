package BinaryTreeRevision.Treversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        levelOrderTraversal(root);
    }

    private static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.value + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }
}
