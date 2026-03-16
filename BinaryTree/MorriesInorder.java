package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MorriesInorder {
    static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        List<Integer> ans = morriesInorder(root);
        System.out.println(ans);

    }

    private static List<Integer> morriesInorder(TreeNode root) {
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
                if (prev.right == root) {
                    prev.right = null;
                    list.add(root.val);
                    root = root.right;
                } else {
                    prev.right = root;
                    root = root.left;
                }

            }
        }
        return list;
    }


}
