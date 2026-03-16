package BinaryTree;

import com.sun.source.tree.Tree;

public class Flatten {
    static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        flatten(root);
        System.out.println(root.val);

        System.out.println(root.right.val);

        System.out.println(root.right.right.val);
    }

    private static void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;
            } else {
                TreeNode prev = root.left;
                while (prev.right != null && prev.right != root) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = root;
                    root = root.left;
                } else {
                    prev.right = root.right;
                    root.right = root.left;
                    root.left = null;

                }
            }
        }
    }
}
