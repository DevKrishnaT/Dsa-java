package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        ArrayList<String> list =
                binaryTreePaths(root);
        System.out.println(list);
    }

    private static ArrayList<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        finding(root, list, new StringBuilder());
        return list;
    }

    private static void finding(TreeNode root, ArrayList<String> list, StringBuilder string) {
        if (root == null) return;

        if (isLeaf(root)) {
            StringBuilder temp = new StringBuilder(string);
            temp.append(root.val);
            list.add(new String(temp));
        }
        finding(root.left, list, new StringBuilder(string).append(root.val).append("->"));
        finding(root.right, list, new StringBuilder(string).append(root.val).append("->"));
    }

    private static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }


}
