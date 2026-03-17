package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KthSmallest {
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);
        int ans = findkthSmallest(root, 3);
        System.out.println(ans);

    }

    static int result = -1;
    static int count = 0;

    private static int findkthSmallest(TreeNode root, int i) {
        inoder(root, i);
        return result;
    }

    private static void inoder(TreeNode root, int i) {
        if (root == null) return;

        inoder(root.left, i);

        count++;
        if (count == i) {
            result = root.val;
            return;
        }

        inoder(root.right, i);
    }


}
