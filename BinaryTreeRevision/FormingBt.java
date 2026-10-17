package BinaryTreeRevision;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
}

public class FormingBt {
    static void main(String[] args) {
        TreeNode obj = new TreeNode(1);
        obj.left = new TreeNode(2);
        obj.right = new TreeNode(3);
        
    }
}
