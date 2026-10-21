package BinaryTreeRevision.TreeProblems;

public class MaxPathSum {
    void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxPathSum(root));
    }

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxSum(root);
        return maxSum;

    }

    public int findMaxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, findMaxSum(root.left));
        int right = Math.max(0, findMaxSum(root.right));


        maxSum = Math.max(maxSum, left + right + root.value);

        return root.value + Math.max(left, right);

    }

}
