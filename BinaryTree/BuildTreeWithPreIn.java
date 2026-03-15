package BinaryTree;

import java.util.HashMap;

public class BuildTreeWithPreIn {
    static void main(String[] args) {
        int[] postOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree(postOrder, inOrder);
    }

    static int postIndex;
    static HashMap<Integer, Integer> map = new HashMap<>();

    private static TreeNode buildTree(int[] postOrder, int[] inOrder) {
        postIndex = postOrder.length - 1;

        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }

        return construct(postOrder, 0, inOrder.length - 1);
    }

    private static TreeNode construct(int[] postOrder, int start, int end) {
        if (start > end) {
            return null;
        }
        int rootval = postOrder[postIndex--];
        TreeNode root = new TreeNode(rootval);
        int pos = map.get(rootval);

        root.right = construct(postOrder, pos + 1, end);
        root.left = construct(postOrder, start, pos - 1);

        return root;
    }
}
