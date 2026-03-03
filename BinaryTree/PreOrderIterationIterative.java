package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterationIterative {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(11);
        root.left.left.left = new TreeNode(40);
        root.left.left.right = new TreeNode(91);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Integer> ans = preOrderIterationIterative(root);
        System.out.println(ans);
    }

    private static List<Integer> preOrderIterationIterative(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            list.add(current.val);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
        return list;
    }

}
