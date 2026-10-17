package BinaryTreeRevision.Treversal;

public class AllOrderTraversal {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        System.out.print("preOrder :- ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("inOrder :- ");
        inOrderTraversal(root);
        System.out.println();
        System.out.print("PostOrder :- ");
        postOrderTraversal(root);
    }

    private static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    private static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderTraversal(root.left);
        System.out.print(root.value + " ");
        preOrderTraversal(root.right);
    }

    private static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
