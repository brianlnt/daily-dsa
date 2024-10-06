package course.lecture.w1d6;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    /*
    88. Merge sorted array (https://leetcode.com/problems/merge-sorted-array/description/)
    Input A = {5, 8, 10, 15, 0, 0, 0}
          B = {2, 12, 25}
    Return  {2, 5, 8, 10, 12, 15, 25}
    1. No additional data structure allowed. What is the time complexity of your algorithm.
    2. Additional data structure allowed. What is the time complexity of your algorithm.
     */

    public static int[] merge1(int[] a, int[] b, int n, int m){
        int i = n - 1;
        int j = m - 1;
        int p = m+n-1;

        while(i > -1 && j > -1 && p > -1){
            if(a[i] > b[j]){
                a[p] = a[i--];
            } else {
                a[p] = b[j--];
            }
            p--;
        }

        //add remaining elements from B (this just happened on B)
        while(j > -1){
            a[p--] = b[j--];
        }

        return a;
        /*
        Time: O(m+n)
        Space: O(1)
         */
    }

    public static int[] merge2(int[] a, int[] b, int n, int m){
        int i = n - 1;
        int j = m - 1;
        int p = m+n-1;
        int[] mergeResult = new int[m+n];

        while(i > -1 && j > -1 && p > -1){
            if(a[i] > b[j]){
                mergeResult[p] = a[i--];
            } else {
                mergeResult[p] = b[j--];
            }
            p--;
        }

        //add remaining elements from A
        while(i > -1){
            mergeResult[p--] = a[i--];
        }

        //add remaining elements from B
        while(j > -1){
            mergeResult[p--] = b[j--];
        }

        for(int k = 0; k < p; k++){
            a[k] = mergeResult[k];
        }

        return a;
        /*
        Time: O(m+n)
        Space: O(1)
         */
    }

    public static void main(String[] args) {
        int[] A = {5, 8, 10, 15, 0, 0, 0};
        int n = 4;
        int[] B = {2, 12, 25};
        int m = 3;

        System.out.println(Arrays.toString(merge1(A,B,n,m)));
        System.out.println(Arrays.toString(merge2(A,B,n,m)));
    }
}
