package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        int targetSum = 22;
        List<List<Integer>> ans = findPath(root, targetSum);
        System.out.println(ans);
    }

    private static List<List<Integer>> findPath(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findAllPath(result, root, targetSum, new ArrayList<>(), 0);
        return result;
    }

    private static void findAllPath(List<List<Integer>> result, TreeNode root, int targetSum, ArrayList<Integer> temp, int sum) {

        if (root == null) return;

        if (sum + root.val == targetSum && isLeaf(root)) {
            List<Integer> newTemp = new ArrayList<>(temp);
            newTemp.add(root.val);
            result.add(new ArrayList<>(newTemp));
        }

        temp.add(root.val);
        findAllPath(result, root.left, targetSum, temp, sum + root.val);
        findAllPath(result, root.right, targetSum, temp, sum + root.val);
        temp.removeLast();


    }

    private static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }


}
