package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundryTreversal {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.right = new TreeNode(1001);

        root.right = new TreeNode(7);

        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        root.left.left.left.left = new TreeNode(5);
        root.left.left.left.right = new TreeNode(6);

        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);

        root.right.right.left.left = new TreeNode(10);
        root.right.right.left.right = new TreeNode(11);


        List<Integer> ans = antiClockWise(root);
        System.out.println(ans);
    }

    private static List<Integer> antiClockWise(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        if (!isLeaf(root)) {
            list.add(root.val);
        }
        LeftTree(root, list);
        addLeaves(root, list);
        rightBoundry(root, list);

        return list;
    }

    private static void rightBoundry(TreeNode root, ArrayList<Integer> list) {
        TreeNode curr = root.right;
        Stack<Integer> stack = new Stack<>();
        while (curr != null) {
            if (!isLeaf(curr)) {
                stack.push(curr.val);
            }

            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        while (!stack.isEmpty())
            list.add(stack.pop());
    }

    private static void addLeaves(TreeNode node, ArrayList<Integer> ans) {
        if (isLeaf(node)) {
            ans.add(node.val);
            return;
        }

        if (node.left != null)
            addLeaves(node.left, ans);

        if (node.right != null)
            addLeaves(node.right, ans);
    }

    private static boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    private static void LeftTree(TreeNode root, ArrayList<Integer> list) {
        TreeNode curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) {
                list.add(curr.val);
            }

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }


}
