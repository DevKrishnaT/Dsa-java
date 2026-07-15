package Revision.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class inOrder {
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(12);
        List<Integer> ans = Treversel(root);
    }

    private static List<Integer> Treversel(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        find(root, list);
        return list;
    }

    private static void find(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        find(root.left, list);
        System.out.println(root.val);
        find(root.right, list);
        
    }

}
