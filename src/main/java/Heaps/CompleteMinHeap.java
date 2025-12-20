package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompleteMinHeap {

    List<Integer> heap;

    public CompleteMinHeap() {
        heap = new ArrayList<>();
    }

    public void BuildHeap(ArrayList<Integer> A) {
        int n = A.size();
        heap.clear();
        heap.addAll(A);
        for (int i = n / 2 - 1; i >=0; i--) {
            heapifydown(heap, n, i);
        }
    }

    public void heapifydown(List<Integer> A, int n, int i) {
        int small = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && A.get(left) < A.get(small)) small = left;
        if (right < n && A.get(right) < A.get(small)) small = right;


        if (small != i) {
            swap(A, i, small);
            heapifydown(A, n, small);
        }


    }

    public void swap(List<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }


    public void insert(int val)
    {
         heap.add(val);
         heapifyup(heap.size()-1);
    }

    public void heapifyup(int i)
    {
        int p =(i-1)/2;

        if(i>0 && heap.get(i)<heap.get(p))
        {
            swap(heap , i , p);
            heapifyup(p);

        }

                /*
                *
                * 2*i+1=right
                * right-1/2
                *
                *
                * */
    }

    public int extractmin()
    {
        if(heap.isEmpty())
        {
             throw new IllegalStateException("the heap is empty");
        }

        int min = heap.get(0);
        int last= heap.remove(heap.size()-1);
        if(!heap.isEmpty())
        {
            heap.set(0, last);
            heapifydown(heap, heap.size(), 0  );
        }

         return min;
    }

public void print()
{
    System.out.println(heap);
}





    public static void main(String[] args) {
        int[] arr = {};

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 10, 3, 5, 1));

        CompleteMinHeap cp = new CompleteMinHeap();


        cp.BuildHeap(A);
        cp.insert(98);
        cp.insert(765);
cp.extractmin();
cp.print();;



    }


}
