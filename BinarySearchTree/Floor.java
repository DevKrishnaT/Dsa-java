package BinarySearchTree;

public class Floor {
    static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(11);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);

        root.left.right.right = new TreeNode(8);
        int x = 11;
        int ans = floor(root, x);
        System.out.println(ans);
    }

    public static int floor(TreeNode root, int x) {
        int ans = -1;
        while (root != null) {
            int rootVal = root.val;

            if (rootVal == x) {
                return rootVal;
            }

            if (rootVal < x) {
                ans = rootVal;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return ans;
    }
}
