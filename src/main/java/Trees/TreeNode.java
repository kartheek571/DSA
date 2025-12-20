package Trees;

public class TreeNode {

    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode setLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    public TreeNode setRight(TreeNode right) {
        this.right = right;
        return this;
    }

    public TreeNode setVal(int val) {
        this.val = val;
        return this;
    }

    public TreeNode(int val) {
        this.val = val;
    }


    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public int getVal() {
        return val;
    }
}
