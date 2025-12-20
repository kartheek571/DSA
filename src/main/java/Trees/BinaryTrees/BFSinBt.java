package Trees.BinaryTrees;

import Trees.*;
import java.util.Queue;
import java.util.LinkedList;

public class BFSinBt {
    private BTree x = new BTree();
    TreeNode  root= x.createTree();
     Queue<TreeNode> q = new LinkedList<>();

     public void levelOrder()
     {
         if(root ==null)  return ;

         q.add(root);

         while (!q.isEmpty())
         {
             if(q.peek().getLeft() != null) q.add(q.peek().getLeft());
             if(q.peek().getRight() != null) q.add(q.peek().getRight());
             System.out.print(q.remove().getVal()+" ");
         }


     }

}
