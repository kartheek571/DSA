package Searching;



public class BinarySearch {



    /**
     * Generic Binary Search method.
     * @param <T> The type of elements in the array, must implement Comparable
     * @param arr The array to search in
     * @param target The element to search for
     * @return The index of the target element if found, -1 otherwise
     */
    public static <T extends Comparable<T>> int binarySearching(T[] arr, T target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].compareTo(target) == 0) {

                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 2, 7, 5, 9};
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        int index1 = binarySearching(numbers, 7);
        int index2 = binarySearching(names, "Charlie");

        System.out.println("Index of 7: " + index1);  // Should print 3
        System.out.println("Index of 'Charlie': " + index2);  // Should print 2
    }
}
