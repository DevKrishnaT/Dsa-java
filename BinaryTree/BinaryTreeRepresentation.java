package BinaryTree;

import java.util.ArrayList;
import java.util.Iterator;
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(11);
        root.left.left.left = new TreeNode(40);
        root.left.left.right = new TreeNode(91);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Integer> ans = preorderTraversal(root);
        List<Integer> post = postorderTraversal(root);


        List<Integer> inOrder = inorderTraversal(root);
        System.out.println();
        System.out.println(ans + " preorder");
        System.out.println(post + "postorder");
        System.out.println(inOrder + " inroder");

    }

    private static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrderWithList(list, root);
        return list;
    }

    private static void postOrderWithList(ArrayList<Integer> list, TreeNode root) {
        if (root == null) return;

        postOrderWithList(list, root.left);
        postOrderWithList(list, root.right);
        list.add(root.val);
    }


    private static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderWithList(list, root);
        return list;
    }

    private static void inOrderWithList(ArrayList<Integer> list, TreeNode root) {

        if (root == null) return;

        inOrderWithList(list, root.left);
        list.add(root.val);
        inOrderWithList(list, root.right);
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
