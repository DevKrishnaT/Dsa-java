package BinaryTree;

import java.util.*;

public class Pre_Post_Inorder {

    static class Pair {
        TreeNode node;
        int value;

        Pair(TreeNode node, int value) {
            this.node = node;
            this.value = value;
        }
    }

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
        List<List<Integer>> ans = AllOrder(root);
        System.out.println(ans);
    }

    private static List<List<Integer>> AllOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> PreOrder = new ArrayList<>();
        ArrayList<Integer> InOrder = new ArrayList<>();
        ArrayList<Integer> PostOrder = new ArrayList<>();
        if (root == null) return ans;


        Stack<Pair> stack = new Stack<>();

        stack.add(new Pair(root, 1));

        while (!stack.isEmpty()) {
            Pair it = stack.pop();

            if (it.value == 1) {
                PreOrder.add(it.node.val);
                it.value++;
                stack.push(it);

                if (it.node.left != null) {
                    stack.push(new Pair(it.node.left, 1));
                }
            } else if (it.value == 2) {
                InOrder.add(it.node.val);
                it.value++;
                stack.push(it);

                if (it.node.right != null) {
                    stack.push(new Pair(it.node.right, 1));
                }
            } else {
                PostOrder.add(it.node.val);
            }

        }
        ans.add(PreOrder);
        ans.add(InOrder);
        ans.add(PostOrder);
        return ans;
    }
}

