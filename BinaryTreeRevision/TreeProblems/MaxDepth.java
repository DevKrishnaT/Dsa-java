package BinaryTreeRevision.TreeProblems;


public class MaxDepth {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        int depth = maxDepth(root);
        System.out.println(depth);
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 1;
        }


        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
