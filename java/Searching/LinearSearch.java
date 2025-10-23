package Searching;

public class LinearSearch {
    
    /**
     * Performs a linear search on an array to find the target element.
     * @param <T> The type of elements in the array, must implement Comparable
     * @param arr The array to search in
     * @param target The element to search for
     * @return The index of the target element if found, -1 otherwise
     */
    public static <T extends Comparable<T>> int search(T[] arr, T target) {
        if (arr == null || target == null) {
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(target) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    // Example usage
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 2, 7, 5, 9};
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        
        int index1 = search(numbers, 7);
        int index2 = search(names, "Charlie");
        
        System.out.println("Index of 7: " + index1);  // Should print 3
        System.out.println("Index of 'Charlie': " + index2);  // Should print 2
    }
}
