package BinaryTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MinTimeBurn {
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
        int target = root.left.val;
        int ans = minTime(root, target);
        System.out.println(ans);
    }

    private static int minTime(TreeNode root, int target) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        parents(root, null, parent);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        TreeNode targetNode = findTarget(root, target);
        q.add(targetNode);
        visited.add(targetNode);
        int dis = 0;
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                if (node.left != null && !visited.contains(node.left)) {
                    q.add(node.left);
                    visited.add(node.left);
                }
                if (node.right != null && !visited.contains(node.right)) {
                    q.add(node.right);
                    visited.add(node.right);
                }
                TreeNode per = parent.get(node);
                if (per != null && !visited.contains(per)) {
                    q.add(per);
                    visited.add(per);
                }
            }
            dis++;


        }
        return dis - 1;
    }

    private static TreeNode findTarget(TreeNode root, int target) {
        if (root == null) return null;

        if (root.val == target)
            return root;

        TreeNode left = findTarget(root.left, target);
        if (left != null) return left;

        return findTarget(root.right, target);
    }


    private static void parents(TreeNode root, TreeNode node, HashMap<TreeNode, TreeNode> parent) {
        if (root == null) return;
        parent.put(root, node);

        parents(root.left, root, parent);
        parents(root.right, root, parent);

    }
}
