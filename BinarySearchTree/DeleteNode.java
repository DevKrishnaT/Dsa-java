package BinarySearchTree;

public class DeleteNode {
    static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(6);
        int key = 8;
        TreeNode ans = deleteNode(root, key);
    }

    private static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        TreeNode brute = root;
        while (root != null) {
            int val = root.val;
            if (val == key) {

                
            }

            if (val > key) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return brute;
    }
}
