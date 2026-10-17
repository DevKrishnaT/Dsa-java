package BinaryTreeRevision.Treversal;

import java.util.Stack;

public class UsingStack {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        preorderItrative(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

    private static void preorderItrative(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            System.out.print(curr.value + " ");


            if (curr.right != null) {
                st.push(curr.right);
            }

            if (curr.left != null) {
                st.push(curr.left);
            }
        }
    }

    private static void inOrder(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !st.isEmpty()) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            System.out.print(curr.value + " ");

            curr = curr.right;
        }
    }

    private static void postOrder(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {

            TreeNode curr = s1.pop();
            s2.push(curr);

            if (curr.left != null) {
                s1.push(curr.left);
            }

            if (curr.right != null) {
                s2.push(curr.right);
            }

        }
        while (!s2.isEmpty()) {
            System.out.print(s2.pop().value + " ");
        }

    }
}
