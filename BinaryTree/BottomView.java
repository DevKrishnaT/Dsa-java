package BinaryTree;

import java.util.*;

public class BottomView {
    static void main(String[] args) {
        TreeNode root = new TreeNode(20);

        root.left = new TreeNode(8);
        root.right = new TreeNode(22);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);

        root.right.right.left = new TreeNode(28);
        List<Integer> result = bottomView(root);
        System.out.println(result);
    }

    private static List<Integer> bottomView(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<TopView.pair> queue = new LinkedList<>();
        queue.offer(new TopView.pair(0, root));
        while (!queue.isEmpty()) {
            TopView.pair p = queue.poll();


            map.put(p.hight, p.node.val);


            if (p.node.left != null) {
                queue.add(new TopView.pair(p.hight - 1, p.node.left));
            }
            if (p.node.right != null) {
                queue.add(new TopView.pair(p.hight + 1, p.node.right));
            }


        }

        return new ArrayList<>(map.values());
    }

}
