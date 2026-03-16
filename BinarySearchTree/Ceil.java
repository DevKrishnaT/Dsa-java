package BinarySearchTree;

public class Ceil {
    static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(11);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);

        root.left.right.right = new TreeNode(8);
        int x = 6;
        int ciel = findCiel(root, x);
        System.out.println(ciel);
    }

    private static int findCiel(TreeNode root, int x) {
        int ans = -1;
        while (root != null) {
            int rootVal = root.val;

            if (rootVal == x) {
                return rootVal;
            }

            if (rootVal < x) {
                root = root.right;
            } else {
                ans = rootVal;
                root = root.left;
            }
        }
        return ans;
    }
}
