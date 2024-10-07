package technique.sorting;

import java.util.Arrays;

public class QuickSort {
    public static int pivot(int[] a, int pivotIndex, int endIndex){

        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i < endIndex + 1; i++){
            if(a[i] < a[pivotIndex]){
                swapIndex++;
                swap(a, swapIndex, i);
            }
        }
        swap(a, pivotIndex, swapIndex);

        return swapIndex;
    }

    public static void sort_helper(int[] a, int left, int right){
        if(left < right) {
            int pivotIndex = pivot(a, left, right);
            sort_helper(a, left, pivotIndex - 1);
            sort_helper(a, pivotIndex + 1, right);
        }
    }

    public static void sort(int[] a){
        sort_helper(a, 0, a.length - 1);
    }

    public static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 1, 7, 3, 2, 5};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
