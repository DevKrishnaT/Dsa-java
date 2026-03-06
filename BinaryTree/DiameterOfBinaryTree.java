package BinaryTree;

public class DiameterOfBinaryTree {
    static int maxi;

    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int max = 0;
        int ans = diameterOfBinaryTree(root);

        System.out.println(maxi);
    }


    public static int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return maxi;
    }

    public static int find(TreeNode root) {
        if (root == null) return 0;

        int left = find(root.left);
        int right = find(root.right);

        maxi = Math.max(maxi, left + right);
        ;

        return 1 + Math.max(left, right);
    }
}
