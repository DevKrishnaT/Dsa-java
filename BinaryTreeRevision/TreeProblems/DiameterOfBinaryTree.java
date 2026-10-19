package BinaryTreeRevision.TreeProblems;

public class DiameterOfBinaryTree {
    static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int ans = diameterOfBinaryTree(root);
    }

    static int diameter;

    private static int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return diameter;
    }

    private static int find(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = find(root.left);
        int right = find(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}
