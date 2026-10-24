package BinarySearchTreeRevision.QuitionsInBST;

public class DeleteNodeInBST {
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(7);
        int key = 3;

        TreeNode node = deleteNode(root, key);
    }

    private static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) return null;

            if (root.left == null) return root.right;
            if (root.right == null) return root.left;


            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    public static TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}
