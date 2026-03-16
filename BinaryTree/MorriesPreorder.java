package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MorriesPreorder {
    static void main(String[] args) {
        TreeNode root = new TreeNode(35);

        root.left = new TreeNode(20);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<Integer> preorder = morriesPre(root);

        System.out.println(preorder);

    }


    private static List<Integer> morriesPre(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        while (root != null) {
            if (root.left == null) {
                list.add(root.val);
                root = root.right;
            } else {
                TreeNode prev = root.left;
                while (prev.right != null && prev.right != root) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    list.add(root.val);
                    prev.right = root;
                    root = root.left;
                } else {
                    prev.right = null;
                    root = root.right;
                }
            }
        }
        return list;
    }
}
