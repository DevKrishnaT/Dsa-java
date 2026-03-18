package BinarySearchTree;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumInBST {
    static void main(String[] args) {
        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        boolean ans = findtarget(root, 8);
        System.out.println(ans);
    }


    static HashSet<Integer> set = new HashSet<>();

    private static boolean findtarget(TreeNode root, int k) {

        if (root == null) return false;

        int val = root.val;
        if (set.contains(k - val)) {
            return true;
        }
        set.add(val);

        boolean left = findtarget(root.left, k);
        boolean right = findtarget(root.right, k);

        return left || right;
    }
}
