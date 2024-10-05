package technique.sorting;

import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static int[] sort(int[] a){
        if(a.length == 1) return a;

        int mid = a.length / 2;
        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - mid];

        for(int i = 0; i < mid; i++){
            left[i] = a[i];
        }
        for(int i = mid, j = 0; i < a.length && j < right.length; i++, j++){
            right[j] = a[i];
        }
        left = sort(left);
        right = sort(right);
        return merge(left, right);
    }

    private static int[] merge(int[] a, int[] b){
        int[] mergeResult = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                mergeResult[k] = a[i++];
            } else {
                mergeResult[k] = b[j++];
            }
            k++;
        }

        while(i < a.length){
            mergeResult[k++] = a[i++];
        }

        while(j < b.length){
            mergeResult[k++] = b[j++];
        }

        return mergeResult;
    }
    public static void main(String[] args) {
        int[] a = {4,2,6,5,1,3};
        System.out.println(Arrays.toString(sort(a)));

    }
}
