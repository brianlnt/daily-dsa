package technique.two_pointers.same_end;

import java.util.Arrays;

public class DuplicateZero1089 {
    public static int[] duplicateZeros(int[] arr) {
        /*
         * Time: O(n)
         * Space: O(n)
         */
        int[] newArr = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if( j < newArr.length){
                newArr[j] = arr[i];
                if(arr[i] == 0 && j < newArr.length - 1){
                    j++;
                    newArr[j] = 0; 
                }
                j++;
            } else {
                break;
            }  
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = newArr[i];
        }

        return arr;
    }

    public static int[] duplicateZeros1(int[] arr) {
        /*
         * Time: O(n)
         * Space: O(1)
         */
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included  
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }

        return arr;
    }

    public static int[] duplicateZeros2(int[] arr) {
        int possibleDups = 0;
        int maxIndex = arr.length - 1;

        for(int left = 0; left <= maxIndex - possibleDups; left++){
            if(arr[left] == 0){
                possibleDups++;
            }
        }

        int last = maxIndex - possibleDups;
        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicateZeros2(new int[]{1,0,2,3,0,4,5,0})));
        System.out.println(Arrays.toString(duplicateZeros2(new int[]{1,2,3})));
        System.out.println(Arrays.toString(duplicateZeros2(new int[]{0,0,0,0,0,0,0,0})));
        System.out.println(Arrays.toString(duplicateZeros2(new int[]{8,4,5,0,0,0,0,7})));
    }


}
