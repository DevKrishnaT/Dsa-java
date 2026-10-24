package BinarySearchTreeRevision.QuitionsInBST;

public class LowestCommonAncestor {
    static void main(String[] args) {
        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left;
        TreeNode q = root.left.right;

        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            return lowestCommonAncestor(root, q, p);
        }

        while (root != null) {

            int value = root.val;
            if (root == p || root == q) {
                return root;
            }
            if (value >= p.val && value < q.val) {
                return root;
            }

            if (p.val < value && q.val < value) {
                root = root.left;
            } else {
                root = root.right;
            }

        }
        return null;


    }
}
