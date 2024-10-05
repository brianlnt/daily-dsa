package technique.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            int min_index = i;
            for(int j = i+1; j < a.length; j++){
                if(a[min_index] > a[j]){
                    min_index = j;
                }
            }
            if(i != min_index){
                int temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,6,5,1,3};
        sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
