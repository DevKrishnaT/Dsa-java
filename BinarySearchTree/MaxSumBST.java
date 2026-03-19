package BinarySearchTree;

public class MaxSumBST {
    void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);
        int ans = maxSumBST(root);
        System.out.println(ans);
    }

    int Maxsum = 0;

    class info {
        boolean isBST;
        int min, max, sum;

        info(Boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }

    }

    private int maxSumBST(TreeNode root) {
        dfs(root);
        return Maxsum;
    }

    private info dfs(TreeNode root) {
        if (root == null) return new info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);

        info left = dfs(root.left);
        info right = dfs(root.right);

        if (left.isBST && right.isBST && root.val > left.max && root.val < right.min) {
            int sum = left.sum + right.sum + root.val;

            Maxsum = Math.max(Maxsum, sum);
            int min = Math.min(root.val, left.min);
            int max = Math.max(root.val, right.max);

            return new info(true, min, max, sum);
        }

        return new info(false, 0, 0, 0);
    }


}
