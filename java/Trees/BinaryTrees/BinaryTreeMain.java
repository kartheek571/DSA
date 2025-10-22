package Trees.BinaryTrees;

public class BinaryTreeMain {
    public static void main(String[] args) {

        Recursive_Depth_First_Search Rdfs = new Recursive_Depth_First_Search();
        Rdfs.preOrder(Rdfs.root);
        System.out.println();
        System.out.println("-----------------------------------------------");
        Rdfs.inOrder(Rdfs.root);
        System.out.println();
        System.out.println("-----------------------------------------------");
         Rdfs.postOrder(Rdfs.root);
        System.out.println();
// hello

        System.out.println("-----------------------------------------------");
         Iterartive_Depth_First_Search Idfs = new Iterartive_Depth_First_Search();

         Idfs.preOrder(Idfs.root);
         System.out.println();
         System.out.println("-----------------------------------------------");
         Idfs.inOrder(Idfs.root);
         System.out.println();
         System.out.println("-----------------------------------------------");
         Idfs.postOrder(Idfs.root);
         System.out.println();
    }
}
