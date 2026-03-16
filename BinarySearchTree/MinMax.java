package BinarySearchTree;

public class MinMax {
    static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        int min = minInBst(root);
        int max = maxInBst(root);
        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }

    private static int maxInBst(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    private static int minInBst(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root.val;
    }
}
