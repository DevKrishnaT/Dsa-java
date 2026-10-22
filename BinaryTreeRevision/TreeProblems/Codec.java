package BinaryTreeRevision.TreeProblems;

public class Codec {
    static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        String ans = serialize(root);
        System.out.println(ans);
        deserialize(ans);
    }

    static StringBuilder s = new StringBuilder();

    public static String serialize(TreeNode root) {
        if (root == null) {
            s.append("N" + " ");
            return s.toString();
        }

        s.append(root.value + " ");
        serialize(root.left);
        serialize(root.right);

        return s.toString();
    }

    static int index = 0;


    public static TreeNode deserialize(String data) {
        String[] nodes = data.split(" ");
        int[] index = {0};
        
        return deserializeHelper(nodes, index);
    }

    private static TreeNode deserializeHelper(String[] nodes, int[] index) {
        String node = nodes[index[0]++];

        if (node.equals("N")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(node));

        root.left = deserializeHelper(nodes, index);
        root.right = deserializeHelper(nodes, index);

        return root;
    }
}
