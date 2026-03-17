package BinarySearchTree;

public class DeleteNodeInBST {
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        TreeNode ans = deleteNode(root, 3);
        System.out.println(ans.val);
        System.out.println(ans.left.val);
//        System.out.println(ans.left.val);
    }

    private static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {

            if (root.left == null && root.right == null)
                return null;

            if (root.left == null) return root.right;
            if (root.right == null) return root.left;


            TreeNode successor = Findmin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }

        return root;

    }

    private static TreeNode Findmin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


}
