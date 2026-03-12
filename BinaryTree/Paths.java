package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Paths {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<List<Integer>> list =
                binaryTreePaths(root);
        System.out.println(list);
    }

    private static List<List<Integer>> binaryTreePaths(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        paths(ans, root, new ArrayList<>());
        return ans;
    }

    private static void paths(List<List<Integer>> ans, TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        if (isLeaf(root)) {
            List<Integer> temp = new ArrayList<>(list);
            temp.add(root.val);
            ans.add(temp);
        }

        list.add(root.val);
        paths(ans, root.left, list);
        paths(ans, root.right, list);
        list.removeLast();


    }

    private static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
