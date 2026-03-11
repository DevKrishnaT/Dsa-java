package BinaryTree;

import java.util.*;

public class RightView {
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

        root.left.left = new TreeNode(4);

        root.left.left.left = new TreeNode(5);
        List<Integer> result = rightSideView(root);
        System.out.println(result);
    }

    private static List<Integer> rightSideView(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<pair> queue = new LinkedList<>();
        queue.offer(new pair(0, root));
        while (!queue.isEmpty()) {
            pair p = queue.poll();

            if (!map.containsKey(Math.abs(p.hight))) {
                map.put(Math.abs(p.hight), p.node.val);
            }
            if (p.node.right != null) {
                queue.add(new pair(p.hight + 1, p.node.right));
            }

            if (p.node.left != null) {
                queue.add(new pair(p.hight - 1, p.node.left));
            }


        }

        return new ArrayList<>(map.values());
    }

}
