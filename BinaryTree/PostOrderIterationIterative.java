package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderIterationIterative {
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
        List<Integer> ans = postOrderIterationIterative1Stack(root);
        System.out.println(ans);
    }

    private static List<Integer> postOrderIterationIterative1Stack(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode lastVisited = null;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.add(current);
                current = current.left;
            } else {
                TreeNode peekNode = stack.peek();

                if (peekNode.right != null && peekNode.right != lastVisited) {
                    current = peekNode.right;
                } else {
                    list.add(peekNode.val);
                    lastVisited = stack.pop();
                }
            }
        }
        return list;
    }

    private static List<Integer> postOrderIterationIterative2Stack(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
            ;
        }
        while (!stack2.isEmpty()) {
            list.add(stack2.pop().val);
        }

        return list;
    }
}
