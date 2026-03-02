package BinaryTree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }

    static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val + " ");
    }
}

public class BinaryTreeRepresentation {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> ans = preorderTraversal(root);
        System.out.println(ans);

    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrderWithList(list, root);
        return list;
    }

    private static void preOrderWithList(ArrayList<Integer> list, TreeNode root) {
        if (root == null) return;

        list.add(root.val);
        preOrderWithList(list, root.left);
        preOrderWithList(list, root.right);
    }


}
