package BinaryTree;

import java.util.*;

public class ItrativeInorderBT {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(11);
        root.left.left.left = new TreeNode(40);
        root.left.left.right = new TreeNode(91);

        List<Integer> Inorder = inOrderIteration(root);
        System.out.println(Inorder);
    }


    private static List<Integer> inOrderIteration(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }


        return list;
    }

}
