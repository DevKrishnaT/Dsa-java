package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LowestCommonAncestor {
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
        TreeNode q = root.right;
        TreeNode ans = lowestCommonAncestor(root, p, q);
        System.out.println(ans.val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pathForP = new ArrayList<>();
        PathFinder(root, p, pathForP, new ArrayList<>());
        List<TreeNode> pathForQ = new ArrayList<>();
        PathFinder(root, q, pathForQ, new ArrayList<>());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (TreeNode i : pathForP) {
            map.put(i.val, 1);
        }


        while (!pathForQ.isEmpty()) {
            TreeNode curr = pathForQ.removeLast();

            if (map.containsKey(curr.val)) {
                return curr;
            }
        }
        

        return p;
    }

    private static void PathFinder(TreeNode root, TreeNode p, List<TreeNode> list, ArrayList<TreeNode> temp) {
        if (root == null) return;

        if (root.val == p.val) {
            temp.add(root);
            list.addAll(temp);
        }

        temp.add(root);
        PathFinder(root.left, p, list, temp);
        PathFinder(root.right, p, list, temp);
        temp.removeLast();

    }


}
