package BinaryTree;

import java.util.ArrayList;

public class LeftView {
    static int maxLevel = -1;

    static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);

        root.left.left.left = new TreeNode(5);
        ArrayList<Integer> ans = leftView(root);
        System.out.println(ans);
    }

    public static ArrayList<Integer> leftView(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        maxLevel = -1;
        solve(root, 0, result);

        return result;
    }

    private static void solve(TreeNode root, int max, ArrayList<Integer> list) {

        if (root == null) return;

        if (max > maxLevel) {
            list.add(root.val);
            maxLevel = max;
        }
        solve(root.left, max + 1, list);
        solve(root.right, max + 1, list);

    }
}
