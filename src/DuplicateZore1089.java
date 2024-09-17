import java.util.Arrays;

public class DuplicateZore1089 {
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

    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicateZeros(new int[]{1,0,2,3,0,4,5,0})));
        System.out.println(Arrays.toString(duplicateZeros(new int[]{1,2,3})));
        System.out.println(Arrays.toString(duplicateZeros(new int[]{0,0,0,0,0,0,0,0})));
    }


}
