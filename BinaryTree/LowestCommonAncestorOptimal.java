package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class LowestCommonAncestorOptimal {
    static TreeNode lowest;

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

        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        TreeNode ans = lowestCommonAncestorOPT(root, p, q);
        System.out.println(ans.val);
    }

    private static TreeNode lowestCommonAncestorOPT(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestorOPT(root.left, p, q);
        TreeNode right = lowestCommonAncestorOPT(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;


    }


    private static void FindPath(TreeNode root, TreeNode p, ArrayList<TreeNode> temp, ArrayList<TreeNode> pathForP) {
        if (root == null) return;

        if (root.val == p.val) {
            temp.add(root);
            pathForP.addAll(temp);
        }
        temp.add(root);
        FindPath(root.left, p, temp, pathForP);
        FindPath(root.right, p, temp, pathForP);
        temp.removeLast();
    }
}
