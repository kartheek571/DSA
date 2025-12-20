package Trees.BinaryTrees;

import Trees.BTree;
import Trees.TreeNode;

public class Serialization {

//    Recursive_Depth_First_Search Rdfs = new Recursive_Depth_First_Search();


    BTree tree = new BTree();
    TreeNode node= tree.createTree();
    int index =0;
//    Rdfs.preOrder(node);

    StringBuffer sb = new StringBuffer();
    public String preorderSerialization1()
    {
//        System.out.println("Root Node: " + (node == null ? "NULL" : node.getVal()));

        return  preorderSerialization(node);
    }


    public String preorderSerialization(TreeNode node)
    {
        if(node==null)
        {
            sb.append("#,");
            return sb.toString();
        }

        sb.append(node.getVal()+",");
        preorderSerialization(node.getLeft());
        preorderSerialization(node.getRight());

        return sb.toString();
    }

    public TreeNode Deserialization1(String sb)
    {
        String[] v =sb.split(",");
        index =0;
        return Deserialization( v);
    }
    public TreeNode Deserialization( String[] v)
    {
if(index>=v.length)
{
    return null;

}

String val = v[index++];
if(val.equals("#") )
{
    return null;
}
TreeNode node =new TreeNode(Integer.parseInt(val));
node.setLeft(Deserialization( v));
        node.setRight(Deserialization(v));

return node;

    }
}
