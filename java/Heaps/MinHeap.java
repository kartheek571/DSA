package Heaps;


/**
 * Problem Statement:
 * Implement a min heap data structure and write a function to build a min heap from a given array of integers.
 * The function should return the min heap as an array of integers.
 * The min heap should be built in-place, i.e., the input array should be modified to form a min heap.
 * Edge cases should be handled, e.g., an empty array or an array with a single element should be handled correctly.
 */
class Solution {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(buildHeap(A));
    }



    public  static int[] buildHeap(int[] A) {
        int n=A.length;
        for(int i=n/2-1;i>=0;i--) {
            downHeapify(A, n, i);
        }
        return A;
    }

    public  static void downHeapify (int[] A, int n, int i) {
        int s=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && A[l]<A[s])
        {
            s=l;
        }
        if(r<n && A[r]<A[s])
        {
            s=r;
        }
        if(s!=i)
        {
            int temp=A[i];
            A[i]=A[s];
            A[s]=temp;
            downHeapify(A, n ,s);
        }
    }
}
