package BinarySearchTree;

import java.util.Stack;

public class BSTFromPreorder {
    static void main(String[] args) {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode root = bstFromPreorder(preorder);
        System.out.println(root.val);
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static int index = 0;

    private static TreeNode build(int[] preorder, int min, int max) {
        if (index >= preorder.length) return null;

        int val = preorder[index];

        if (val < min || val > max) return null;

        TreeNode root = new TreeNode(val);
        index++;

        root.left = build(preorder, min, val);
        root.right = build(preorder, val, max);
        return root;
    }
}
