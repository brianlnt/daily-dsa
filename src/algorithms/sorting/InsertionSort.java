package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
    Pick and insert the smaller element into correct place by comparing the element with its previous element
    As the algorithm iterates through each element in the array, it treats the first part of the array as sorted.
    For each new element (temp), the algorithm looks at the sorted portion (elements before it) and shifts temp to the right until find the correct position for temp.
    The element is then "inserted" in that position, maintaining the order in the sorted portion.
     */
    public static void sort(int[] a){
        for(int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i - 1;
            while(j > -1 && temp < a[j]){
                a[j+1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,6,5,1,3};
        sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
