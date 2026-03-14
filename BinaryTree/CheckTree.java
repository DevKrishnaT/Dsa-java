package BinaryTree;

public class CheckTree {
    static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        boolean ans = checkTree(root);
        System.out.println(ans);
    }

    public static boolean checkTree(TreeNode root) {
        int left = root.left.val;
        int right = root.right.val;
        int rootVal = root.val;
        return (left + right) == rootVal;
    }
}
