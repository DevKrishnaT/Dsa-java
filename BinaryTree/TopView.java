package BinaryTree;

import java.util.*;

public class TopView {
    static class pair {
        int hight;
        TreeNode node;

        pair(int hight, TreeNode node) {
            this.hight = hight;
            this.node = node;
        }
    }

    static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        root.left.right.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        root.left.right.left.left = new TreeNode(9);
        root.right.left.right.right = new TreeNode(10);
        List<Integer> ans = topView(root);
        System.out.println(ans);
    }

    private static List<Integer> topView(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<pair> queue = new LinkedList<>();
        queue.offer(new pair(0, root));
        while (!queue.isEmpty()) {
            pair p = queue.poll();

            if (!map.containsKey(p.hight)) {
                map.put(p.hight, p.node.val);
            }

            if (p.node.left != null) {
                queue.add(new pair(p.hight - 1, p.node.left));
            }
            if (p.node.right != null) {
                queue.add(new pair(p.hight + 1, p.node.right));
            }
        }

        return new ArrayList<>(map.values());
    }


}
