package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class IsSumProperty {
    static void main(String[] args) {
        TreeNode root = new TreeNode(35);

        root.left = new TreeNode(20);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        boolean ans = isSumProperty(root);
        System.out.println(ans);
    }

    private static boolean isSumProperty(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (!checkTree(curr) && !isLeaf(curr)) {
                return false;
            }


            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        return true;
    }

    private static boolean isLeaf(TreeNode root) {
        return root != null && root.left == null && root.right == null;
    }

    public static boolean checkTree(TreeNode root) {
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = root.left.val;
        }
        if (root.right != null) {
            right = root.right.val;
        }
        int rootVal = root.val;
        return (left + right) == rootVal;
    }
}
