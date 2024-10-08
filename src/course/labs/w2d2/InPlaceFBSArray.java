package course.labs.w2d2;

import java.util.Arrays;

public class InPlaceFBSArray {
    public static void rearrangeFBSArray(int[] arr) {
        int n = arr.length;

        // Step 1: Sort the entire array
        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Step 2: In-place rearrangement using two pointers
        int[] result = new int[n];
        int start = 0;             // Pointer for the beginning of the sorted array
        int end = n - 1;           // Pointer for the end of the sorted array

        // Step 3: Place elements at even and odd positions
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Fill even index from the start pointer (lower values)
                result[i] = arr[start++];
            } else {
                // Fill odd index from the end pointer (higher values)
                result[i] = arr[end--];
            }
        }

        // Step 4: Copy the rearranged elements back into the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 19, 10, 7, 10, 15, 17, 14, 15};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Rearrange array to match FBS criteria
        rearrangeFBSArray(array);

        // Print the rearranged array
        System.out.println("Rearranged Array: " + Arrays.toString(array));
    }
}
