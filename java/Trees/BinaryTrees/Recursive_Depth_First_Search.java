package Trees.BinaryTrees;
import Trees.*;

public class Recursive_Depth_First_Search {
    BTree tree = new BTree();

    TreeNode root = tree.createTree();

    public void   preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.getVal()+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getVal()+" ");
        inOrder(root.getRight());
    }

    public void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getVal()+" ");
    }

}
