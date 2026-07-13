package PrefixSum;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int target = 7;
        boolean ans = pathSum(root, target);
        System.out.println(ans);
    }

    private static boolean pathSum(TreeNode root, int target) {

        if (root == null) {
            return false;
        }
        if (root.left == null || root.right == null) {
            return target == root.val;
        }

        return pathSum(root.left, target - root.val) || pathSum(root.right, target - root.val);
    }
}
