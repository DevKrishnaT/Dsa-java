package BinarySearchTree;

public class RecoverTree {
    static void main(String[] args) {

    }

    static TreeNode first = null;
    static TreeNode sec = null;

    static TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public static void recoverTree(TreeNode root) {
        inorder(root);

        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;
    }

    private static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev.val > root.val) {
            if (first == null) {
                first = prev;
            }
            sec = root;

        }

        prev = root;

        inorder(root.right);
    }

    ;
}
