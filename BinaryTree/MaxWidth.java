package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode n, long i) {
            node = n;
            index = i;
        }
    }

    static void main(String[] args) {

    }

    public int widthOfBinaryTree(TreeNode root) {

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {

            int size = q.size();
            long start = q.peek().index;

            long first = 0;
            long last = 0;

            for (int i = 0; i < size; i++) {

                Pair p = q.poll();
                long idx = p.index - start;

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                if (p.node.left != null)
                    q.offer(new Pair(p.node.left, 2 * idx));

                if (p.node.right != null)
                    q.offer(new Pair(p.node.right, 2 * idx + 1));
            }

            maxWidth = Math.max(maxWidth, (int) (last - first + 1));
        }

        return maxWidth;
    }
}
