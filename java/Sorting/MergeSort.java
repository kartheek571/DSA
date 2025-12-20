package Sorting;

import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        String[] names = {"Charlie", "Alice", "Bob", "David"};
        mergeSort(names, 0, names.length - 1);
        System.out.println(Arrays.toString(names));
    }

    // Generic merge sort
    public static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        mergeInPlace(arr, left, mid, right);
    }

    // In-place merge without extra array
    private static <T extends Comparable<T>> void mergeInPlace(T[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                i++;  // correct order, move left pointer
            } else {
                // arr[j] < arr[i], need to rotate
                T temp = arr[j];
                // shift all elements from i to j-1 one step to the right
                for (int k = j; k > i; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[i] = temp;

                // update pointers
                i++;
                mid++;  // mid moves because we inserted an element in left half
                j++;
            }
        }
    }
}
