package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class LevelOfBT {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(11);
        root.left.left.left = new TreeNode(40);
        root.left.left.right = new TreeNode(91);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int ans = findLevel(root);
        boolean isBalanced = isBalanced(root);
        System.out.println(isBalanced);
        System.out.println(ans);
    }

    private static int findLevel(TreeNode root) {
        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        int maxCount = 0;
        int count = 0;
        TreeNode lastviewd = null;
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                count++;
                stack.add(current);
                current = current.left;
            } else {
                TreeNode Peeked = stack.peek();
                if (Peeked.right != null && Peeked.right != lastviewd) {
                    current = Peeked.right;

                } else {
                    maxCount = Math.max(maxCount, count);
                    count--;
                    lastviewd = stack.pop();
                }
            }
        }
        return maxCount;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }


    ;

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    ;

    private static int checkHeight(TreeNode root) {
        if (root == null) return 0;
        int left = checkHeight(root.left);
        if (left == -1) return -1;
        int right = checkHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }

}
