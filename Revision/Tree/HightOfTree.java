package Revision.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HightOfTree {
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(12);
        int ans = intrative(root);
        System.out.println(ans);
    }

    private static int intrative(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        int hight = 0;
        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                TreeNode curr = q.poll();

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            hight++;

        }
        return hight;
    }


}
