package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        int no = countNodes(root);
        int no2 = countTree(root);
        System.out.println(no2);
        System.out.println(no);
    }

    private static int countTree(TreeNode root) {
        if (root == null) return 0;

        int left = countTree(root.left);
        int right = countTree(root.right);

        return left + right + 1;
    }

    private static int countNodes(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int num = 0;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            num += size;
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return num;
    }
}
