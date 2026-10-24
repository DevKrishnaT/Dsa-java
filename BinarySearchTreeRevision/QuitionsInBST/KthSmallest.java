package BinarySearchTreeRevision.QuitionsInBST;

public class KthSmallest {
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);
        int ans = kthSmallest(root, 5);
        System.out.println(ans);
    }

    static int result = -1;
    static int count = 0;

    private static int kthSmallest(TreeNode root, int i) {
        inOrder(root, i);
        return result;
    }

    private static void inOrder(TreeNode root, int i) {
        if (root == null) {
            return;
        }

        inOrder(root.left, i);

        count++;
        if (count == i) {
            result = root.val;
            return;
        }

        inOrder(root.right, i);
    }
}
