package two_pointers.same_end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MoveZeros283{
    public static int[] moveZeroes1(int[] nums) {
        /*
         * Time: O(n)
         * Space: O(n)
         */
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeroCount += 1; 
        }
    
        List<Integer> nonZeroList = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) nonZeroList.add(nums[i]);
        }

        for(int i = 0; i < zeroCount; i++){
            nonZeroList.add(0);
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = nonZeroList.get(i);
        }

        return nums; 
    }

    public static int[] moveZeroes2(int[] nums) {

        /*
         * Time: O(n)
         * Space: O(1)
         */
        int nonZeroElementIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZeroElementIndex++] = nums[i];
            }
        }

        for(int i = nonZeroElementIndex; i < nums.length; i++){
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes1(new int[]{0,1,0,3,12})));
        System.out.println(Arrays.toString(moveZeroes2(new int[]{0,1,0,3,12})));
    }
}
