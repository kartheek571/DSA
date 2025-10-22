package Trees.BinaryTrees;

import Trees.BTree;
import Trees.TreeNode;

import java.util.Stack;

public class Iterartive_Depth_First_Search {


    BTree tree = new BTree();

    TreeNode root = tree.createTree();


    public void  preOrder(TreeNode root)
    {
       Stack<TreeNode> s= new Stack<>();
       s.push(root);
       while(!s.isEmpty())
       {
           TreeNode c= s.pop();
           System.out.print(c.getVal()+" ");
           if(c.getRight()!=null) s.push(c.getRight());
           if(c.getLeft()!=null) s.push(c.getLeft());

       }

    }


    public void inOrder(TreeNode root)
    {
        Stack<TreeNode> s= new Stack<>();
        TreeNode c= root;
        while(c!=null || !s.isEmpty())
        {
            while(c!=null)
            {
                s.push(c);
                c=c.getLeft();

            }
            c=s.pop();
            System.out.print(c.getVal()+" ");
            c=c.getRight();
        }
    }

    public void postOrder(TreeNode root)
    {
        Stack<TreeNode> s= new Stack<>();
        Stack<TreeNode> a= new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {// git comit test
            TreeNode c= s.pop();
            a.push(c);
            if(c.getLeft()!=null) s.push(c.getLeft());
            if(c.getRight()!=null) s.push(c.getRight());

        }

        while(!a.isEmpty())
        {
            TreeNode c= a.pop();
            System.out.print(c.getVal()+" ");
        }

    }
}
