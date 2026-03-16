package BinarySearchTree;

public class InsertIntoBST {
    static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(7);
        TreeNode insert = new TreeNode(5);

        TreeNode ans = insertIntoBST(root, 5);

    }

    private static TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) return new TreeNode(val);
        TreeNode brute = root;
        TreeNode Prev = null;
        while (root != null) {
            Prev = root;
            int rootVal = root.val;
            if (rootVal > val) {
                root = root.left;

            } else {
                root = root.right;
            }
            ;

        }

        if (Prev.val > val) {
            Prev.left = new TreeNode(val);
        } else {
            Prev.right = new TreeNode(val);
        }

        return brute;

    }
}
