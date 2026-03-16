package BinarySearchTree;

public class Searching {
    static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        int val = 2;
        TreeNode ans = search(root, val);
        System.out.println(ans.val);
    }

    private static TreeNode search(TreeNode root, int val) {
        while (root != null) {
            int RootVal = root.val;
            if (RootVal == val) {
                return root;
            }

            if (RootVal > val) {
                root = root.left;
            } else {
                root = root.right;
            }


        }
        return null;
    }
}
