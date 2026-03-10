package BinaryTree;

public class MaxPathSum {
    static int Maxi = Integer.MIN_VALUE;

    static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int ans = maxPathSum(root);
        System.out.println(ans);
    }

    private static int maxPathSum(TreeNode root) {
        findMaxi(root);
        return Maxi;
    }

    private static int findMaxi(TreeNode root) {

        if (root == null) return 0;


        int left = Math.max(0, findMaxi(root.left));
        int right = Math.max(0, findMaxi(root.right));

        Maxi = Math.max(Maxi, left + root.val + right);


        return root.val + Math.max(left, right);
    }
}
