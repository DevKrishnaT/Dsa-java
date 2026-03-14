package BinaryTree;

import java.util.*;

public class NodeAtDisK {
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
        TreeNode target = root.left;
        int k = 2;
        List<Integer> ans = distanceK(root, target, k);
        System.out.println(ans);
    }

    private static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        parentFinder(root, null, parent);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        q.offer(target);
        visited.add(target);
        int dis = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            if (dis == k) break;
            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                if (node.left != null && !visited.contains(node.left)) {
                    visited.add(node.left);
                    q.offer(node.left);
                }

                if (node.right != null && !visited.contains(node.right)) {
                    visited.add(node.right);
                    q.offer(node.right);
                }

                TreeNode par = parent.get(node);
                if (par != null && !visited.contains(par)) {
                    visited.add(par);
                    q.offer(par);
                }
            }
            dis++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            result.add(q.poll().val);
        }
        return result;

    }

    private static void parentFinder(TreeNode root, TreeNode node, Map<TreeNode, TreeNode> parent) {
        if (root == null) return;

        parent.put(root, node);

        parentFinder(root.left, root, parent);
        parentFinder(root.right, root, parent);
    }
}
