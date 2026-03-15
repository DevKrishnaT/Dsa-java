package BinaryTree;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SerializeDeserialize {

    static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(-1000);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        int[] a = {1, 2, 3, 4, 5, 6};

        String ans = serialize(root);
        TreeNode Tree = deserialize(ans);
        System.out.println(Tree.val);
        System.out.println(Tree.left.val);
        System.out.println(Tree.right.val);
    }

    private static TreeNode deserialize(String ans) {
        String[] parts = ans.split(" ");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        index = 0;


        return construct(nums);
        
    }

    static int index = 0;

    private static TreeNode construct(int[] nums) {
        if (index >= nums.length || nums[index] == 1001) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(nums[index++]);

        root.left = construct(nums);
        root.right = construct(nums);

        return root;

    }

    static StringBuilder s = new StringBuilder();


    private static String serialize(TreeNode root) {
        if (root == null) {
            s.append("1001" + " ");
            return s.toString();
        }

        s.append(root.val).append(" ");
        serialize(root.left);
        serialize(root.right);


        return s.toString();
    }

}
