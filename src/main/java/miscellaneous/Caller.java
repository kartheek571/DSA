package miscellaneous;

public class Caller {

    public static void main(String[] args)
    {
        Kth_Smallest_element k = new Kth_Smallest_element();
        int[] arr = {99, 2, 272, 72, 9, 0};
        System.out.println(k.KthSmallestElement(arr, 5))  ;
        Noble_Integer n= new Noble_Integer();

        int[] x={3, 2, 1, 3};
        System.out.println(n.findNoble(arr));
    }
}
