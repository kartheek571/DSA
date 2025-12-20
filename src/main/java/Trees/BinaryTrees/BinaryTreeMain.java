package Trees.BinaryTrees;

import Trees.BTree;
import Trees.TreeNode;

public class BinaryTreeMain {
    public static void main(String[] args) {

        Recursive_Depth_First_Search Rdfs = new Recursive_Depth_First_Search();
        Serialization s= new Serialization();
        System.out.println(s.preorderSerialization1()) ;
        Rdfs.inOrder(s.Deserialization1(s.preorderSerialization1()));
//        Rdfs.preOrder(Rdfs.root);
//        System.out.println();
//        System.out.println("-----------------------------------------------");
//        Rdfs.inOrder(Rdfs.root);
//        System.out.println();
//        System.out.println("-----------------------------------------------");
//         Rdfs.postOrder(Rdfs.root);
//        System.out.println();
//// hello
//
//        System.out.println("-----------------------------------------------");
//         Iterartive_Depth_First_Search Idfs = new Iterartive_Depth_First_Search();
//
//         Idfs.preOrder(Idfs.root);
//         System.out.println();
//         System.out.println("-----------------------------------------------");
//         Idfs.inOrder(Idfs.root);
//         System.out.println();
//         System.out.println("-----------------------------------------------");
//         Idfs.postOrder(Idfs.root);
//         System.out.println();
//         BFSinBt  e= new BFSinBt();
//         e.levelOrder();


//        Rdfs.inOrder(s.Deserialization1(s.preorderSerialization1()));

    }
}
