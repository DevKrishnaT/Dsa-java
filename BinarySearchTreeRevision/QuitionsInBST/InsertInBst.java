package BinarySearchTreeRevision.QuitionsInBST;

public class InsertInBst {
    static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(14);
        TreeNode node = insertIntoBST(root, 7);
    }

    private static TreeNode insertIntoBST(TreeNode root, int val) {


        TreeNode insertNode = new TreeNode(val);
        if (root == null) return insertNode;
        TreeNode treversalRoot = root;

        while (treversalRoot != null) {


            if (treversalRoot.val < val) {
                if (treversalRoot.right == null) {
                    treversalRoot.right = insertNode;
                    return root;
                } else {
                    treversalRoot = treversalRoot.right;
                }
            } else {
                if (treversalRoot.left == null) {
                    treversalRoot.left = insertNode;
                    return root;
                } else {
                    treversalRoot = treversalRoot.left;
                }
            }
        }

        return null;
    }
}
