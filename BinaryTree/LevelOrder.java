package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNodeL {
    int val;
    TreeNodeL left;
    TreeNodeL right;

    TreeNodeL(int val) {
        this.val = val;
        this.left = null;
        this.right = null;

    }

}

public class LevelOrder {
    static void main(String[] args) {
        TreeNodeL root = new TreeNodeL(3);
        root.left = new TreeNodeL(9);
        root.right = new TreeNodeL(20);
        root.left.left = new TreeNodeL(10);
        root.left.right = new TreeNodeL(11);
        root.left.left.left = new TreeNodeL(40);
        root.left.left.right = new TreeNodeL(91);

        root.right.left = new TreeNodeL(15);
        root.right.right = new TreeNodeL(7);
        List<List<Integer>> ans = levelOrder(root);
        System.out.println(ans);
    }


    private static List<List<Integer>> levelOrder(TreeNodeL root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNodeL> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNodeL current = queue.poll();
                level.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);


                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            list.add(level);
        }
        return list;
    }


}
