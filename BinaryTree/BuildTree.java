package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;

public class BuildTree {
    static void main(String[] args) {
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree(preOrder, inOrder);
        System.out.println(root.val);
    }


    static int preIndex = 0;
    static HashMap<Integer, Integer> map = new HashMap<>();

    private static TreeNode buildTree(int[] preOrder, int[] inOrder) {

        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }
        return construct(preOrder, 0, inOrder.length - 1);
    }

    private static TreeNode construct(int[] preOrder, int start, int end) {
        if (start > end) return null;

        int rootVal = preOrder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int pos = map.get(rootVal);

        root.left = construct(preOrder, start, pos - 1);
        root.right = construct(preOrder, pos + 1, end);

        return root;
    }

}
